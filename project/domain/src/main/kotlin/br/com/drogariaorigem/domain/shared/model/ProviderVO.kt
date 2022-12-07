package br.com.drogariaorigem.domain.shared.model

data class ProviderVO(
        val id: Long?,
        val socialName: String,
        val fantasyName: String,
        val cnpj: String,
        val inscription: String,
)