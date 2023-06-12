package br.com.drogariaorigem.controller.parameters.controller

import br.com.drogariaorigem.controller.parameters.dto.CreateChargeCategoryDTO
import br.com.drogariaorigem.controller.provider.dto.CreateProviderDTO
import br.com.drogariaorigem.domain.ports.domain.ChargeCategoryPort
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/charges/category")
@RestController
class ChargeCategoryController(val port: ChargeCategoryPort) {

    @GetMapping
    fun listAll() = port.listAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = port.findById(id)

    @PostMapping
    fun create(@RequestBody charge: CreateChargeCategoryDTO) = port.save(charge.toModel(null))

    @DeleteMapping("/{id}")
    fun remove(@PathVariable id: Long) = ResponseEntity.ok(port.remove(id))

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody charge: CreateChargeCategoryDTO) = port.update(id, charge.toModel(id))
}