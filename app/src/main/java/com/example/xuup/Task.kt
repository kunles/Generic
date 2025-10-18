package com.example.xuup

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_table")
data class Task(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,
    @ColumnInfo(name = "task_name")
    var title: String = "",
    @ColumnInfo(name = "task_desc")
    var description: String = "",
    @ColumnInfo(name = "task_date")
    var date: String = "",
    @ColumnInfo(name = "task_time")
    var time: String = "",
    @ColumnInfo(name = "task_status")
    var status: Boolean = false
)