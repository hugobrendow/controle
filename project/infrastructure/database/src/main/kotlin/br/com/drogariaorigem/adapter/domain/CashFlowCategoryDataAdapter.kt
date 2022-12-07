package br.com.drogariaorigem.adapter.domain

import br.com.drogariaorigem.domain.ports.infrastructure.CashFlowCategoryDataPort
import br.com.drogariaorigem.domain.shared.exception.CashFlowCategoryException
import br.com.drogariaorigem.domain.shared.model.parameters.CashFlowCategory
import br.com.drogariaorigem.repository.CashFlowCategoryRepository
import usecases.DataAccessAdapter

@DataAccessAdapter
class CashFlowCategoryDataAdapter(
        private val cashFlowCategoryRepository: CashFlowCategoryRepository,
) : CashFlowCategoryDataPort {
    override fun findById(id: Long): CashFlowCategory =
            cashFlowCategoryRepository.findById(id).orElseThrow { CashFlowCategoryException(id) }.toModel()
}