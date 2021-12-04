package com.example.figmaappp


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_training_task.view.*
import kotlinx.android.synthetic.main.fragment_tasks.*
import kotlinx.android.synthetic.main.fragment_tasks.view.*
import kotlin.math.sign


class Task : Fragment(R.layout.fragment_tasks) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = layoutInflater.inflate(R.layout.fragment_tasks, container, false)

        view.task_grammar.setOnClickListener {

            val intent = Intent(context, signIn::class.java)
            startActivity(intent)

        }

        view.task_training.setOnClickListener {
            val intent = Intent(context, training_task::class.java)
            startActivity(intent)
        }

        return view
    }

    }


