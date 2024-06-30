package di

import org.koin.dsl.module

fun appModule() = listOf(
    domainModule,
    dataModule
)

val domainModule = module {

}

val dataModule = module {

}