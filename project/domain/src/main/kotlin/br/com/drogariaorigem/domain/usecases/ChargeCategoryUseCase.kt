package br.com.drogariaorigem.domain.usecases

import br.com.drogariaorigem.domain.ports.domain.ChargeCategoryPort
import br.com.drogariaorigem.domain.ports.infrastructure.ChargeCategoryDataPort
import br.com.drogariaorigem.domain.shared.model.vo.CreateChargeCategoryRequest
import usecases.UseCase

@UseCase
class ChargeCategoryUseCase(
        private val chargeDataPort: ChargeCategoryDataPort,
) : ChargeCategoryPort {

    override fun listAll() = chargeDataPort.findAll()

    override fun findById(id: Long) = chargeDataPort.findById(id)

    override fun save(chargeCategory: CreateChargeCategoryRequest) = chargeDataPort.save(chargeCategory.toModel(null))
}