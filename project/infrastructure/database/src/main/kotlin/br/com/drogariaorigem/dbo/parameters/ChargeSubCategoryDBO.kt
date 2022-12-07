package br.com.drogariaorigem.dbo.parameters

import br.com.drogariaorigem.domain.shared.model.ChargeSubCategoryVO
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "charge_sub_category")
data class ChargeSubCategoryDBO(
    @Id
    @GeneratedValue val id: Long?,
    val description: String,
    val identifierNumber: String
) {
    fun toModel() = ChargeSubCategoryVO(id = id, description = description, identifierNumber = identifierNumber)
}

fun ChargeSubCategoryVO.toDBO() = ChargeSubCategoryDBO(
    id = id,
    description = description,
    identifierNumber = identifierNumber
)