package com.slightech.marvin.seraphim

import android.app.Application
import kotlin.properties.Delegates

/**
 * @author Shion Tang
 * @date 2019/5/30.
 */
class HaloApp : Application() {

    override fun onCreate() {
        super.onCreate()

        instance = this
    }

    companion object {
        var instance: HaloApp by Delegates.notNull()
    }
}