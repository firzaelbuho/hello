package io.github.firzaelbuho.hello

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform