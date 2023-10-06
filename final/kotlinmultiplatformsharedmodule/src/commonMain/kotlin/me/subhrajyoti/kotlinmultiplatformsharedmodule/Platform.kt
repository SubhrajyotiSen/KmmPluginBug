package me.subhrajyoti.kotlinmultiplatformsharedmodule

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform