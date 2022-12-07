package br.com.drogariaorigem.domain.shared.model

import java.time.LocalDate

data class InstallmentVO(
        val id: Long?,
        val value: Double,
        val paidValue: Double,
        val barcode: String,
        val status: String,
        val dueDate: LocalDate,
        val paymentDate: LocalDate
)