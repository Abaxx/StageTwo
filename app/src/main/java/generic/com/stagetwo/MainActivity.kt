package generic.com.stagetwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var textview: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textview = findViewById(R.id.textView2)

         //print out name code
        print()

    }

    fun display(view: View)
    {
        val input = findViewById<EditText>(R.id.input)
        val edit = input.text.toString().trim();
        textview.text = edit
    }

    fun print()
    {
        val name = "Akande Abass"
        Log.v("myname",name)
    }
}