package ru.ta.mobile.pingpong.referee.main

import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import ru.ta.mobile.pingpong.referee.R
import ru.ta.mobile.pingpong.referee.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {
    private val viewBinding by viewBinding(FragmentMainBinding::bind)
}