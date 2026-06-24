package com.zx_tole.myapplication.mvi

import com.zx_tole.myapplication.User

sealed interface UserListEffect {
    data class NavigateToDetails(val user: User) : UserListEffect
    data class ShowError(val message: String, val canRetry: Boolean = true) : UserListEffect
}
