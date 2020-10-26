package com.mj.gof_builder_pattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bodyBuilder = Body.Builder()
        bodyBuilder.weight(80)
        bodyBuilder.height(183)
        bodyBuilder.name("MJ")

        val body = Body(bodyBuilder)


        val bodyConsumerClass = BodyConsumerClass(body)
        bodyConsumerClass.showResult()


    }



}