package br.com.drogariaorigem.dbo.parameters

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "charge_sub_category")
data class ChargeSubCategoryDBO(
        @Id
        @GeneratedValue
        private val id: Long,
        private val description: String,
        private val identifierNumber: String
)