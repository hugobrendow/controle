package br.com.drogariaorigem.repository

import br.com.drogariaorigem.dbo.ProviderDBO
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface ProviderRepository : JpaRepository<ProviderDBO, Long>{
    fun findByCnpj(cnpj: String): Optional<ProviderDBO>
}