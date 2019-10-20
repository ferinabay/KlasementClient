package com.ferinabay.klasemenclient.Rest;

import com.ferinabay.klasemenclient.Model.Klasemen;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {
    @GET("/api/klasemen")
    Call<Klasemen> getId();

    @POST("/api/klasemen/")
    Call<Klasemen> postKlasemen(@Field("id_tim") Integer id_tim,
                                @Field("nama_tim") String nama_tim,
                                @Field("p") Integer p,
                                @Field("w") Integer w,
                                @Field("d") Integer d,
                                @Field("l") Integer l,
                                @Field("f") Integer f,
                                @Field("a") Integer a,
                                @Field("gd") Integer gd,
                                @Field("pts") Integer pts);


    @HTTP(method = "DELETE", path = "/api/klasemen/{id}", hasBody = true)
    Call<Klasemen> deleteKlasemen(@Field("id") Integer id);
}
