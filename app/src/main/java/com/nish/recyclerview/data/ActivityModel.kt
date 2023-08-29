package com.nish.recyclerview.data

import com.nish.recyclerview.data.ActivityStatus

// this will help to hold data of the activity model
data class ActivityModel(
    val image: Int = 1,
    var activityName: String = "",
    var activityTime: String = "",
    var activityDescription: String = "",
    var activityStatus: ActivityStatus = ActivityStatus.Pending


)
