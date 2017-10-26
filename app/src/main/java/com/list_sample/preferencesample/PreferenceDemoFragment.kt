package com.list_sample.preferencesample

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v14.preference.PreferenceFragment
import android.support.v7.preference.PreferenceFragmentCompat
import android.support.v7.preference.PreferenceManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by monkey on 2017/10/25.
 */

class PreferenceDemoFragment : PreferenceFragmentCompat() {
    private var isCalledByActivity: Boolean = true

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        isCalledByActivity = PreferenceManager.getDefaultSharedPreferences(activity).getBoolean("isCalledByActivity", false)

        if (!(isCalledByActivity)) activity.showPreferenceButton.visibility = View.INVISIBLE

        addPreferencesFromResource(R.xml.preferences)
    }

    override fun onDetach() {
        super.onDetach()

        if (!(isCalledByActivity)) activity.showPreferenceButton.visibility = View.VISIBLE

    }
}
