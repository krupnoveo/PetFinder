package ru.krupnoveo.edu.petfinder

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PetFinderApplication

fun main(args: Array<String>) {
    runApplication<PetFinderApplication>(*args)
}
