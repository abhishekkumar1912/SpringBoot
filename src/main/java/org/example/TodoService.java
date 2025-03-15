package org.example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TodoService {

    //call means, making a call, then return oboject, then fun name..
    @GET("/todos/{id}")
    Call<Todo> getTodoById(@Path("id") String id);
}
