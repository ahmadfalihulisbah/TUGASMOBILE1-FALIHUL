package u.falih

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMatch.setOnClickListener{randomJodoh()}

    }

    fun randomJodoh() {
        val randomcowok: Int = Random().nextInt(5) + 1
        val randomcewek: Int = Random().nextInt(5) + 1
        val drawableRescowok: Int = when (randomcowok) {
            1 -> R.drawable.ck1
            2 -> R.drawable.ck2
            3 -> R.drawable.ck3
            4 -> R.drawable.ck4
            else -> R.drawable.ck5
        }
        val drawableRescewek: Int = when (randomcewek) {
            1 -> R.drawable.cw1
            2 -> R.drawable.cw2
            3 -> R.drawable.cw3
            4 -> R.drawable.cw4
            else -> R.drawable.cw5
        }
        ivco1.setImageResource(drawableRescowok)
        ivce1.setImageResource(drawableRescewek)
    }
}

