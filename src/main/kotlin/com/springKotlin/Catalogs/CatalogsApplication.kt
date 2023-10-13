package com.springKotlin.Catalogs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CatalogsApplication

fun main(args: Array<String>) {
	runApplication<CatalogsApplication>(*args)
}
