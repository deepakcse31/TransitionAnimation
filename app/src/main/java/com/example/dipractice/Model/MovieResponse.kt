package com.example.dipractice.Model

data class MovieResponse (
    val page: Int,
    val results: List<result>,
    val total_pages: Int,
    val total_results: Int)