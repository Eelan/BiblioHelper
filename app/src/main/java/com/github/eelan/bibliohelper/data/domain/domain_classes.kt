package com.github.eelan.bibliohelper.data.domain


/**
 * Created by Jansens on 16/03/2016.
 */

data class BookList(val booksList: List<Book>) {
    operator fun get(position: Int) = booksList[position]
    val size = booksList.size
}

data class Book(val idBook: String, val title: String, val author: String, val cover: String, val description: String)