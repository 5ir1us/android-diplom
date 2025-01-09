package ru.practicum.android.diploma.vacancy.filter.data

import android.content.SharedPreferences
import ru.practicum.android.diploma.vacancy.filter.domain.model.FilterIndustryValue

class IndustryLocalDataSource(
    private val sharedPreferences: SharedPreferences
) {
    fun saveIndustry(industry: FilterIndustryValue) {
        sharedPreferences.edit()
            .putString(SELECTED_INDUSTRY_ID, industry.id)
            .putString(SELECTED_INDUSTRY_NAME, industry.text)
            .apply()
    }

    fun getSavedIndustry(): FilterIndustryValue? {
        val id = sharedPreferences.getString(SELECTED_INDUSTRY_ID, null)
        val name = sharedPreferences.getString(SELECTED_INDUSTRY_NAME, null)
        return if (id != null && name != null) {
            FilterIndustryValue(id, name)
        } else {
            null
        }
    }

    companion object {
        private const val SELECTED_INDUSTRY_ID = "selected_industry_id"
        private const val SELECTED_INDUSTRY_NAME = "selected_industry_name"
    }
}
