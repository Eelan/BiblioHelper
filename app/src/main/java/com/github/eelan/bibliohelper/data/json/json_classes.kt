package com.github.eelan.bibliohelper.data.json

import java.net.URL

/**
 * Created by Jansens on 11/03/2016.
 */

data class BookResult(val kind: String, val totalItems: Int, val items: List<Book>)

data class Book(val kind: String, val id: String, val etag: String, val selfLink: URL, val volumeInfo: VolumeInfo, val saleInfo: SaleInfo, val accessInfo: AccessInfo, val searchInfo: SearchInfo)
data class VolumeInfo(val title: String, val authors: List<String>, val publisher: String, val publishedDate: String, val description: String, val industryIdentifiers: List<ISBN>, val readingModes: ReadingMode, val pageCount: Int, val printType: String, val categories: List<String>, val averageRating: Float, val ratingsCount: Int, val maturityRating: String, val allowAnonLogging: Boolean, val contentVersion: String, val imageLinks: ImagesLink, val language: String, val previewLink: URL, val infoLink: URL, val canonicalVolumeLink: URL)
data class ISBN(val type: String, val identifier: String)
data class ReadingMode(val text: Boolean, val image: Boolean)
data class ImagesLink(val smallThumbnail: URL, val thumbnail: URL)
data class SaleInfo(val country: String, val saleability: String, val isEbook: Boolean)
data class AccessInfo(val country: String, val viewability: String, val embeddable: Boolean, val publicDomain: Boolean, val textToSpeechPermission: String, val epub: EPub, val pdf: PDF, val webReaderLink: URL, val accessViewStatus: String, val quoteSharingAllowed: Boolean)
data class EPub(val isAvailable: Boolean)
data class PDF(val isAvailable: Boolean)
data class SearchInfo(val textSnippet: String)