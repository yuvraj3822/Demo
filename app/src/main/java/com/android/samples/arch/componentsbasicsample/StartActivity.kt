package com.android.samples.arch.componentsbasicsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        Toast.makeText(this,"added",Toast.LENGTH_SHORT).show()
    }
}
