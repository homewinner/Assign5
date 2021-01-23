package com.example.assign5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tAdd = Toast.makeText(applicationContext,"Can't increase more than 9.", Toast.LENGTH_LONG)
        val tMin = Toast.makeText(applicationContext,"Can't decrease more than 0.", Toast.LENGTH_LONG)
        val tRes = Toast.makeText(applicationContext,"The number has been reset.", Toast.LENGTH_LONG)
        var count = 0

        add.setOnClickListener(){
            if (count >= 0 && count < 9){
                count++
                txt1.setText("$count")
            }else{
                tAdd.show()
            }
        }
        min.setOnClickListener(){
            if (count > 0 && count <= 9){
                count--
                txt1.setText("$count")
                tMin.show()
            }
        }
        res.setOnClickListener(){
            count = 0
            txt1.setText("$count")
            tRes.show()
        }
    }
}