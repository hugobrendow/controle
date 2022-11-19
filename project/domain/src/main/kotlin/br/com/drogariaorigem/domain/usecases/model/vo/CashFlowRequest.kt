package br.com.drogariaorigem.domain.usecases.model.vo

import br.com.drogariaorigem.domain.usecases.model.CashFlow
import br.com.drogariaorigem.domain.usecases.model.parameters.CashFlowCategory
import java.time.LocalDate

data class CashFlowRequest(
        val date: LocalDate,
        val totalValue: Double,
        val totalDebit: Double,
        val totalCredit: Double,
        val totalInstallmentsCredit: Double,
        val totalMoney: Double,
        val totalConvention: Double,
        val liquidCard: Double,
        val observation: String,
        val category: Long
) {
    fun toModel(categoryData: CashFlowCategory, id: Long?) = CashFlow(
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
            category = categoryData
    )
}
