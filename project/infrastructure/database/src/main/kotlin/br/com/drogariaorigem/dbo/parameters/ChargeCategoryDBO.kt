package br.com.drogariaorigem.dbo.parameters

import br.com.drogariaorigem.domain.shared.model.ChargeCategoryVO
import br.com.drogariaorigem.domain.shared.model.ChargeSubCategoryVO
import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import javax.persistence.*

@Entity
@Table(name = "charge_category")
data class ChargeCategoryDBO(
    @Id
    @GeneratedValue
    val id: Long?,
    val description: String,
    val identifierNumber: String,
    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private val subCategories: List<ChargeSubCategoryDBO>?,
) {


    fun toModel(): ChargeCategoryVO {
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

fun ChargeCategoryVO.toDBO(): ChargeCategoryDBO {
    val subCategories = this.subCategories?.map {
        ChargeSubCategoryDBO(
            id = it.id,
            description = it.description,
            identifierNumber = it.identifierNumber
        )
    }
    return ChargeCategoryDBO(
        id = id,
        description = description,
        identifierNumber = identifierNumber,
        subCategories = subCategories
    )
}