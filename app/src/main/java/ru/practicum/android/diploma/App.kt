package ru.practicum.android.diploma

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import ru.practicum.android.diploma.di.dataModule
import ru.practicum.android.diploma.di.intercatorModule
import ru.practicum.android.diploma.di.repositoryModule
import ru.practicum.android.diploma.di.viewModelModule

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            printLogger(Level.DEBUG)// Логирование
            modules(dataModule, intercatorModule, viewModelModule, repositoryModule)
        }
    }
}
