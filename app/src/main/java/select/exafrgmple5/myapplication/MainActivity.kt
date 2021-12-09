package select.exafrgmple5.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var carRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        carRecyclerView= findViewById(R.id.car_recycler_view)

        val carList:List<Car> = listOf(
        Car("Ferrari", R.drawable.red_ferrari),
        Car("Audi", R.drawable.audi_gray),
        Car("Mercedes", R.drawable.mercedes_black)
        )

        carRecyclerView.layoutManager=
            LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        carRecyclerView.adapter=CarAdapter(carList)


    }
}


