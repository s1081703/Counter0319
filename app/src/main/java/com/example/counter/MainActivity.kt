package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener, View.OnLongClickListener{

    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.setOnClickListener(this)
        btn.setOnClickListener(this)
        button6.setOnClickListener(this)
        btnn.setOnClickListener(this)
        txv.setOnLongClickListener(this)
        //txv.setOnTouchListener(this)
        txv.text = counter.toString()
        btnHappy.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                counter= (1..100).random()
                txv.text = counter.toString()
            }
        })

    }


    override fun onClick(view: View)  {
        if (view == txv || view == btn){
            counter++
        }else if (view == button6){
            counter += 2
        }
        else{
            counter = 0
        }

        txv.text = counter.toString()
    }

    override fun onLongClick(p0: View?): Boolean {
        counter+=2
        txv.text = counter.toString()
        return true
    }
}