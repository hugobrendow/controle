package br.com.drogariaorigem.domain.ports.domain

import br.com.drogariaorigem.domain.shared.model.ChargeCategoryVO
import br.com.drogariaorigem.domain.shared.model.vo.CreateChargeCategoryRequest

interface ChargeCategoryPort {
    fun listAll(): List<ChargeCategoryVO>
    fun findById(id: Long): ChargeCategoryVO
    fun save(categoryRequest: CreateChargeCategoryRequest): ChargeCategoryVO
    fun remove(id: Long)
    fun update(id: Long, chargeCategory: CreateChargeCategoryRequest): ChargeCategoryVO
}