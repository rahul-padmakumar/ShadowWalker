package com.example.shadowwalker.db

data class LocationInfo(
    val latitude: Double,
    val longitude: Double
)

data class LocationInfos(
    val locations: List<LocationInfo>
)

