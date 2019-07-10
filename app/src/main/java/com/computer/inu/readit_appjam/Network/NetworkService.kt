package com.computer.inu.readit_appjam.Network

import com.computer.inu.readit_appjam.Network.Get.GetCategoryResponse
import com.computer.inu.readit_appjam.Network.Get.GetMainStorageResponse
import com.computer.inu.readit_appjam.Network.Post.PostContentsAddResponse
import com.computer.inu.readit_appjam.Network.Post.PostSigninResponse
import com.computer.inu.readit_appjam.Network.Post.PostSignupResponse
import com.computer.inu.readit_appjam.Network.Put.PutContentsScrabResponse
import com.computer.inu.readit_appjam.Network.Put.PutMakeFixContentResponse
import com.computer.inu.readit_appjam.Network.Put.PutScrapTrashResponse
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.*

interface NetworkService {
    /*    @GET("/signup/email")
        fun getEmailRedundancyResponse(
            @Query("email") email: String
        ): Call<GetEmailRedundancyResponse>*/

    @PUT("/api/contents/scrap/:contents_idx")
    fun putScrapTrashResponse(
        @Header("Content-Type") content_type: String,
        @Body() body: JsonObject
    ): Call<PutScrapTrashResponse>

    @POST("/user/signup")
    fun postSignupResponse(
        @Header("Content-Type") content_type: String,
        @Body() body: JsonObject
    ): Call<PostSignupResponse>

    @POST("/user/signin")
    fun postSigninResponse(
        @Header("Content-Type") content_type: String,
        @Body() body: JsonObject
    ): Call<PostSigninResponse>

    @GET("/storage/main")
    fun getMainStorageResponse(
        @Header("Content-Type") content_type: String,
        @Header("accesstoken") accesstoken: String
    ): Call<GetMainStorageResponse>

    @GET("/category")
    fun getCategoryResponse(
        @Header("Content-Type") content_type: String,
        @Header("accesstoken") accesstoken: String
    ): Call<GetCategoryResponse>

    @PUT("/contents/fix/{contents_idx}")
    fun putMakeFixContentResponse(
        @Header("Content-Type") content_type: String,
        @Header("accesstoken") accesstoken: String,
        @Path("contents_idx") contents_idx: Int
    ): Call<PutMakeFixContentResponse>

    @PUT("/contents/scrap/{contents_idx}")
    fun putContentsScrabtResponse(
        @Header("Content-Type") content_type: String,
        @Header("accesstoken") accesstoken: String,
        @Path("contents_idx") contents_idx: Int
    ): Call<PutContentsScrabResponse>

    @POST("/contents/add")
    fun postContentsAddResponse(
        @Header("Content-Type") content_type: String,
        @Header("accesstoken") accesstoken: String,
        @Body() body: JsonObject
    ): Call<PostContentsAddResponse>

    @PUT("/contents/delete/{contents_idx}")
    fun deleteResponse(
        @Header("Content-Type") content_type: String,
        @Header("accesstoken") accesstoken: String,
        @Path("contents_idx") contents_idx: Int
    ): Call<PutContentsScrabResponse>
}