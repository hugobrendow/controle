package br.com.drogariaorigem.domain.shared.model.vo

import br.com.drogariaorigem.domain.shared.model.ChargeCategoryVO
import br.com.drogariaorigem.domain.shared.model.ChargeSubCategoryVO

class CreateChargeCategoryRequest(
    private val id: Long?,
    private val description: String,
    private val identifierNumber: String,
    private val subCategories: List<SubCategoryRequest>?
) {
    fun toModel(id: Long?): ChargeCategoryVO {
        val subCategories = this.subCategories?.map {
            ChargeSubCategoryVO(
                id = it.id,
                description = it.description,
                identifierNumber = it.identifierNumber
            )
        }

        return ChargeCategoryVO(
            id = id,
            description = description,
            identifierNumber = identifierNumber,
            subCategories = subCategories
        )
    }
}

class SubCategoryRequest(
    val id: Long?,
    val description: String,
    val identifierNumber: String
)