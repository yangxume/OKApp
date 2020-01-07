package com.ok.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.okay.lib.svg.dom.SVGDomManager
import com.okay.lib.svg.dom.ScaleRenderConfig
import com.okay.lib.svg.widget.SVGDisplayView

class SvgLoadActivity : AppCompatActivity() {

    val svg_url : String = "https://fa.okjiaoyu.cn/group1/M00/90/7E/CgoHyl2cMsGAPcFsAAABeW9Vuko825.svg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_svg_load)
        val displayView = findViewById<SVGDisplayView>(R.id.svgdisplayview)
        (findViewById<Button>(R.id.btn_load)).setOnClickListener {
            Thread(Runnable {
                val document = SVGDomManager.parseNet(svg_url)
                displayView.post {
                    displayView.loadDom(document, ScaleRenderConfig())
                }
            }).start()
        }
        (findViewById<Button>(R.id.btn_reset)).setOnClickListener { displayView.reset() }
    }
}
