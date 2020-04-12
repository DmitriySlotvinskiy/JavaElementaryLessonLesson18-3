package com.slotvinskiy;

import com.slotvinskiy.api.ApiManager;
import com.slotvinskiy.model.*;
import com.slotvinskiy.model.user.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        callAlbums();
        callPhotos();
        callUsers();
        callPosts();
        callToDos();
        callComments();
        ApiManager.close();
    }

    private static void callAlbums() {
        ApiManager.getApiService().getAlbums().enqueue(new Callback<List<Album>>() {
            @Override
            public void onResponse(Call<List<Album>> call, Response<List<Album>> response) {

                if (!response.isSuccessful()) {
                    System.out.println("Code: " + response.code());
                    return;
                }
                List<Album> albums = response.body();
                if (albums != null) {
                    System.out.println("albums.size: " + albums.size());
                    System.out.println(albums);
                }
            }

            @Override
            public void onFailure(Call<List<Album>> call, Throwable throwable) {
                System.out.println(throwable);
            }
        });
    }

    private static void callPhotos() {
        ApiManager.getApiService().getPhotos().enqueue(new Callback<List<Photo>>() {
            @Override
            public void onResponse(Call<List<Photo>> call, Response<List<Photo>> response) {
                List<Photo> photos = response.body();
                if (photos != null) {
                    System.out.println("photos.size: " + photos.size());
                    System.out.println(photos);
                }
            }

            @Override
            public void onFailure(Call<List<Photo>> call, Throwable throwable) {
                System.out.println(throwable);
            }
        });
    }

    private static void callUsers() {
        ApiManager.getApiService().getUsers().enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                List<User> users = response.body();
                if (users != null) {
                    System.out.println("users.size: " + users.size());
                    System.out.println(users);
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable throwable) {
                System.out.println(throwable);
            }
        });
    }

    private static void callPosts() {
        ApiManager.getApiService().getPosts().enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                List<Post> posts = response.body();
                if (posts != null) {
                    System.out.println("posts.size: " + posts.size());
                    System.out.println(posts);
                }
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable throwable) {
                System.out.println(throwable);
            }
        });
    }

    private static void callToDos() {
        ApiManager.getApiService().getToDos().enqueue(new Callback<List<ToDo>>() {
            @Override
            public void onResponse(Call<List<ToDo>> call, Response<List<ToDo>> response) {
                List<ToDo> toDo = response.body();
                if (toDo != null) {
                    System.out.println("toDo.size: " + toDo.size());
                    System.out.println(toDo);
                }
            }

            @Override
            public void onFailure(Call<List<ToDo>> call, Throwable throwable) {
                System.out.println(throwable);
            }
        });
    }

    private static void callComments() {
        ApiManager.getApiService().getComments().enqueue(new Callback<List<Comment>>() {
            @Override
            public void onResponse(Call<List<Comment>> call, Response<List<Comment>> response) {
                List<Comment> comments = response.body();
                if (comments != null) {
                    System.out.println("comments.size: " + comments.size());
                    System.out.println(comments);
                }
            }

            @Override
            public void onFailure(Call<List<Comment>> call, Throwable throwable) {
                System.out.println(throwable);
            }
        });
    }
}
