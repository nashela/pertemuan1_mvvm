package com.shelazh.mvvmapp.di

import android.content.Context
import com.shelazh.mvvmapp.popo.CounterSharedPrefence
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AppModule {
    @Singleton
    @Provides
    fun provideCounterSharedPrefence(@ApplicationContext context: Context) = CounterSharedPrefence(context)
}