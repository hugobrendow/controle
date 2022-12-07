package br.com.drogariaorigem.domain.ports.infrastructure

import br.com.drogariaorigem.domain.shared.model.ChargeVO

interface ChargeDataPort {
    fun save(charge: ChargeVO) : ChargeVO
    fun findAll(): List<ChargeVO>
    fun findById(id: Long): ChargeVO
}