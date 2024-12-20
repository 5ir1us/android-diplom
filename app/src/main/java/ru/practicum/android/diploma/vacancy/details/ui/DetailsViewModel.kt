package ru.practicum.android.diploma.vacancy.details.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import ru.practicum.android.diploma.vacancy.details.domain.api.DetailsInteractor
import ru.practicum.android.diploma.vacancy.details.domain.model.VacancyDetails

class DetailsViewModel(
    private val detailsInteractor: DetailsInteractor
) : ViewModel() {

    fun loadVacancy(vacancyId: Int) {
        viewModelScope.launch {
            detailsInteractor.fetchDetails(vacancyId)
                .collect { resource ->
                    processResult(resource.first, resource.second)
                }
        }
    }

    private fun processResult(vacancyDetails: VacancyDetails?, errorMessage: String?) {
        var vacancy = vacancyDetails
        when {
            errorMessage != null -> {
                Log.d("ErrorMessage", errorMessage)
            }
            vacancy == null -> {
                Log.d("ErrorMesagge", "Вакансий не найдено")
            }
            else -> {
                Log.d("VacancyResult", vacancy.toString())
            }
        }
    }
}
