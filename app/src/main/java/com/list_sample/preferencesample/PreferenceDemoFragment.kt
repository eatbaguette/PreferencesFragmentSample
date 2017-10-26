package com.list_sample.preferencesample

import android.content.Context
import android.os.Bundle
import android.support.v14.preference.PreferenceFragment
import android.support.v7.preference.PreferenceFragmentCompat
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by monkey on 2017/10/25.
 */

class PreferenceDemoFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        activity.showPreferenceButton.visibility = 4

        addPreferencesFromResource(R.xml.preferences)
    }

    override fun onDetach() {
        super.onDetach()
        activity.showPreferenceButton.visibility = 0
    }
}
