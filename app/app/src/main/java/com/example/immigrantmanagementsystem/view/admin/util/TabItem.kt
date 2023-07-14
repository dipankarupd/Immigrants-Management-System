package com.example.immigrantmanagementsystem.view.admin.util

import androidx.compose.runtime.Composable
import com.example.immigrantmanagementsystem.view.admin.Screen.AcceptedScreen
import com.example.immigrantmanagementsystem.view.admin.Screen.AllScreen
import com.example.immigrantmanagementsystem.view.admin.Screen.PendingScreen
import com.example.immigrantmanagementsystem.view.admin.Screen.RejectedScreen

// represents the screen in tab layout
// type is composable func and returns nothing
typealias ComposableFun = @Composable () -> Unit

sealed class TabItem(val title: String, val screens: ComposableFun) {
    object All: TabItem("All", { AllScreen() })
    object Accepted: TabItem("Accepted", { AcceptedScreen() })
    object Rejected: TabItem("Rejected", { RejectedScreen() })
    object Pending: TabItem("Pending", { PendingScreen() })
}
