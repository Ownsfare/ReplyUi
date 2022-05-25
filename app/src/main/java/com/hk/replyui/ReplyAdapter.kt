package com.hk.replyui

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReplyAdapter(
    var replyList: ArrayList<String>
) : RecyclerView.Adapter<ReplyAdapter.ReplyViewHolder>() {
    class ReplyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var userName: TextView = itemView.findViewById(R.id.userName)
        var curvedImage: ImageView = itemView.findViewById(R.id.imageView6)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReplyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ReplyViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReplyViewHolder, position: Int) {
        holder.userName.text = replyList[position]
        Log.d("ab",position.toString())
        Log.d("ab",replyList.size.toString())
        if(position == replyList.size -1 ){
            holder.curvedImage.visibility = View.INVISIBLE
        }

    }

    override fun getItemCount(): Int {
        return replyList.size
    }
}