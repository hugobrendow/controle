package br.com.drogariaorigem.dbo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "provider")
data class ProviderDBO(
        @Id
        @GeneratedValue
        val id: Long,
        val fantasyName: String,
        val socialName: String,
        val cnpj: String,
        val inscription: String,
)