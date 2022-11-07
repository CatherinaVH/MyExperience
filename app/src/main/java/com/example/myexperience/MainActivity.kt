package com.example.myexperience

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getSupportActionBar()?.setTitle("")
    }

//    fun OnOptionMenuSelected(item: MenuItem) {
//        when (item.itemId.equals("Home")){
//
//
//        }

}