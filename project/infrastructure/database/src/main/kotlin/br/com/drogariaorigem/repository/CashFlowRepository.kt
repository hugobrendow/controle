package br.com.drogariaorigem.repository

import br.com.drogariaorigem.dbo.CashFlowDBO
import org.springframework.data.jpa.repository.JpaRepository

interface CashFlowRepository : JpaRepository<CashFlowDBO, Long>{
}