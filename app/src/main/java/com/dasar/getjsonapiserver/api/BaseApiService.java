package com.dasar.getjsonapiserver.api;

import com.dasar.getjsonapiserver.model.ResponseDosen;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BaseApiService {
    @GET("read_dosen.php")
    Call<ResponseDosen> getSemuaDosen();
}
