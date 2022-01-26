package com.example.dipractice

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Transition
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.app.ActivityOptionsCompat
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dipractice.Adapter.MovieListAdapter
import com.example.dipractice.Repositary.HomeRepository
import com.example.dipractice.di.Car
import com.example.dipractice.util.CShowProgress
import com.example.dipractice.util.NetworkUtil
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint//base class ke under jitne bhi dependcy hogi use main class access kar sakta hai
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car
   // @Inject
   // lateinit var one: one
    //@Inject
   //lateinit var homeRepository: HomeRepository
   private lateinit var networkUtil: NetworkUtil
    lateinit var progress : CShowProgress

    lateinit var recyclerView: RecyclerView
    var listItem = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var parentimage:ImageView = findViewById(R.id.image)
        var hello : TextView=findViewById(R.id.helloworld)
        recyclerView=findViewById(R.id.parentrecyclerview)
        recyclerView.layoutManager= LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL,false)
        recyclerView.setHasFixedSize(true)
        for (i in 0..10)
        {
            listItem.add(i.toString())
        }
        recyclerView.adapter= MovieListAdapter(listItem,this)

        networkUtil = NetworkUtil(this)

        hello.setOnClickListener {

            var intent=Intent(this,MainActivity2::class.java)
           // var activityCompat : ActivityOptionsCompat= ActivityOptionsCompat.makeSceneTransitionAnimation(this,i1,ViewCompat.getTransitionName(i1))

            // Apply activity transition
            val options = ActivityOptions.makeSceneTransitionAnimation(this, parentimage, "image_transition")
            startActivity(intent, options.toBundle())


            // startActivity(i1,activityCompat.toBundle())
        }
        networkUtil.observe(this, {

            Log.d("natechange--->","natechange--->"+it)
            if(it == true){

            }else{

            }
        }
        )

      /*  car.getcar()
     //   one.getname()
        Log.d("Deepak","Deepak"+car.getcar())

        CoroutineScope(Dispatchers.IO).launch {
            //repository.getMovieList(1)
          //  var mydata =homeRepository.getMovieList(1)
            //Log.d("mydata","mydata"+mydata)
        }

       */

         fun onItemClick(imageView: ImageView) {
            val detailIntent = Intent(this, MainActivity2::class.java)
           // val imageViewPair = Pair.create<View, String>(imageView, getString(R.string.image_transition_name))
           // val textViewPair = Pair.create<View, String>(textView, getString(R.string.text_transition_name))
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, imageView, "image_transition")
           // detailIntent.putExtra(LargeImageDetailActivity.DATA, item)
            startActivity(detailIntent, options.toBundle())
        }

    }


}