package br.com.drogariaorigem.domain.usecases.model

import br.com.drogariaorigem.domain.usecases.model.parameters.CashFlowCategory
import java.time.LocalDate

data class CashFlow(
        val id: Long?,
        val date: LocalDate,
        val totalValue: Double,
        val totalDebit: Double,
        val totalCredit: Double,
        val totalInstallmentsCredit: Double,
        val totalMoney: Double,
        val totalConvention: Double,
        val liquidCard: Double,
        val observation: String,
        val category: CashFlowCategory
)