package br.com.drogariaorigem.dbo

import br.com.drogariaorigem.dbo.parameters.CashFlowCategoryDBO
import br.com.drogariaorigem.dbo.parameters.toDBO
import br.com.drogariaorigem.domain.shared.model.CashFlow
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
        private val id: Long?,
        private val date: LocalDate,
        private val totalValue: Double,
        private val totalDebit: Double,
        private val totalCredit: Double,
        private val totalInstallmentsCredit: Double,
        private val totalMoney: Double,
        private val totalConvention: Double,
        private val liquidCard: Double,
        private val observation: String,
        @ManyToOne
        private val category: CashFlowCategoryDBO
) {
        fun toModel() = CashFlow(
                id = id!!,
                date = date,
                totalValue = totalValue,
                totalDebit = totalDebit,
                totalCredit = totalCredit,
                totalInstallmentsCredit = totalInstallmentsCredit,
                totalMoney = totalMoney,
                totalConvention = totalConvention,
                liquidCard = liquidCard,
                observation = observation,
                category = category.toModel()
        )
}

fun CashFlow.toDBO() = CashFlowDBO(
        id = id,
        date = date,
        totalValue = totalValue,
        totalDebit = totalDebit,
        totalCredit = totalCredit,
        totalInstallmentsCredit = totalInstallmentsCredit,
        totalMoney = totalMoney,
        totalConvention = totalConvention,
        liquidCard = liquidCard,
        observation = observation,
        category = category.toDBO()
)