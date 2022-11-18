package br.com.drogariaorigem.dbo

import br.com.drogariaorigem.dbo.enum.InstallmentStatusEnum
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "installment")
data class InstallmentDBO(
        @Id
        @GeneratedValue
        private val id: Long,
        private val value: Double,
        private val paidValue: Double,
        private val barcode: String,
        private val status: InstallmentStatusEnum,
        private val dueDate: LocalDate,
        private val paymentDate: LocalDate
)