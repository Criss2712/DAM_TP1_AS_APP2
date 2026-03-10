package dam_a51038.systeminfo

import android.os.Bundle
import android.os.Build
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editTextTextMultiLine2 = findViewById<EditText>(R.id.editTextTextMultiLine2)

        val systemInfo = StringBuilder()
        systemInfo.append("Manufacturer: ${Build.MANUFACTURER}\n")
        systemInfo.append("Model: ${Build.MODEL}\n")
        systemInfo.append("Brand: ${Build.BRAND}\n")
        systemInfo.append("Type: ${Build.TYPE}\n")
        systemInfo.append("User: ${Build.USER}\n")
        systemInfo.append("Base: ${Build.VERSION_CODES.BASE}\n")
        systemInfo.append("Incremental: ${Build.VERSION.INCREMENTAL}\n")
        systemInfo.append("SDK: ${Build.VERSION.SDK_INT}\n")
        systemInfo.append("Version Code: ${Build.VERSION.RELEASE}\n")
        systemInfo.append("Display: ${Build.DISPLAY}\n")


        editTextTextMultiLine2.setText(systemInfo.toString())
    }
}