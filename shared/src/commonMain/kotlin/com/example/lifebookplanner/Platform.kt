package com.example.lifebookplanner

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform