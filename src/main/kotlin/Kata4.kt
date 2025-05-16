package org.example

//as
import kotlin.random.Random
import java.util.Random

fun useDifferentRandomClasses(): String {
    return "Kotlin random: " +
            KRandom.nextInt(2) +
            " Java random:" +
            JRandom().nextInt(2) +
            "."
}