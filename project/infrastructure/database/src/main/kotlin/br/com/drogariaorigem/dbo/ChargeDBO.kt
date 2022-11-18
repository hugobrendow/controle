package br.com.drogariaorigem.dbo

import br.com.drogariaorigem.dbo.parameters.ChargeCategoryDBO
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "charge")
data class ChargeDBO(
        @Id
        @GeneratedValue
        private val id: Long,
        private val invoice: String,
        private val date: LocalDate,
        private val amountValue: Double,
        private val liquidValue: Double,
        private val complementInvoice: String,
        @OneToMany
        private val installments: List<InstallmentDBO>,
        @ManyToOne
        private val category: ChargeCategoryDBO
)