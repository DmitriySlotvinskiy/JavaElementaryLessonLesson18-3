package com.slotvinskiy.api;

import com.slotvinskiy.model.*;
import com.slotvinskiy.model.user.*;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface JsonplaceholderAPI {

    @GET("posts")
    Call<List<Post>> getPosts();

    @GET("comments")
    Call<List<Comment>> getComments();

    @GET("albums")
    Call<List<Album>> getAlbums();

    @GET("photos")
    Call<List<Photo>> getPhotos();

    @GET("users")
    Call<List<User>> getUsers();

    @GET("todos")
    Call<List<ToDo>> getToDos();

}
