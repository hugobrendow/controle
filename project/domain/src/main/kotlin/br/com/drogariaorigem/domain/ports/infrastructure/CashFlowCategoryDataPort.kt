package br.com.drogariaorigem.domain.ports.infrastructure

import br.com.drogariaorigem.domain.shared.model.parameters.CashFlowCategory

interface CashFlowCategoryDataPort {
    fun findById(id: Long) : CashFlowCategory
}