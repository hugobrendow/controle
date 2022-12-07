package br.com.drogariaorigem.repository

import br.com.drogariaorigem.dbo.InstallmentDBO
import org.springframework.data.jpa.repository.JpaRepository

interface InstallmentRepository : JpaRepository<InstallmentDBO, Long>{
}