package com.zx_tole.myapplication.mvi

import com.zx_tole.myapplication.User

sealed interface UserListState {
    data object Idle : UserListState
    data object Loading : UserListState
    data class Success(val users: List<User>) : UserListState
    data class Error(val message: String, val canRetry: Boolean = true) : UserListState
}
