package br.com.aikosptrans.presentation.busline.viewmodel

import br.com.aikosptrans.domain.entity.BusLine

data class BusLineUiState(
    val lines: List<BusLine> = listOf(),
    val query: String = "",
    val isLoading: Boolean = false,
    val hasError: Boolean = false
)