package com.hk.replyui

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var replyList: ArrayList<String>
    private lateinit var adapter: ReplyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById<RecyclerView>(R.id.replyRv)
        val curvedImage: ImageView = findViewById(R.id.imageView11)
        val reply = findViewById<EditText>(R.id.replyEt)
        val sendBtn = findViewById<ImageView>(R.id.send)

        replyList = arrayListOf<String>("Tom","Sam","Ben")

        if (replyList.isEmpty()){
            curvedImage.visibility = View.INVISIBLE
        }
        adapter = ReplyAdapter(replyList)
        recyclerView.adapter = adapter

        sendBtn.setOnClickListener {
            val text = reply.text.toString()
            replyList.add(0,text)
            adapter = ReplyAdapter(replyList)
            recyclerView.adapter = adapter
        }
    }
}