package br.com.drogariaorigem.controller.parameters

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/cash-flow/category")
@RestController
class CashFlowCategoryController {

    @GetMapping
    fun list() = "hello cash flow"

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = "hello cash flow"

    @PostMapping
    fun save() = "hello cash flow"

}