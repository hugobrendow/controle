package br.com.drogariaorigem.domain.ports.infrastructure

import br.com.drogariaorigem.domain.shared.model.CashFlow

interface CashFlowDataPort {
    fun save(cashFlow: CashFlow) : CashFlow
    fun findAll(): List<CashFlow>
    fun findById(id: Long): CashFlow
}