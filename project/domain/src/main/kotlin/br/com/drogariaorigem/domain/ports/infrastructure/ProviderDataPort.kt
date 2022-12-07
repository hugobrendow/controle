package br.com.drogariaorigem.domain.ports.infrastructure

import br.com.drogariaorigem.domain.shared.model.ProviderVO
import java.util.Optional

interface ProviderDataPort {
    fun save(provider: ProviderVO) : ProviderVO
    fun existsCnpj(cnpj: String): Boolean
    fun findAll(): List<ProviderVO>
    fun findById(id: Long): ProviderVO
    fun remove(id: Long)
}