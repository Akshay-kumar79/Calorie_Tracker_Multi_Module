package com.akshaw.calorietrackermultimodule.navigation

import androidx.navigation.NavController
import com.akshaw.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate){
    this.navigate(event.route)
}