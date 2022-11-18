package br.com.drogariaorigem.dbo.parameters

import javax.persistence.*

@Entity
@Table(name = "charge_category")
data class ChargeCategoryDBO(
        @Id
        @GeneratedValue
        private val id: Long,
        private val description: String,
        private val identifierNumber: String,
        @ManyToOne
        private val subCategoryDBO: ChargeSubCategoryDBO
)