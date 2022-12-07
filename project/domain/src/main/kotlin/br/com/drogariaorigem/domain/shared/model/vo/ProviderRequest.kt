package br.com.drogariaorigem.domain.shared.model.vo

import br.com.drogariaorigem.domain.shared.model.ProviderVO

data class ProviderRequest(
        val socialName: String,
        val fantasyName: String,
        val cnpj: String,
        val inscription: String,
) {
    fun toModel(id: Long?) = ProviderVO(
            id = id,
            socialName = socialName,
            fantasyName = fantasyName,
            cnpj = cnpj,
            inscription = inscription
    )
}