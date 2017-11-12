package kr.pravusid.dev

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DevApplication

fun main(args: Array<String>) {
    SpringApplication.run(DevApplication::class.java, *args)
}
