package com.group.libraryapp.dto.book.response

import com.group.libraryapp.type.BookType

data class BookStatResponse(val type: BookType, val count: Int)
