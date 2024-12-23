package ru.practicum.android.diploma.vacancy.filter.ui.choosecountry

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.practicum.android.diploma.R

class ChooseCountryFragment : Fragment() {

    companion object {
        fun newInstance() = ChooseCountryFragment()
    }

    private val viewModel: ChooseCountryViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_choose_country, container, false)
    }
}
