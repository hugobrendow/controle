package br.com.drogariaorigem.domain.shared.exception

sealed class BusinessException (val code: String, message: String) : RuntimeException(message)

class CashFlowCategoryException(id: Long) :
        BusinessException("CASH-CAT-01", "Id não encontrado $id")

class CashFlowNotFoundException(id: Long) :
        BusinessException("CASH-FLOW-01", "Fluxo de caixa não encontrado: $id")

class ChargeNotFoundException(id: Long) :
        BusinessException("CHARGE-01", "Despesa não encontrada: $id")

class CnpjExistsException(cnpj: String) :
        BusinessException("PROV-01", "Este CNPJ já existe cadastrado: $cnpj")