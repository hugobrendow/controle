package br.com.drogariaorigem.adapter.domain

import br.com.drogariaorigem.dbo.toDBO
import br.com.drogariaorigem.domain.ports.infrastructure.CashFlowDataPort
import br.com.drogariaorigem.domain.shared.exception.CashFlowNotFoundException
import br.com.drogariaorigem.domain.usecases.model.CashFlow
import br.com.drogariaorigem.repository.CashFlowRepository
import usecases.DataAccessAdapter


@DataAccessAdapter
class CashFlowDataAdapter(
        val repository: CashFlowRepository,
) : CashFlowDataPort {

    override fun save(cashFlow: CashFlow): CashFlow {
        return repository.save(cashFlow.toDBO()).toModel()
    }

    override fun findAll(): List<CashFlow> {
        return repository.findAll().stream().map { it.toModel() }.toList()
    }

    override fun findById(id: Long) = repository.findById(id).orElseThrow { CashFlowNotFoundException(id) }.toModel()

}