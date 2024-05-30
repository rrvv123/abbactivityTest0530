package kr.ac.kopo.abbactivitytest0530

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var rg : RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rg = findViewById<RadioGroup>(R.id.rg)
        rg.check(R.id.radiobtnSecond)
        var intent = Intent(applicationContext, SecondActivity::class.java)
        rg.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.radiobtnSecond -> intent = Intent(applicationContext, SecondActivity::class.java)
                R.id.radiobtnThird -> intent = Intent(applicationContext, ThirdActivity::class.java)
            }
        }

        var btnMain = findViewById<Button>(R.id.btnMain)
        btnMain.setOnClickListener {
            startActivity(intent)
        }
    }
}