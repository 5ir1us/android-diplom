package ru.practicum.android.diploma.vacancy.filter.ui.choosecountry.model

import ru.practicum.android.diploma.vacancy.filter.domain.model.Area

interface ChooseCountryFragmentState {

    data class Content(val areas: List<Area>) : ChooseCountryFragmentState

    object Loading : ChooseCountryFragmentState

    object Error : ChooseCountryFragmentState
}
