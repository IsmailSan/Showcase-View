package com.example.materialshowcase

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialshowcase.databinding.ActivityMainBinding
import com.getkeepsafe.taptargetview.TapTarget
import com.getkeepsafe.taptargetview.TapTargetView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        TapTargetView.showFor(this,
        TapTarget.forView(binding.btEnter, "Tap this button",
            "You will be redirected to Second Activity"
        ).outerCircleColor(R.color.teal_200)
            .outerCircleAlpha(0.96f)
            .targetCircleColor(R.color.white)
            .titleTextSize(10)
            .titleTextColor(R.color.white)
            .descriptionTextSize(10)
            .descriptionTextColor(R.color.black)
            .textColor(R.color.black)
            .textTypeface(Typeface.SANS_SERIF)
            .dimColor(R.color.black)
            .drawShadow(true)
            .cancelable(false)
            .tintTarget(true)
            .transparentTarget(true)
            .targetRadius(60),

            object : TapTargetView.Listener() {
                override fun onTargetClick(view: TapTargetView?) {
                    super.onTargetClick(view)
                    val intent = Intent (this@MainActivity,SecondActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }



        )






    }
}