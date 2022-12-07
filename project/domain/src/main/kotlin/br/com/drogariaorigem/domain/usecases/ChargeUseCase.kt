package br.com.drogariaorigem.domain.usecases

import br.com.drogariaorigem.domain.ports.domain.ChargePort
import br.com.drogariaorigem.domain.ports.infrastructure.ChargeDataPort
import br.com.drogariaorigem.domain.shared.model.ChargeVO
import br.com.drogariaorigem.domain.shared.model.vo.charge.ChargeRequest
import usecases.UseCase

@UseCase
class ChargeUseCase(
        private val chargeDataPort: ChargeDataPort,
        private val providerUseCase: ProviderUseCase,
        private val chargeCategoryUseCase: ChargeCategoryUseCase,
) : ChargePort {

    override fun create(charge: ChargeRequest): ChargeVO {
        val provider = providerUseCase.findById(charge.provider)
        val category = chargeCategoryUseCase.findById(charge.category.id)

        return chargeDataPort.save(charge.toModel(null, providerVO = provider, chargeCategory = category))
    }

    override fun listAll() = chargeDataPort.findAll()

    override fun findById(id: Long) = chargeDataPort.findById(id)
}