package com.list_sample.preferencesample

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by monkey on 2017/10/26.
 */
class SettingActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)


        // フラグメントのセットアップ
        supportFragmentManager.beginTransaction()
                .replace(R.id.content_activity_setting, PreferenceDemoFragment())
                .commit()
    }
}