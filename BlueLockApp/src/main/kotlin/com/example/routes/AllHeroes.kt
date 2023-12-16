package com.example.routes

import com.example.repository.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.*

fun Route.getAllHeroes() {
    val heroRepository: HeroRepository by inject()

    get("/heroes") {
        val page = call.request.queryParameters["page"]?.toInt() ?: 1
        val apiResponse = heroRepository.getAllHeroes()
        call.respond(message = apiResponse, status = HttpStatusCode.OK)
    }
}