package br.com.drogariaorigem.domain.usecases

import br.com.drogariaorigem.domain.ports.domain.InstallmentPort
import br.com.drogariaorigem.domain.ports.infrastructure.InstallmentDataPort
import br.com.drogariaorigem.domain.shared.model.InstallmentVO
import br.com.drogariaorigem.domain.shared.model.vo.InstallmentRequest
import usecases.UseCase

@UseCase
class InstallmentUseCase(
        private val installmentPort: InstallmentDataPort,
) : InstallmentPort {

    override fun save(installment: InstallmentRequest): InstallmentVO {
        val installment = installment.toModel(null)
        return installmentPort.save(installment)
    }

    override fun update(id: Long, installmentRequest: InstallmentRequest): InstallmentVO {
        val provider = installmentPort.findById(id)
        val updateProvider = installmentRequest.toModel(provider.id)
        return installmentPort.save(updateProvider)
    }

    override fun listAll() = installmentPort.findAll()

    override fun findById(id: Long) = installmentPort.findById(id)
}