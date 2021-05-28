package com.fero.elearning.ui.bookmark

import com.fero.elearning.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
