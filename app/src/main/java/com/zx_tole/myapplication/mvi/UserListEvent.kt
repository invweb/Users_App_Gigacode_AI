package com.zx_tole.myapplication.mvi

sealed interface UserListEvent {
    data object LoadUsers : UserListEvent
    data class UserClicked(val user: com.zx_tole.myapplication.User) : UserListEvent
    data object Retry : UserListEvent
}
