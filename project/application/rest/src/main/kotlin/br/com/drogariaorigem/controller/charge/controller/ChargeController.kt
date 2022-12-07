package br.com.drogariaorigem.controller.charge.controller

import br.com.drogariaorigem.controller.charge.dto.CreateChargeDTO
import br.com.drogariaorigem.domain.ports.domain.ChargePort
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/charges")
class ChargeController(val chargePort: ChargePort) {

    @GetMapping
    fun listAll() = chargePort.listAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = chargePort.findById(id)

    @PostMapping
    fun create(@RequestBody charge: CreateChargeDTO) = chargePort.create(charge.toModel(null))

//    @PutMapping("/{id}")
//    fun update(@PathVariable id: Long, @RequestBody cashFlow: CreateCashFlowDTO) = chargePort.update(id, cashFlow.toModel())

}