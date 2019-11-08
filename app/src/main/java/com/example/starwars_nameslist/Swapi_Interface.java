package com.example.starwars_nameslist;



import java.util.ArrayList;
import com.example.starwars_nameslist.Personagem;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Swapi_Interface {
    @GET("people/{numero}/?format=json")
    Call<Personagem> PegarDados(@Path("numero") String num);
    void onConnectionTimeout();

}

