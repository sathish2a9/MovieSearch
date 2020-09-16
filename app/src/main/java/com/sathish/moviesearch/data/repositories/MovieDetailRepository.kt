package com.sathish.moviesearch.data.repositories

import com.sathish.moviesearch.data.model.MovieDetail
import com.sathish.moviesearch.data.network.ApiInterface
import com.sathish.moviesearch.data.network.SafeApiRequest

class MovieDetailRepository(
    private val api: ApiInterface
) : SafeApiRequest() {

    suspend fun getMovieDetail(
        title: String,
        apiKey: String
    ): MovieDetail {

        return apiRequest { api.getMovieDetailData(title, apiKey) }
    }


}