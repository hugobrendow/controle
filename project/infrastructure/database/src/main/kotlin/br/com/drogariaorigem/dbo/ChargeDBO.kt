package br.com.drogariaorigem.dbo

import br.com.drogariaorigem.dbo.parameters.ChargeCategoryDBO
import br.com.drogariaorigem.dbo.parameters.toDBO
import br.com.drogariaorigem.domain.shared.model.ChargeVO
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "charge")
data class ChargeDBO(
        @Id
        @GeneratedValue
        val id: Long?,
        val invoice: String,
        val date: LocalDate,
        val amountValue: Double,
        val liquidValue: Double,
        val complementInvoice: String,
        @ManyToOne(fetch = FetchType.EAGER)
        val provider: ProviderDBO,
        @OneToMany(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
        val installments: List<InstallmentDBO>,
        @ManyToOne(fetch = FetchType.EAGER)
        val category: ChargeCategoryDBO,
) {
    fun toModel() = ChargeVO(
            id = id,
            invoice = invoice,
            provider = provider.toModel(),
            date = date,
            amountValue = amountValue,
            liquidValue = liquidValue,
            installments = installments.map { it.toModel() },
            complementInvoice = complementInvoice,
            category = category.toModel()
    )
}

fun ChargeVO.toDBO() = ChargeDBO(
        id = id,
        invoice = invoice,
        provider = provider.toDBO(),
        date = date,
        amountValue = amountValue,
        liquidValue = liquidValue,
        installments = installments.map { it.toDBO() },
        complementInvoice = complementInvoice,
        category = category.toDBO()
)