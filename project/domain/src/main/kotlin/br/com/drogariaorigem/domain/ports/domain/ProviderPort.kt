package br.com.drogariaorigem.domain.ports.domain

import br.com.drogariaorigem.domain.shared.model.ProviderVO
import br.com.drogariaorigem.domain.shared.model.vo.ProviderRequest

interface ProviderPort {
    fun create(provider: ProviderRequest): ProviderVO
    fun update(id: Long, provider: ProviderRequest): ProviderVO
    fun listAll(): List<ProviderVO>
    fun findById(id: Long): ProviderVO
    fun remove(id: Long)
}