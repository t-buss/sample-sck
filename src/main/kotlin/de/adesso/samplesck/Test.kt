package de.adesso.samplesck

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @Value("\${SOME_ENV_VAR}")
    var envVar: String = ""

    @GetMapping("/getenv")
    fun getEnvironmentVariable() = this.envVar

}
