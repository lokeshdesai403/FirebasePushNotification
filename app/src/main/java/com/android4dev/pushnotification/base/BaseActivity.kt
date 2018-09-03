package com.android4dev.pushnotification.base

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.android4dev.pushnotification.R

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}
