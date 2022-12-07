package br.com.drogariaorigem.domain.shared.model.vo.charge

import br.com.drogariaorigem.domain.shared.model.ChargeCategoryVO
import br.com.drogariaorigem.domain.shared.model.ChargeVO
import br.com.drogariaorigem.domain.shared.model.InstallmentVO
import br.com.drogariaorigem.domain.shared.model.ProviderVO
import br.com.drogariaorigem.domain.shared.model.vo.InstallmentRequest
import java.time.LocalDate

data class ChargeRequest(
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
    fun toModel(id: Long?, providerVO: ProviderVO, chargeCategory: ChargeCategoryVO) = ChargeVO(
            id = id,
            date = date,
            invoice = invoice,
            provider = providerVO,
            amountValue = amountValue,
            liquidValue = liquidValue,
            installments = installments.map { installmentToModel(null, it) },
            complementInvoice = complementInvoice,
            category = chargeCategory
    )

    private fun installmentToModel(id: Long?, installmentRequest: InstallmentChargeRequest) = InstallmentVO(
            id = id,
            value = installmentRequest.value,
            paidValue = installmentRequest.paidValue,
            barcode = installmentRequest.barcode,
            status = installmentRequest.status,
            dueDate = installmentRequest.dueDate,
            paymentDate = installmentRequest.paymentDate
    )
}

data class InstallmentChargeRequest(
        val id: Long?,
        val value: Double,
        val paidValue: Double,
        val barcode: String,
        val status: String = "PENDING",
        val dueDate: LocalDate,
        val paymentDate: LocalDate,
)

data class ChargeCategoryRequest(
        val id: Long,
)