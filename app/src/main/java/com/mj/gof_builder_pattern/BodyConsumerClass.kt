package com.mj.gof_builder_pattern

import android.util.Log

class BodyConsumerClass(private val body: Body){

    fun showResult() {

        Log.d("Height", body.height.toString())
        Log.d("Weight", body.weight.toString())
        Log.d("Name", body.name.toString())
    }

}