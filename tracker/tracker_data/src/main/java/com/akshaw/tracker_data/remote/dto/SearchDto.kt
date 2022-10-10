package com.akshaw.tracker_data.remote.dto

import com.akshaw.tracker_data.remote.dto.Product

data class SearchDto(
    val products: List<Product>,
)