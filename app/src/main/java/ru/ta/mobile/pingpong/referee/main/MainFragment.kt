package ru.ta.mobile.pingpong.referee.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import dev.androidbroadcast.vbpd.viewBinding
import ru.ta.mobile.pingpong.referee.R
import ru.ta.mobile.pingpong.referee.databinding.FragmentMainBinding
import ru.ta.mobile.pingpong.referee.root.PingPongRefereeApplication
import javax.inject.Inject

class MainFragment : Fragment(R.layout.fragment_main) {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<MainViewModel> { viewModelFactory }

    private val viewBinding by viewBinding(FragmentMainBinding::bind)

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (requireActivity().application as PingPongRefereeApplication)
            .appComponent
            .mainComponentFactory()
            .create()
            .inject(this)
    }
}