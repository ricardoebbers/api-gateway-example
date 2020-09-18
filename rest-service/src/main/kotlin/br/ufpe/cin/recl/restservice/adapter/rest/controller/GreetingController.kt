package br.ufpe.cin.recl.restservice.adapter.rest.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class GreetingController {

    @GetMapping
    fun greet(@RequestParam name: String?): String {
        return name?.let { "Hello $name!" } ?: "Hello world!"
    }
}