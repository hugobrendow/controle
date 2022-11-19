package br.com.drogariaorigem.domain.ports.domain

import br.com.drogariaorigem.domain.usecases.model.CashFlow
import br.com.drogariaorigem.domain.usecases.model.vo.CashFlowRequest

interface CashFlowPort {
    fun create(cashFlow: CashFlowRequest): CashFlow
    fun update(id: Long, cashFlow: CashFlowRequest): CashFlow
    fun listAll(): List<CashFlow>
    fun findById(id: Long): CashFlow
}