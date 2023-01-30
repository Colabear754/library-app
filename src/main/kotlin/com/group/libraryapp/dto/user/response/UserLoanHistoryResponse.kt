package com.group.libraryapp.dto.user.response

import com.group.libraryapp.domain.user.User

class UserLoanHistoryResponse(val name: String, val books: List<BookHistoryResponse>) {
    companion object {
        fun of(user: User) = UserLoanHistoryResponse(user.name, user.userLoanHistories.map(BookHistoryResponse::of))
    }
}