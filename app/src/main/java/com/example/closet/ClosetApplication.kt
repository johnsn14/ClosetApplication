package com.example.closet

import android.app.Application
import com.example.closet.ClosetRepository

/**
 * This instance of our Application willl the beginning of our application's LifeCycle control
 * As you start the application, the onCreate() function allows the application to load into your phones memory.
 * Unlike when we switch between pages and such, this Application class will be able to run until the
 * user STOPS the application completely by exiting the application.
 *
 * This onCreate() gets created at startup and destroyed when the app closes. Calling the Context() object
 * from the Repository, the object will be valid while the application is running in memory.
 */
class ClosetApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        ClosetRepository.initialize(this)
    }
}