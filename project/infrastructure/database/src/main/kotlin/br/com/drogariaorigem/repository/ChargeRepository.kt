package br.com.drogariaorigem.repository

import br.com.drogariaorigem.dbo.ChargeDBO
import org.springframework.data.jpa.repository.JpaRepository

interface ChargeRepository : JpaRepository<ChargeDBO, Long>{
}