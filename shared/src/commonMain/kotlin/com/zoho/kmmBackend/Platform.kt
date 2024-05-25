package com.zoho.kmmBackend

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform