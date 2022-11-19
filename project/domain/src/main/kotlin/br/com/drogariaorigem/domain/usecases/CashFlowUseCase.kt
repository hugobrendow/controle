package br.com.drogariaorigem.domain.usecases

import br.com.drogariaorigem.domain.ports.domain.CashFlowPort
import br.com.drogariaorigem.domain.ports.infrastructure.CashFlowCategoryDataPort
import br.com.drogariaorigem.domain.ports.infrastructure.CashFlowDataPort
import br.com.drogariaorigem.domain.usecases.model.CashFlow
import br.com.drogariaorigem.domain.usecases.model.vo.CashFlowRequest
import usecases.UseCase

@UseCase
class CashFlowUseCase(
        private val cashFlowAdapter: CashFlowDataPort,
        private val cashFlowCategoryAdapter: CashFlowCategoryDataPort,
) : CashFlowPort {

    override fun create(cashFlow: CashFlowRequest): CashFlow {
        val category = cashFlowCategoryAdapter.findById(cashFlow.category)
        return cashFlowAdapter.save(cashFlow.toModel(category, null))
    }

    override fun update(id: Long, cashFlowRequest: CashFlowRequest): CashFlow {
        val cashFlow = cashFlowAdapter.findById(id)

        var category = cashFlow.category
        if (cashFlow.category.id != cashFlowRequest.category) {
            category = cashFlowCategoryAdapter.findById(cashFlowRequest.category)
        }

        val updateCashFlow = cashFlowRequest.toModel(category, cashFlow.id)
        return cashFlowAdapter.save(updateCashFlow)
    }

    override fun listAll() = cashFlowAdapter.findAll()

    override fun findById(id: Long) = cashFlowAdapter.findById(id)
}