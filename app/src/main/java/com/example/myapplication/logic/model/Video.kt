package com.example.myapplication.logic.model

import java.io.Serializable;

data class Video(
    val hits: List<Hit>,
    val total: Int,
    val totalHits: Int
) : Serializable {
    data class Hit(
        val comments: Int,
        val downloads: Int,
        val duration: Int,
        val id: Int,
        val likes: Int,
        val pageURL: String,
        val picture_id: String,
        val tags: String,
        val type: String,
        val user: String,
        val userImageURL: String,
        val user_id: Int,
        val videos: Videos,
        val views: Int
    ) : Serializable

    data class Videos(
        val large: Large,
        val medium: Medium,
        val small: Small,
        val tiny: Tiny
    ) : Serializable

    data class Large(
        val height: Int,
        val size: Int,
        val url: String,
        val width: Int
    ) : Serializable

    data class Medium(
        val height: Int,
        val size: Int,
        val url: String,
        val width: Int
    ) : Serializable

    data class Small(
        val height: Int,
        val size: Int,
        val url: String,
        val width: Int
    ) : Serializable

    data class Tiny(
        val height: Int,
        val size: Int,
        val url: String,
        val width: Int
    ) : Serializable
}