package com.example.repository

import com.example.models.*
import io.ktor.http.cio.*

class HeroRepositoryImplementation : HeroRepository {

    override val heroes: Map<Int, List<Hero>> by lazy {
        mapOf(
            1 to page1,
//            2 to page2,
//            3 to page3,
//            4 to page4,
//            5 to page5
        )
    }

    override val page1: List<Hero> = listOf(
        Hero(
            id = 1,
            name = "Isagi",
            image = "/images/bluelock_isagiyoichi.jpg",
            about = "Isagi Yoichi is the protagonist of the manga and anime series \"Blue Lock.\" He is a talented young soccer player who becomes a participant in the Blue Lock program, a unique and intense training program aimed at developing the next elite striker for the Japanese national soccer team. Throughout the series, Isagi faces fierce competition, undergoes rigorous training, and experiences personal growth as he strives to secure a coveted spot on the national team. His determination and journey make up a significant part of the narrative, combining sports elements with character development in a compelling story",
            rating = 5.0,
            month = "April",
            day = "1st",
            abilities = listOf(
                "Metavision",
                "Direct Shot",
                "Transcendence Sight",
                "Spatial Awareness"
            )
        ),
        Hero(
            id = 2,
            name = "Bachira",
            image = "/images/bachira.jpg",
            about = "Bachira is a whimsical forward who plays following his instincts. He was a member of Team Z during the First Selection. His main goal was to find soccer rivals who also have a \"monster\" inside of them, but his goal later changes to becoming the best striker in the world when he overcomes his childhood trauma",
            rating = 4.5,
            month = "August",
            day = "8th",
            abilities = listOf(
                "Elastic Dribbling",
                "Rabona",
                "Egotistical Style",
                "Hyperspeed Scissors",
                "Quick Cross"
            )
        )
    )

    override suspend fun getAllHeroes(): ApiResponse {
        return ApiResponse(
            success = true,
            message = "OK",
            heroes = page1,
        )
    }

    override suspend fun searchHero(name: String?): ApiResponse {
        TODO("Not yet implemented")
    }
}