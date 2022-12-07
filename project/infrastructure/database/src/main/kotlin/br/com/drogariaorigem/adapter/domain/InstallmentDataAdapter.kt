package br.com.drogariaorigem.adapter.domain

import br.com.drogariaorigem.dbo.toDBO
import br.com.drogariaorigem.domain.ports.infrastructure.InstallmentDataPort
import br.com.drogariaorigem.domain.shared.exception.CashFlowNotFoundException
import br.com.drogariaorigem.domain.shared.model.InstallmentVO
import br.com.drogariaorigem.repository.InstallmentRepository
import usecases.DataAccessAdapter


@DataAccessAdapter
class InstallmentDataAdapter(
        val repository: InstallmentRepository,
) : InstallmentDataPort {

    override fun save(charge: InstallmentVO): InstallmentVO {
        return repository.save(charge.toDBO()).toModel()
    }

    override fun findAll(): List<InstallmentVO> {
        return repository.findAll().stream().map { it.toModel() }.toList()
    }

    override fun findById(id: Long) = repository.findById(id).orElseThrow { CashFlowNotFoundException(id) }.toModel()

}