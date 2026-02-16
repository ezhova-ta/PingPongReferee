package ru.ta.mobile.pingpong.referee.main.di

import dagger.Subcomponent
import ru.ta.mobile.pingpong.referee.main.MainFragment

@Subcomponent(modules = [MainModule::class])
@MainScope
interface MainComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): MainComponent
    }

    fun inject(fragment: MainFragment)
}