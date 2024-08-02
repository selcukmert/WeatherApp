package com.dobbytech.weatherapp.di

import com.dobbytech.weatherapp.data.location.DefaultLocationTracker
import com.dobbytech.weatherapp.data.repository.WeatherRepositoryImpl
import com.dobbytech.weatherapp.domain.location.LocationTracker
import com.dobbytech.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}