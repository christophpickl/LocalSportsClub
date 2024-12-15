package seepick.localsportsclub.sync

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

fun syncModule() = module {
    singleOf(::RealSyncer) bind Syncer::class
}