package ru.ta.mobile.pingpong.referee.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import ru.ta.mobile.pingpong.referee.main.di.MainComponent
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        SubcomponentsModule::class
    ]
)
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }

    fun mainComponentFactory(): MainComponent.Factory
}

@Module(
    subcomponents = [
        MainComponent::class
    ]
)
object SubcomponentsModule