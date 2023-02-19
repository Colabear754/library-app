package com.group.libraryapp.domain.user

import com.group.libraryapp.domain.user.QUser.user
import com.group.libraryapp.domain.user.loanhistory.QUserLoanHistory.userLoanHistory
import com.querydsl.jpa.impl.JPAQueryFactory

class UserRepositoryCustomImpl(private val jpaQueryFactory: JPAQueryFactory) : UserRepositoryCustom {
    override fun findAllWithHistories(): MutableList<User> = jpaQueryFactory
        .select(user).distinct()
        .from(user).leftJoin(userLoanHistory)
        .on(userLoanHistory.user.id.eq(user.id)).fetchJoin()
        .fetch()
}