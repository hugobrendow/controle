package br.com.drogariaorigem.controller.charge.dto

import br.com.drogariaorigem.domain.shared.model.vo.charge.ChargeCategoryRequest
import br.com.drogariaorigem.domain.shared.model.vo.charge.ChargeRequest
import br.com.drogariaorigem.domain.shared.model.vo.charge.InstallmentChargeRequest
import java.time.LocalDate

data class CreateChargeDTO(
        val id: Long?,
        val invoice: String,
        val provider: Long,
        val date: LocalDate,
        val amountValue: Double,
        val liquidValue: Double,
        val installments: List<InstallmentChargeRequest>,
        val complementInvoice: String,
        val category: ChargeCategoryRequest,
) {
    fun toModel(id: Long?) = ChargeRequest(
            id = id,
            date = date,
            invoice = invoice,
            provider = provider,
            amountValue = amountValue,
            liquidValue = liquidValue,
            installments = installments,
            complementInvoice = complementInvoice,
            category = category
    )
}