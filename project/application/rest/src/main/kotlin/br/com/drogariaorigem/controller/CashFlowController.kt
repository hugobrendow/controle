package br.com.drogariaorigem.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/cash-flow")
@RestController
class CashFlowController {

    @GetMapping
    fun helloProvider() = "hello provider"
}