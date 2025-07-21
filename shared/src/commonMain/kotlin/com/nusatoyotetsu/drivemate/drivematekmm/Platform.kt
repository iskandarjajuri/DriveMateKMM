package com.nusatoyotetsu.drivemate.drivematekmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform