package br.com.drogariaorigem.domain.usecases.model.parameters

import br.com.drogariaorigem.domain.usecases.model.enums.CashFlowCategoryTypeEnum

data class CashFlowCategory(
        val id: Long,
        val description: String,
        val identifierId: String,
        val type: CashFlowCategoryTypeEnum
)