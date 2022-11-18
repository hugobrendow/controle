package br.com.drogariaorigem.controller.parameters

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/charges/category")
@RestController
class ChargeCategoryController {

    @GetMapping
    fun helloProvider() = "hello provider"
}