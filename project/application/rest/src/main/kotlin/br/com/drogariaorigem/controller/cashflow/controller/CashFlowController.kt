package br.com.drogariaorigem.controller.cashflow.controller

import br.com.drogariaorigem.controller.cashflow.dto.CreateCashFlowDTO
import br.com.drogariaorigem.domain.ports.domain.CashFlowPort
import org.springframework.web.bind.annotation.*

@RequestMapping("/cash-flows")
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

    @PostMapping("/batch")
    fun batchCreate(@RequestBody cashFlow: List<CreateCashFlowDTO>) = cashFlowPort.batchCreate(cashFlow.map { it.toModel() })

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody cashFlow: CreateCashFlowDTO) = cashFlowPort.update(id, cashFlow.toModel())

}