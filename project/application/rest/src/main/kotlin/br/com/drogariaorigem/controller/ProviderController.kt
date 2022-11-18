package br.com.drogariaorigem.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/providers")
@RestController
class ProviderController {

    @GetMapping
    fun helloProvider() = "hello provider"
}