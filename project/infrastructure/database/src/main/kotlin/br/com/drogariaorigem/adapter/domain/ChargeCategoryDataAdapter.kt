package br.com.drogariaorigem.adapter.domain

import br.com.drogariaorigem.dbo.parameters.toDBO
import br.com.drogariaorigem.domain.ports.infrastructure.ChargeCategoryDataPort
import br.com.drogariaorigem.domain.shared.exception.CashFlowNotFoundException
import br.com.drogariaorigem.domain.shared.model.ChargeCategoryVO
import br.com.drogariaorigem.repository.ChargeCategoryRepository
import usecases.DataAccessAdapter


@DataAccessAdapter
class ChargeCategoryDataAdapter(
        val repository: ChargeCategoryRepository,
) : ChargeCategoryDataPort {

    override fun save(charge: ChargeCategoryVO): ChargeCategoryVO {
        return repository.save(charge.toDBO()).toModel()
    }

    override fun findAll(): List<ChargeCategoryVO> {
        return repository.findAll().stream().map { it.toModel() }.toList()
    }

    override fun findById(id: Long) = repository.findById(id).orElseThrow { CashFlowNotFoundException(id) }.toModel()

}