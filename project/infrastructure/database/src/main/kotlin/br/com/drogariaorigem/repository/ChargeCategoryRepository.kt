package br.com.drogariaorigem.repository

import br.com.drogariaorigem.dbo.parameters.ChargeCategoryDBO
import org.springframework.data.jpa.repository.JpaRepository

interface ChargeCategoryRepository : JpaRepository<ChargeCategoryDBO, Long>{
}