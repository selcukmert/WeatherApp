package com.dobbytech.weatherapp.domain.repository

import com.dobbytech.weatherapp.domain.util.Resource
import com.dobbytech.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}