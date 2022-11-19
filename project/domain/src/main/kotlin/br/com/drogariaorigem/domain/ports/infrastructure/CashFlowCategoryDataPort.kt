package br.com.drogariaorigem.domain.ports.infrastructure

import br.com.drogariaorigem.domain.usecases.model.parameters.CashFlowCategory

interface CashFlowCategoryDataPort {
    fun findById(id: Long) : CashFlowCategory
}