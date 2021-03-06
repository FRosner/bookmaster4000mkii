package com.bantolomeus.dto

data class ChallengeDTO(
        val pagesPerDay: Long = 0,
        var pagesAheadOfPlan: Long = 0,
        val startPagesAheadOfPlan: Long = 0,
        var pagesSinceStart: Long = 0,
        var pagesEverRead: Long = 0,
        val dateStarted: String = ""
)
