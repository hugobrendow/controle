package br.com.drogariaorigem.dbo

import br.com.drogariaorigem.domain.shared.model.ProviderVO
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "provider")
data class ProviderDBO(
        @Id
        @GeneratedValue
        val id: Long?,
        val fantasyName: String,
        val socialName: String,
        val cnpj: String,
        val inscription: String,
) {
    fun toModel() = ProviderVO(
            id = id,
            socialName = socialName,
            fantasyName = fantasyName,
            cnpj = cnpj,
            inscription = inscription
    )
}

fun ProviderVO.toDBO() = ProviderDBO(
        id = id,
        socialName = socialName,
        fantasyName = fantasyName,
        cnpj = cnpj,
        inscription = inscription
)