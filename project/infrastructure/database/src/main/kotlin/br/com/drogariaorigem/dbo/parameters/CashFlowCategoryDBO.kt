package br.com.drogariaorigem.dbo.parameters

import br.com.drogariaorigem.domain.usecases.model.enums.CashFlowCategoryTypeEnum
import br.com.drogariaorigem.domain.usecases.model.parameters.CashFlowCategory
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "moviment_category")
data class CashFlowCategoryDBO(
        @Id
        @GeneratedValue
        private val id: Long,
        private val description: String,
        private val identifierId: String,
        private val type: CashFlowCategoryTypeEnum
) {
        fun toModel() = CashFlowCategory(
                id = id,
                description = description,
                identifierId = identifierId,
                type = type
        )
}

fun CashFlowCategory.toDBO() = CashFlowCategoryDBO(
        id = id,
        description = description,
        identifierId = identifierId,
        type = type
)