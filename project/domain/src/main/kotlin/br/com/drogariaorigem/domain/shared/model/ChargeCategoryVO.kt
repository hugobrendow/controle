package br.com.drogariaorigem.domain.shared.model

data class ChargeCategoryVO(
    val id: Long?,
    val description: String,
    val identifierNumber: String,
    val subCategories: List<ChargeSubCategoryVO>?
)