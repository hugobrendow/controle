package br.com.drogariaorigem.controller.charge.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/charges")
@RestController
class ChargeController {

    @GetMapping
    fun helloProvider() = "hello provider"
}