package com.axiasoft.android.zerocoins.ui.features.available_books.viewmodels

import androidx.lifecycle.ViewModel
import com.axiasoft.android.zerocoins.network.app.InternetConnectionAvailableLiveData
import com.axiasoft.android.zerocoins.ui.features.available_books.domain.models.data.exchange_order_book.ExchangeOrderBook

// View model for activity
class BookOrderViewModel : ViewModel() {

    var selectedBookOrder: ExchangeOrderBook = ExchangeOrderBook()

    var internetStatus = InternetConnectionAvailableLiveData()
}
