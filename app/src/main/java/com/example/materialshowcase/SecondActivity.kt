package com.example.materialshowcase

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.materialshowcase.databinding.ActivityMainBinding
import com.example.materialshowcase.databinding.SecondActivityBinding
import com.getkeepsafe.taptargetview.TapTarget
import com.getkeepsafe.taptargetview.TapTargetSequence
import com.getkeepsafe.taptargetview.TapTargetView

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: SecondActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = SecondActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

         TapTargetSequence(this).targets(
                TapTarget.forView(binding.btOne, "Button 1", "This is button 1")
                    .outerCircleColor(R.color.teal_200)
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
                TapTarget.forView(binding.btTwo, "Button 2", "This is button 2")
                    .outerCircleColor(R.color.teal_200)
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
                TapTarget.forView(binding.fabBottom, "Floating Bottom", "This is Floating Bottom")
                    .outerCircleColor(R.color.teal_200)
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
                    .targetRadius(60)).listener(object: TapTargetSequence.Listener {


                override fun onSequenceFinish() {
                    Toast.makeText(this@SecondActivity,"Sequence Finished", Toast.LENGTH_SHORT).show()
                }

                override fun onSequenceStep(lastTarget: TapTarget?, targetClicked: Boolean) {
                    Toast.makeText(this@SecondActivity,"Great", Toast.LENGTH_SHORT).show()
                }

                override fun onSequenceCanceled(lastTarget: TapTarget?) {

                }
            }).start()


    }
}