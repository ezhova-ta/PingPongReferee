package ru.ta.mobile.pingpong.referee.main.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.ta.mobile.pingpong.referee.di.ViewModelFactory
import ru.ta.mobile.pingpong.referee.di.ViewModelKey
import ru.ta.mobile.pingpong.referee.main.MainViewModel

@Module(includes = [MainModule.BindsModule::class])
class MainModule {
    @Module
    interface BindsModule {
        @Binds
        @IntoMap
        @ViewModelKey(MainViewModel::class)
        fun bindViewModel(viewModel: MainViewModel): ViewModel

        @Binds
        @MainScope
        fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
    }
}