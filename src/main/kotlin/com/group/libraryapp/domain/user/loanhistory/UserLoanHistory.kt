package com.group.libraryapp.domain.user.loanhistory

import com.group.libraryapp.domain.user.User
import com.group.libraryapp.type.UserLoanStatus
import javax.persistence.*

@Entity
class UserLoanHistory(
    @ManyToOne
    val user: User,
    val bookName: String,
    var status: UserLoanStatus = UserLoanStatus.LOANED,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
) {
    fun doReturn() {
        this.status = UserLoanStatus.RETURNED
    }

    companion object {
        fun fixture(user: User, bookName: String = "이상한 나라의 엘리스", status: UserLoanStatus = UserLoanStatus.LOANED, id: Long? = null) = UserLoanHistory(user, bookName, status, id)
    }
}