package com.github.eelan.bibliohelper.data

import com.github.eelan.bibliohelper.data.domain.BookList
import com.github.eelan.bibliohelper.data.json.BookResult
import com.github.eelan.bibliohelper.data.mapper.JsonMapper
import com.google.gson.Gson
import java.net.URL

/**
 * Created by Jansens on 16/03/2016.
 */
class JsonServer {

    val APP_ID = "AIzaSyAVsOY4c1O1xJygxf6XM3pRihrjH70YfKw"
    val SEARCH_QUERY = "isbn:9782070515790" //"isbn:9782070515790"
    val SEARCH_URL = "https://www.googleapis.com/books/v1/volumes?q=$SEARCH_QUERY&key=$APP_ID"

    fun getForecast(): BookList {
        val jsonStr = URL(SEARCH_URL).readText()
        val result = Gson().fromJson(jsonStr, BookResult::class.java)
        return JsonMapper.convertToDomain(result)
    }
}