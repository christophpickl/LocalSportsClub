package seepick.localsportsclub.logic

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

fun logicModule() = module {
    singleOf(::VenuesServiceImpl) bind VenuesService::class
}
