package com.linkedin.android.tachyon

data class DayViewConfig(
        val startHour: Int,
        val endHour: Int,
        val dividerHeight: Int,
        val halfHourHeight: Int,
        val hourDividerColor: Int,
        val halfHourDividerColor: Int,
        val hourLabelWidth: Int,
        val hourLabelMarginEnd: Int,
        val eventMargin: Int
)