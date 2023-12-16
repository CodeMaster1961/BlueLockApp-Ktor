package com.example.di

import com.example.repository.*
import org.koin.dsl.*

val koinModule = module {
    single<HeroRepository> {

    }
}