package de.adesso.samplesck

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class SampleSckApplication

fun main(args: Array<String>) {
    runApplication<SampleSckApplication>(*args)
}
