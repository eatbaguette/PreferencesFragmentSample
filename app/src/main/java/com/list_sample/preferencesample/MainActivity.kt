package com.list_sample.preferencesample

import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.preference.PreferenceManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    private lateinit var msharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.msharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)

        showPreferenceButton.setOnClickListener {
            val method = if (msharedPreferences.getBoolean("isCalledByActivity", false)) "activity" else "fragment"
            Toast.makeText(this, method + " で表示します", Toast.LENGTH_SHORT).show()

            if (method == "activity") {

                val intent = Intent(this, SettingActivity::class.java)
                startActivity(intent)
            } else {
                // フラグメントのセットアップ
                supportFragmentManager.beginTransaction()
                        .replace(R.id.content, PreferenceDemoFragment())
                        .addToBackStack(null)
                        .commit()
            }
        }
    }
}
