package br.com.drogariaorigem.controller.cashflow.controller

import br.com.drogariaorigem.controller.cashflow.dto.CreateCashFlowDTO
import br.com.drogariaorigem.domain.ports.domain.CashFlowPort
import org.springframework.web.bind.annotation.*

@RequestMapping("/cash-flow")
@RestController
class CashFlowController(
        val cashFlowPort: CashFlowPort
) {

    @GetMapping
    fun listAll() = cashFlowPort.listAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = cashFlowPort.findById(id)

    @PostMapping
    fun create(@RequestBody cashFlow: CreateCashFlowDTO) = cashFlowPort.create(cashFlow.toModel())

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody cashFlow: CreateCashFlowDTO) = cashFlowPort.update(id, cashFlow.toModel())

}