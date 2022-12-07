package br.com.drogariaorigem.domain.ports.infrastructure

import br.com.drogariaorigem.domain.shared.model.InstallmentVO

interface InstallmentDataPort {
    fun save(installment: InstallmentVO): InstallmentVO
    fun findAll(): List<InstallmentVO>
    fun findById(id: Long): InstallmentVO
}