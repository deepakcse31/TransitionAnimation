package com.example.dipractice.Adapter

import android.app.Activity
import android.app.ActivityOptions
import android.content.ClipData
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.dipractice.MainActivity2
import com.example.dipractice.R

class MovieListAdapter(val listItem: List<String>,val context: Activity) : RecyclerView.Adapter<MovieListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(
            R.layout.list_recyclerview_item,
            parent,
            false
        )
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: MovieListAdapter.ViewHolder, position: Int) {
        holder.image.setOnClickListener {

            var intent= Intent(context, MainActivity2::class.java)
            // var activityCompat : ActivityOptionsCompat= ActivityOptionsCompat.makeSceneTransitionAnimation(this,i1,ViewCompat.getTransitionName(i1))

            // Apply activity transition


            holder.image.setTransitionName("image_transition");
            val options = ActivityOptions.makeSceneTransitionAnimation(context, holder.image, holder.image.transitionName)
            context.startActivity(intent, options.toBundle())
        }

    }

    override fun getItemCount(): Int {
        return listItem.size
    }
    class ViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview)
    {
        lateinit var image : ImageView
        init {
             image =itemview.findViewById(R.id.image)

        }


    }
    interface GridImageItemClickListener {
        fun onItemClick( imageView: ImageView)
    }
}