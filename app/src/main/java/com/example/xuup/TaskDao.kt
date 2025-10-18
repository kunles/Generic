package com.example.xuup

import android.icu.text.MessagePattern
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.google.common.net.HttpHeaders.FROM

@Dao
interface TaskDao {
    @Insert
    suspend fun insertTask(task: Task)
    @Update
    suspend fun updateTask(task: Task)
    @Delete
    suspend fun deleteTask(task: Task)
    @Query("Select * from task_table order by id ASC")
    fun getAllTasks(): LiveData<List<Task>>
    @Query("SELECT * FROM task_table WHERE id = :id")
    fun get(id: Long): LiveData<Task>
}