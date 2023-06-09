package com.example.eTransport.ui.home


import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.example.eTransport.Products
import com.google.firebase.database.DatabaseReference

class HomeViewModel : ViewModel() {
    private lateinit var dbref : DatabaseReference
    private lateinit var productRecyclerView: RecyclerView
    private lateinit var productArrayList : ArrayList<Products>





}