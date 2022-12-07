package br.com.drogariaorigem.domain.shared.model.vo

import br.com.drogariaorigem.domain.shared.model.InstallmentVO
import java.time.LocalDate

data class InstallmentRequest(
        val id: Long?,
        val value: Double,
        val paidValue: Double,
        val barcode: String,
        val status: String,
        val dueDate: LocalDate,
        val paymentDate: LocalDate,
) {
    fun toModel(id: Long?) = InstallmentVO(
            id = id,
            value = value,
            paidValue = paidValue,
            barcode = barcode,
            status = status,
            dueDate = dueDate,
            paymentDate = paymentDate
    )
}