package com.nusatoyotetsu.drivemate.drivematekmm

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}