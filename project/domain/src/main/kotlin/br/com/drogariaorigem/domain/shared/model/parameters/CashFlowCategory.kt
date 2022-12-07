package br.com.drogariaorigem.domain.shared.model.parameters

import br.com.drogariaorigem.domain.shared.model.enums.CashFlowCategoryTypeEnum

data class CashFlowCategory(
        val id: Long,
        val description: String,
        val identifierId: String,
        val type: CashFlowCategoryTypeEnum
)