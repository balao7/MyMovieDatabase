package com.twins.mymoviedatabase.catalog.injection.component

import com.twins.mymoviedatabase.catalog.App
import com.twins.mymoviedatabase.catalog.injection.module.ApplicationModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

/**
 * Created by bukalapak on 11/20/17.
 */
@Singleton
@Component(modules = arrayOf(ApplicationModule::class,
        AndroidInjectionModule::class))
interface ApplicationComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>() {
        abstract fun applicationModule(module: ApplicationModule): Builder
    }

}