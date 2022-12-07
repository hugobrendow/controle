package br.com.drogariaorigem.adapter.domain

import br.com.drogariaorigem.dbo.ProviderDBO
import br.com.drogariaorigem.dbo.toDBO
import br.com.drogariaorigem.domain.ports.infrastructure.ProviderDataPort
import br.com.drogariaorigem.domain.shared.exception.CashFlowNotFoundException
import br.com.drogariaorigem.domain.shared.model.ProviderVO
import br.com.drogariaorigem.repository.ProviderRepository
import usecases.DataAccessAdapter
import java.util.Optional


@DataAccessAdapter
class ProviderDataAdapter(
        val repository: ProviderRepository,
) : ProviderDataPort {

    override fun save(provider: ProviderVO): ProviderVO {
        return repository.save(provider.toDBO()).toModel()
    }

    override fun findAll(): List<ProviderVO> {
        return repository.findAll().stream().map { it.toModel() }.toList()
    }

    override fun existsCnpj(cnpj: String) = repository.findByCnpj(cnpj).isPresent

    override fun findById(id: Long) = repository.findById(id).orElseThrow { CashFlowNotFoundException(id) }.toModel()

    override fun remove(id: Long) = repository.deleteById(id)
}