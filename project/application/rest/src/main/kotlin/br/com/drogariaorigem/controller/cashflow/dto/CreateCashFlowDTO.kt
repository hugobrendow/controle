package br.com.drogariaorigem.controller.cashflow.dto

import br.com.drogariaorigem.domain.usecases.model.vo.CashFlowRequest
import java.time.LocalDate

data class CreateCashFlowDTO(
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
    fun toModel() = CashFlowRequest(
            date = date,
            totalValue = totalValue,
            totalDebit = totalDebit,
            totalCredit = totalCredit,
            totalInstallmentsCredit = totalInstallmentsCredit,
            totalMoney = totalMoney,
            totalConvention = totalConvention,
            liquidCard = liquidCard,
            observation = observation,
            category = category
    )
}