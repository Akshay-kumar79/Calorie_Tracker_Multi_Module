package com.akshaw.tracker_presentation.tracker_overview

import androidx.annotation.DrawableRes
import com.akshaw.core.R
import com.akshaw.core.util.UiText
import com.akshaw.tracker_domain.model.MealType

data class Meal(
    val name: UiText,
    @DrawableRes val drawableRes: Int,
    val mealType: MealType,
    val carbs: Int = 0,
    val protein: Int = 0,
    val fat: Int = 0,
    val calories: Int = 0,
    val isExpanded: Boolean = false
)

val defaultMeals = listOf(
    Meal(
        name = UiText.DynamicString(MealType.Breakfast.name),
        drawableRes = R.drawable.ic_breakfast,
        mealType = MealType.Breakfast
    ),
    Meal(
        name = UiText.DynamicString(MealType.Lunch.name),
        drawableRes = R.drawable.ic_lunch,
        mealType = MealType.Lunch
    ),
    Meal(
        name = UiText.DynamicString(MealType.Dinner.name),
        drawableRes = R.drawable.ic_dinner,
        mealType = MealType.Dinner
    ),
    Meal(
        name = UiText.DynamicString(MealType.Snack.name),
        drawableRes = R.drawable.ic_snack,
        mealType = MealType.Snack
    ),
)
