package com.github.eelan.bibliohelper.data.domain

import android.os.Parcel
import android.os.Parcelable


/**
 * Created by Jansens on 16/03/2016.
 */

data class BookList(val booksList: List<Book>) {
    operator fun get(position: Int) = booksList[position]
    val size = booksList.size
}

data class Book(val idBook: String, val title: String, val author: String, val cover: String, val description: String) : Parcelable {
    constructor(source: Parcel) : this(source.readString(), source.readString(), source.readString(), source.readString(), source.readString())

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(idBook);
        dest?.writeString(title);
        dest?.writeString(author);
        dest?.writeString(cover);
        dest?.writeString(description);
    }

    override fun describeContents(): Int = 0
}