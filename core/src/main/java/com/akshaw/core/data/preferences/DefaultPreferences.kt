package com.akshaw.core.data.preferences

import android.content.SharedPreferences
import com.akshaw.core.domain.model.ActivityLevel
import com.akshaw.core.domain.model.Gender
import com.akshaw.core.domain.model.GoalType
import com.akshaw.core.domain.model.UserInfo
import com.akshaw.core.domain.preferences.Preferences

class DefaultPreferences(
    private val shardPref: SharedPreferences
) : Preferences {

    override fun saveGender(gender: Gender) {
        shardPref.edit().putString(Preferences.KEY_GENDER, gender.name).apply()
    }

    override fun saveAge(age: Int) {
        shardPref.edit().putInt(Preferences.KEY_AGE, age).apply()
    }

    override fun saveWeight(weight: Float) {
        shardPref.edit().putFloat(Preferences.KEY_WEIGHT, weight).apply()
    }

    override fun saveHeight(height: Int) {
        shardPref.edit().putInt(Preferences.KEY_HEIGHT, height).apply()
    }

    override fun saveActivityLevel(level: ActivityLevel) {
        shardPref.edit().putString(Preferences.KEY_ACTIVITY_LEVEL, level.name).apply()
    }

    override fun saveGoalType(type: GoalType) {
        shardPref.edit().putString(Preferences.KEY_GOAL_TYPE, type.name).apply()
    }

    override fun saveCarbRatio(ratio: Float) {
        shardPref.edit().putFloat(Preferences.KEY_CARB_RATIO, ratio).apply()
    }

    override fun saveProteinRatio(ratio: Float) {
        shardPref.edit().putFloat(Preferences.KEY_PROTEIN_RATIO, ratio).apply()
    }

    override fun saveFatRatio(ratio: Float) {
        shardPref.edit().putFloat(Preferences.KEY_FAT_RATIO, ratio).apply()
    }

    override fun loadUserInfo(): UserInfo {
        val age = shardPref.getInt(Preferences.KEY_AGE, -1)
        val height = shardPref.getInt(Preferences.KEY_HEIGHT, -1)
        val weight = shardPref.getFloat(Preferences.KEY_WEIGHT, -1f)
        val genderString = shardPref.getString(Preferences.KEY_GENDER, null)
        val activityLevelString = shardPref.getString(Preferences.KEY_ACTIVITY_LEVEL, null)
        val goalTypeString = shardPref.getString(Preferences.KEY_GOAL_TYPE, null)
        val carbRatio = shardPref.getFloat(Preferences.KEY_CARB_RATIO, -1f)
        val proteinRatio = shardPref.getFloat(Preferences.KEY_PROTEIN_RATIO, -1f)
        val fatRatio = shardPref.getFloat(Preferences.KEY_FAT_RATIO, -1f)

        return UserInfo(
            gender = Gender.fromString(genderString),
            age = age,
            height = height,
            weight = weight,
            activityLevel = ActivityLevel.fromString(activityLevelString),
            goalType = GoalType.fromString(goalTypeString),
            carbRatio = carbRatio,
            proteinRatio = proteinRatio,
            fatRatio = fatRatio

        )
    }

    override fun saveShouldShowOnboarding(shouldShow: Boolean) {
        shardPref.edit().putBoolean(Preferences.KEY_SHOULD_SHOW_ONBOARDING, shouldShow).apply()
    }

    override fun loadShouldShowOnboarding(): Boolean {
        return shardPref.getBoolean(Preferences.KEY_SHOULD_SHOW_ONBOARDING, true)
    }
}