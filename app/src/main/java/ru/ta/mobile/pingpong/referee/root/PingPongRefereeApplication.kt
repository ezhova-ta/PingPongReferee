package ru.ta.mobile.pingpong.referee.root

import android.app.Application
import ru.ta.mobile.pingpong.referee.di.AppComponent
import ru.ta.mobile.pingpong.referee.di.DaggerAppComponent

class PingPongRefereeApplication : Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
}