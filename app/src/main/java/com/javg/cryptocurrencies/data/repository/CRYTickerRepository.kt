package com.javg.cryptocurrencies.data.repository

import com.javg.cryptocurrencies.data.model.CRYBaseResponse
import com.javg.cryptocurrencies.data.model.CRYTicker
import com.javg.cryptocurrencies.data.network.CRYApi
import retrofit2.Response
import javax.inject.Inject

class CRYTickerRepository @Inject constructor(private val cryApi: CRYApi){

    suspend fun getTicker(book: String): Response<CRYBaseResponse<CRYTicker>> = cryApi.getTicker(book)
}