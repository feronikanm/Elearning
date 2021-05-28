package com.fero.elearning.ui.reader

interface CourseReaderCallback {
    fun moveTo(position: Int, moduleId: String)
}