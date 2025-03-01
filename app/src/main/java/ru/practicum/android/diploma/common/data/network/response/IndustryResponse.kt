package ru.practicum.android.diploma.common.data.network.response

import ru.practicum.android.diploma.common.data.dto.IndustriesDto
import ru.practicum.android.diploma.common.data.dto.Response

data class IndustryResponse(
    val industries: List<IndustriesDto>
) : Response()
