package br.com.drogariaorigem.dbo.parameters

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
        private val identifierId: String
)