package com.sathish.moviesearch.data.repositories

import com.sathish.moviesearch.data.model.SearchResults
import com.sathish.moviesearch.data.network.ApiInterface
import com.sathish.moviesearch.data.network.SafeApiRequest

class HomeRepository(
    private val api: ApiInterface
) : SafeApiRequest() {

    suspend fun getMovies(
        searchTitle: String,
        apiKey: String,
        pageIndex: Int
    ): SearchResults {

        return apiRequest { api.getSearchResultData(searchTitle, apiKey, pageIndex) }
    }


}