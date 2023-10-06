package me.subhrajyoti.kotlinmultiplatformsharedmodule

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}