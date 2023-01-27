package git.myapplication.retrofit2basic

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface EmgMedService {
    @GET("TBGGSCREECLSTM")
    fun getEmgMedData(@Query("KEY")KEY : String,
                      @Query("Type")Type : String): Call<EmgMedResponse>
}

