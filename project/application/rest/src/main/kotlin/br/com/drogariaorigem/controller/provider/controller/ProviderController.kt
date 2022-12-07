package br.com.drogariaorigem.controller.provider.controller

import br.com.drogariaorigem.controller.provider.dto.CreateProviderDTO
import br.com.drogariaorigem.domain.ports.domain.ProviderPort
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/providers")
@RestController
class ProviderController(
        val providerPort: ProviderPort
) {

    @GetMapping
    fun listAll() = providerPort.listAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = providerPort.findById(id)

    @PostMapping
    fun create(@RequestBody provider: CreateProviderDTO) = providerPort.create(provider.toModel())

    @DeleteMapping("/{id}")
    fun remove(@PathVariable id: Long) = ResponseEntity.ok(providerPort.remove(id))

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody provider: CreateProviderDTO) = providerPort.update(id, provider.toModel())

}