package com.javalong.customview

import android.content.Intent
import android.graphics.Color
import android.graphics.PointF
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.javalong.customview.lib.EvaluationView
import com.javalong.customview.lib.StepView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btStepView.setOnClickListener({
            startActivity(Intent(this, StepViewActivity::class.java))
        })
        btEvaluationView.setOnClickListener({
            startActivity(Intent(this, EvaluationActivity::class.java))
        })
    }



}
