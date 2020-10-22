package com.crowdin.platform.example

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.crowdin.platform.Crowdin

abstract class BaseActivity : AppCompatActivity() {

    /**
     * We should wrap the base context of our activities, which is better to put it
     * on BaseActivity, so that we don't have to repeat it for all activities one-by-one.
     */
    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(Crowdin.wrapContext(newBase))
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        com.crowdin.crowdin_controls.onActivityResult(this, requestCode)
    }
}
