package br.com.drogariaorigem.repository

import br.com.drogariaorigem.dbo.parameters.CashFlowCategoryDBO
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CashFlowCategoryRepository : JpaRepository<CashFlowCategoryDBO, Long> {
}