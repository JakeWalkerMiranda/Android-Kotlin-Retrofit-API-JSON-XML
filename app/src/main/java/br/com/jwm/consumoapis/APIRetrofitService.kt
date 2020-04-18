package br.com.jwm.consumoapis

import retrofit2.http.GET
import retrofit2.Call
import retrofit2.http.Path

interface APIRetrofitService {

    /* Mapeando os caminhos (path) */

    @GET("{CEP}/json/")
    fun getEnderecoByJSON(@Path("CEP") CEP : String) : Call<CEP>

    @GET("{CEP}/xml/")
    fun getEnderecoByXML(@Path("CEP") CEP : String) : Call<CEP>

}