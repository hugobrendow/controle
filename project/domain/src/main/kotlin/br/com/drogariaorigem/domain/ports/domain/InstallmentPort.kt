package br.com.drogariaorigem.domain.ports.domain

import br.com.drogariaorigem.domain.shared.model.InstallmentVO
import br.com.drogariaorigem.domain.shared.model.vo.InstallmentRequest

interface InstallmentPort {
    fun save(installment: InstallmentRequest): InstallmentVO
    fun update(id: Long, installment: InstallmentRequest): InstallmentVO
    fun listAll(): List<InstallmentVO>
    fun findById(id: Long): InstallmentVO
}