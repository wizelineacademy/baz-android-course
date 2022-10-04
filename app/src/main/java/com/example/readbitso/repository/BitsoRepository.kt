package com.example.readbitso.repository

import com.example.readbitso.ds.room.dao.entity.AskBids
import com.example.readbitso.ds.room.dao.entity.Currencies
import com.example.readbitso.ds.room.dao.entity.Operationstrades
import com.example.readbitso.models.bitsoModels.bitsoBooks.Books
import com.example.readbitso.models.bitsoModels.bitsoBooks.BooksPayload
import com.example.readbitso.models.bitsoModels.bitsoBooks.bitsotickers.PayloadTickers
import com.example.readbitso.models.bitsoModels.bitsoBooks.bitsotickers.Tickers
import com.example.readbitso.models.bitsoModels.bitsoBooks.trading.PayloadTrades
import com.example.readbitso.models.bitsoModels.bitsoBooks.trading.Trades
import io.reactivex.rxjava3.core.Observable
import kotlinx.coroutines.flow.Flow

import retrofit2.Response

interface BitsoRepository {
    fun getRfBitsoBooks(): Observable<Books> // rxjava
    suspend fun getRfBitsoBids(ticker: String): Flow<Response<Tickers>>
    suspend fun getRfBitsoTrades(ticker: String): Flow<Response<Trades>>

    suspend fun insertDbBooks(book: List<BooksPayload>)
    suspend fun insertDbTrades(trades: List<PayloadTrades>)
    suspend fun insertDbAsk(openedPayloadsCoin: List<PayloadTickers>)

    suspend fun getDbBooks(): Flow<List<Currencies>>
    suspend fun getDbTrades(): Flow<List<Operationstrades>>
    suspend fun getDbAskBids(): Flow<List<AskBids>>

    suspend fun selectActualToken(key1: String, key2: String)
    suspend fun getActualToken(key: String): String?
    suspend fun setActualView(key: String, value: String)
    suspend fun getActualView(key: String): String?

    suspend fun internetError(error: Throwable):List<BooksPayload>
    suspend fun setInternetFlag(key: String, value: String)
    suspend fun getInternetFlag(key: String): String?

    suspend fun getretrofitresponse(): Flow<Response<Books>>
}
