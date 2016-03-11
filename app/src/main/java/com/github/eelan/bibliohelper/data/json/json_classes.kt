package com.github.eelan.bibliohelper.data.json

import java.net.URL
import java.util.*

/**
 * Created by Jansens on 11/03/2016.
 */

data class BookResult(val kind: String, val totalItems: Int, val items: Book)

data class Book(val kind: String, val id: String, val etag: String, val selfLink: URL, val volumeInfo: VolumeInfo, val saleInfo: SaleInfo, val accessInfo: AccessInfo, val searchInfo: SearchInfo)
data class VolumeInfo(val title: String, val authors: List<String>, val publisher: String, val publishedDate: Date, val description: String, val industryIdentifiers: ISBN, val readingModes: ReadingMode, val pageCount: Int, val printType: String, val categories: List<String>, val averageRating: Float, val ratingsCount: Int, val maturityRating: String, val allowAnonLogging: Boolean, val contentVersion: String, val imageLinks: ImagesLink, val language: String, val previewLink: URL, val infoLink: URL, val canonicalVolumeLink: URL)
data class ISBN(val type: String, val identifier: String)
data class ReadingMode(val text: Boolean, val image: Boolean)
data class ImagesLink(val smallThumbnail: URL, val thumbnail: URL)
data class SaleInfo(val country: Locale, val saleability: String, val isEbook: Boolean)
data class AccessInfo(val country: Locale, val viewability: String, val embeddable: Boolean, val publicDomain: Boolean, val textToSpeechPermission: String, val epub: Boolean, val pdf: Boolean, val webReaderLink: URL, val accessViewStatus: String, val quoteSharingAllowed: Boolean)
data class SearchInfo(val textSnippet: String)

// TODO : Vérifier epub.isAvailable, pdf.isAvalaible