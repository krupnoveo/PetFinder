package ru.krupnoveo.edu.petfinder

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
    fromApplication<PetFinderApplication>().with(TestcontainersConfiguration::class).run(*args)
}
