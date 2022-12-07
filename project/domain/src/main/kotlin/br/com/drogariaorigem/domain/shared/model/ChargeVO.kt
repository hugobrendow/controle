package br.com.drogariaorigem.domain.shared.model

import java.time.LocalDate

data class ChargeVO(
        val id: Long?,
        val invoice: String,
        val provider: ProviderVO,
        val date: LocalDate,
        val amountValue: Double,
        val liquidValue: Double,
        val installments: List<InstallmentVO>,
        val complementInvoice: String,
        val category: ChargeCategoryVO
)