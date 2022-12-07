package br.com.drogariaorigem.controller.parameters.dto

import br.com.drogariaorigem.domain.shared.model.vo.CreateChargeCategoryRequest
import br.com.drogariaorigem.domain.shared.model.vo.SubCategoryRequest

class CreateChargeCategoryDTO(
    private val description: String,
    private val identifierNumber: String,
    private val subCategories: List<CreateChargeSubCategoryDTO>?
){
    fun toModel(id: Long?): CreateChargeCategoryRequest {
        val subCategories = this.subCategories?.map {
            var id: Long? = null
            if (it.id > 0) { id = it.id}
            SubCategoryRequest(
                id = id,
                description = it.description,
                identifierNumber = it.identifierNumber
            )
        }
        return CreateChargeCategoryRequest(
            id = id,
            description = description,
            identifierNumber = identifierNumber,
            subCategories = subCategories
        )
    }
}

class CreateChargeSubCategoryDTO(
    val id: Long,
    val description: String,
    val identifierNumber: String
)