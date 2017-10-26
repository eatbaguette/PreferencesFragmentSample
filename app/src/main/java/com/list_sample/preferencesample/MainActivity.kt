package com.list_sample.preferencesample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // フラグメントのセットアップ
        supportFragmentManager.beginTransaction()
                .replace(R.id.content, PreferenceDemoFragment())
                .commit()
    }
}
