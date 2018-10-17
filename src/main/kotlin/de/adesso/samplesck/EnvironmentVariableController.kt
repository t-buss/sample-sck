package de.adesso.samplesck

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EnvironmentVariableController {

    @Value("\${SOME_ENV_VAR}")
    lateinit var envVar: String

    @GetMapping("/getenv")
    fun getEnvironmentVariable() = this.envVar

}
