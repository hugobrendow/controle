package br.com.drogariaorigem.controller.provider.dto

import br.com.drogariaorigem.domain.shared.model.vo.ProviderRequest

data class CreateProviderDTO(
        val socialName: String,
        val fantasyName: String,
        val cnpj: String,
        val inscription: String,
) {
    fun toModel() = ProviderRequest(
            socialName = socialName,
            fantasyName = fantasyName,
            cnpj = cnpj,
            inscription = inscription
    )
}