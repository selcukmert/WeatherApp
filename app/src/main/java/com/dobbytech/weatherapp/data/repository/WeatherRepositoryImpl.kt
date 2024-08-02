package com.dobbytech.weatherapp.data.repository

import com.dobbytech.weatherapp.data.mappers.toWeatherInfo
import com.dobbytech.weatherapp.data.remote.WeatherApi
import com.dobbytech.weatherapp.domain.repository.WeatherRepository
import com.dobbytech.weatherapp.domain.util.Resource
import com.dobbytech.weatherapp.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch(e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}