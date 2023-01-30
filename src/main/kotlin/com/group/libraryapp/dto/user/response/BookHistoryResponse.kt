package com.group.libraryapp.dto.user.response

import com.group.libraryapp.domain.user.loanhistory.UserLoanHistory

data class BookHistoryResponse(val name: String, val isReturn: Boolean) {
    companion object {
        fun of(history: UserLoanHistory) = BookHistoryResponse(name = history.bookName, isReturn = history.isReturn)
    }
}