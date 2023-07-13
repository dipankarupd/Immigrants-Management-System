package com.example.immigrantmanagementsystem.utils.navigation

sealed class Screen(val route: String) {
    // create all the screen objects and their routes

    // route for the login signup and password reset page
//    object Login: Screen("login_screen")
//    object SignUp: Screen("signup_screen")
//    object ForgotPassword: Screen("forgot_password")

    // routes for the normal users:
    object UserHome: Screen("user_home")
    object UserForm: Screen("user_form")

    // routes for the admin user:
    object AdminAuth: Screen("admin_auth")
    object AdminView: Screen("admin_view")
}
