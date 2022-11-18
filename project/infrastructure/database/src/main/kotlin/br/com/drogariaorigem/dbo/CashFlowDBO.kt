package br.com.drogariaorigem.dbo

import br.com.drogariaorigem.dbo.enum.CashFlowStatusEnum
import br.com.drogariaorigem.dbo.parameters.CashFlowCategoryDBO
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "cash_flow")
data class CashFlowDBO(
        @Id
        @GeneratedValue
        private val id: Long,
        private val date: LocalDate,
        private val totalValue: Double,
        private val totalDebit: Double,
        private val totalCredit: Double,
        private val totalInstallmentsCredit: Double,
        private val totalMoney: Double,
        private val totalConvention: Double,
        private val liquidCard: Double,
        private val observation: String,
        private val status: CashFlowStatusEnum,
        @ManyToOne
        private val category: CashFlowCategoryDBO
)