package e.wizard_san.gedai

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btncadastrar) as Button
        val btn2 = findViewById<Button>(R.id.btnentrar) as Button

        btn1.setOnClickListener {
            val intent = Intent(this@MainActivity,Main2Activity::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent2 = Intent(this@MainActivity,LoginActivity::class.java)
            startActivity(intent2)
        }



    }
}
