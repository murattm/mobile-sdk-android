package com.crowdin.platform.example

import android.app.Application
import com.crowdin.platform.Crowdin
import com.crowdin.platform.CrowdinConfig
import com.crowdin.platform.repository.remote.NetworkType
import com.crowdin.platform.utils.FilePathPlaceholder

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Crowdin.init(applicationContext,
                CrowdinConfig.Builder()
                        .withDistributionKey("d32682e5a6a5f53a950d934e2eee861e")
                        .withFilePaths("values-${FilePathPlaceholder.getAndroidCode()}/strings.xml",
                                "arrays.xml",
                                "plurals.xml")
                        .withNetworkType(NetworkType.WIFI)
                        .build())
    }
}