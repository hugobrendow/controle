package br.com.drogariaorigem.domain.usecases

import br.com.drogariaorigem.domain.ports.domain.ProviderPort
import br.com.drogariaorigem.domain.ports.infrastructure.ProviderDataPort
import br.com.drogariaorigem.domain.shared.exception.CnpjExistsException
import br.com.drogariaorigem.domain.shared.model.ProviderVO
import br.com.drogariaorigem.domain.shared.model.vo.ProviderRequest
import usecases.UseCase

@UseCase
class ProviderUseCase(
        private val providerAdapter: ProviderDataPort
) : ProviderPort {

    override fun create(provider: ProviderRequest): ProviderVO {
        if (providerAdapter.existsCnpj(provider.cnpj)) {
            throw CnpjExistsException(provider.cnpj)
        }
        return providerAdapter.save(provider.toModel(null))
    }

    override fun update(id: Long, providerRequest: ProviderRequest): ProviderVO {
        val provider = providerAdapter.findById(id)
        val updateProvider = providerRequest.toModel(provider.id)
        return providerAdapter.save(updateProvider)
    }

    override fun listAll() = providerAdapter.findAll()

    override fun findById(id: Long) = providerAdapter.findById(id)

    override fun remove(id: Long) = providerAdapter.remove(id)
}