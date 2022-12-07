package br.com.drogariaorigem.domain.ports.domain

import br.com.drogariaorigem.domain.shared.model.CashFlow
import br.com.drogariaorigem.domain.shared.model.vo.CashFlowRequest

interface CashFlowPort {
    fun create(cashFlow: CashFlowRequest): CashFlow
    fun batchCreate(cashFlow: List<CashFlowRequest>): List<CashFlow>
    fun update(id: Long, cashFlow: CashFlowRequest): CashFlow
    fun listAll(): List<CashFlow>
    fun findById(id: Long): CashFlow
}