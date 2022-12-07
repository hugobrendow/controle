package br.com.drogariaorigem.common.handler

import br.com.drogariaorigem.domain.shared.exception.BusinessException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionControllerHandler {

    @ExceptionHandler
    fun handleBusinessException(ex: BusinessException): ResponseEntity<ErrorMessage> {
        val errorMessage = ErrorMessage(ex.message, HttpStatus.BAD_REQUEST.value())
        return ResponseEntity(errorMessage, HttpStatus.BAD_REQUEST)
    }
}

class ErrorMessage(
        val message: String?,
        val status: Int,
)