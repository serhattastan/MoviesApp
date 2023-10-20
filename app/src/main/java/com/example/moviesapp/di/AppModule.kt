package com.example.moviesapp.di

import com.example.moviesapp.data.datasource.MoviesDataSource
import com.example.moviesapp.data.repo.MoviesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideMoviesDataSource() : MoviesDataSource{
        return MoviesDataSource()
    }
    @Provides
    @Singleton
    fun provideMoviesRepository(mds : MoviesDataSource) : MoviesRepository{
        return MoviesRepository(mds)
    }
}