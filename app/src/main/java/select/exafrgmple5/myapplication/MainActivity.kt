package select.exafrgmple5.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MyTag"

class MainActivity : AppCompatActivity() {

    lateinit var switchFragmentButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switchFragmentButton= findViewById(R.id.run_fragments_button)

        val newFragment=NewFragment()
        val oldFragment=OldFragment()

        switchFragmentButton.setOnClickListener {
            val fragment =
                when (supportFragmentManager.findFragmentById(R.id.fragment_container)){
                    is NewFragment -> oldFragment
                    is OldFragment -> newFragment
                    else -> newFragment
                }

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
        }
    }
}

// Создать новое приложение и реализовать в нем смену двух фрагментов
// 03_11_21 задание   Реализация приложения с дизайном,
// транзакциями фрагментов, работой с View и жизненным циклом
