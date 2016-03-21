package com.github.eelan.bibliohelper.data.mapper

import com.github.eelan.bibliohelper.data.domain.BookList
import com.github.eelan.bibliohelper.data.json.BookResult
import com.github.eelan.bibliohelper.data.domain.Book as DomainBook
import com.github.eelan.bibliohelper.data.json.Book as JsonBook

/**
 * Created by Jansens on 16/03/2016.
 */

object JsonMapper {
    fun convertToDomain(result: BookResult) = with(result) {
        BookList(convertListToDomain(items))
    }

    private fun convertListToDomain(list: List<JsonBook>) = list.map { convertItemToDomain(it) }

    private fun convertItemToDomain(item: JsonBook) = with(item) {
        DomainBook(idBook = id, title = volumeInfo.title, author = volumeInfo.authors[0], cover = volumeInfo.imageLinks.thumbnail.toString(), description = volumeInfo.description)
    }


    /*private fun convertTempToDomain(temp: Temperatures) = with(temp) {
        DomainTemperatures(day, min, max, night, eve, morn)
    }

    private fun fullUrl(icon: String) = "http://openweathermap.org/img/w/$icon.png"*/
}