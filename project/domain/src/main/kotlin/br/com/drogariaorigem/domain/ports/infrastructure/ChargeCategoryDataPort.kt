package br.com.drogariaorigem.domain.ports.infrastructure

import br.com.drogariaorigem.domain.shared.model.ChargeCategoryVO

interface ChargeCategoryDataPort {
    fun save(charge: ChargeCategoryVO) : ChargeCategoryVO
    fun findAll(): List<ChargeCategoryVO>
    fun findById(id: Long): ChargeCategoryVO
}