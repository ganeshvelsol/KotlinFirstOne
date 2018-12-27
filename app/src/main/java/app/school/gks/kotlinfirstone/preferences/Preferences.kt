package app.school.gks.kotlinfirstone.preferences

import android.content.Context

public class Preferences(context : Context) {
    val PREF_NAME = "sharedPrefExmp"
    val PREF_LOGIN_COUNT = "lcount"

    val preference = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

    fun getLoginCount(): Int {
        return preference.getInt(PREF_LOGIN_COUNT, 0)
    }

    fun setLoginCount(count: Int) {
val editor=preference.edit();
        editor.putInt(PREF_LOGIN_COUNT,count)
        editor.apply()
    }
}