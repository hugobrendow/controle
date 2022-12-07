package br.com.drogariaorigem.domain.ports.domain

import br.com.drogariaorigem.domain.shared.model.ChargeVO
import br.com.drogariaorigem.domain.shared.model.vo.charge.ChargeRequest

interface ChargePort {
    fun create(provider: ChargeRequest): ChargeVO
    fun listAll(): List<ChargeVO>
    fun findById(id: Long): ChargeVO
}