package br.com.drogariaorigem.adapter.domain

import br.com.drogariaorigem.dbo.toDBO
import br.com.drogariaorigem.domain.ports.infrastructure.ChargeDataPort
import br.com.drogariaorigem.domain.shared.exception.ChargeNotFoundException
import br.com.drogariaorigem.domain.shared.model.ChargeVO
import br.com.drogariaorigem.repository.ChargeRepository
import usecases.DataAccessAdapter


@DataAccessAdapter
class ChargeDataAdapter(
        val repository: ChargeRepository,
) : ChargeDataPort {

    override fun save(charge: ChargeVO): ChargeVO {
        return repository.save(charge.toDBO()).toModel()
    }

    override fun findAll(): List<ChargeVO> {
        return repository.findAll().stream().map { it.toModel() }.toList()
    }

    override fun findById(id: Long) = repository.findById(id).orElseThrow { ChargeNotFoundException(id) }.toModel()

}