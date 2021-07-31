package com.example.contacts_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts_app.databinding.ActivityMainBinding
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration
import kotlin.math.log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var linearLayoutManager:LinearLayoutManager= LinearLayoutManager(this)
        linearLayoutManager.orientation=LinearLayoutManager.VERTICAL

        var contactsRecyclerView:RecyclerView=findViewById(R.id.contactsRecylerView)

        var madapter=ContactsAdapter1(dataSupplier.contactsList,this)

        //setting the Layout Manager and the adapter


        val binder=ActivityMainBinding.inflate(LayoutInflater.from(this))
        //binder contains the view reference of the activity_main XML file

        contactsRecyclerView.addItemDecoration(StickyHeaderDecoration(madapter,binder.root))

        contactsRecyclerView.adapter=madapter
        contactsRecyclerView.layoutManager=linearLayoutManager











    }

}