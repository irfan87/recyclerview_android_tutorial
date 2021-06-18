package com.irfanshukri203.recyclerviewtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todoList = mutableListOf<Todo>()

        val adapter = TodoAdapter(todoList)

        rvTodos.adapter = adapter
        rvTodos.layoutManager = LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {
            val todoTitle = etTodoText.text.toString()
            val todo = Todo(todoTitle, false)

            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size - 1)
        }
    }
}