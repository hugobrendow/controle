package br.com.drogariaorigem.domain.shared.exception

sealed class BusinessException (val code: String, message: String) : RuntimeException(message)

class CashFlowCategoryException(id: Long) :
        BusinessException("CASH-CAT-01", "Id não encontrado $id")

class CashFlowNotFoundException(id: Long) :
        BusinessException("CASH-FLOW-01", "Fluxo de caixa não encontrado: $id")