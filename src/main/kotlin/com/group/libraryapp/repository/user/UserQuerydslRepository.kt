package com.group.libraryapp.repository.user

import com.group.libraryapp.domain.user.QUser
import com.group.libraryapp.domain.user.User
import com.group.libraryapp.domain.user.loanhistory.QUserLoanHistory
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Component

@Component
class UserQuerydslRepository(private val queryFactory: JPAQueryFactory) {
    fun findAllWithHistories(): MutableList<User> = queryFactory
        .select(QUser.user).distinct()
        .from(QUser.user).leftJoin(QUserLoanHistory.userLoanHistory)
        .on(QUserLoanHistory.userLoanHistory.user.id.eq(QUser.user.id)).fetchJoin()
        .fetch()
}