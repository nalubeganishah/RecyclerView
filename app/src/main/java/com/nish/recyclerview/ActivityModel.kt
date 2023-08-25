package com.nish.recyclerview
// this will help to hold data of the activity model
data class ActivityModel(
    val image: Int = 1,
    var activityName: String = "",
    var activityTime: String = "",
    var activityDescription: String = "",
    var activityStatus: ActivityStatus  = ActivityStatus.Pending

)
