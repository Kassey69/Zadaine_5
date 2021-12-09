package select.exafrgmple5.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var userRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val userList:List<User> = listOf(
            User("Ivan", 26),
            User("Elena", 19),
            User("Anna", 21),
            User("Maxim", 100)
        )

        userRecyclerView = findViewById(R.id.user_recyclar_view)
        userRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        userRecyclerView.adapter = UserAdapter(userList)

        userRecyclerView.addItemDecoration(DividerItemDecoration
            (this,DividerItemDecoration.VERTICAL))
    }
}

// RecyclerView <- Adapter <- ViewHolder <- layout
// 1. LayoutManager - a) LinearLayoutManager
// (работает либо сверху вниз, либо слева направо вывести вссе элементы) и
// b) GridLayoutManager(сколько нужно столбцов)
// 2. Adapter

//RecyclerView  DONE
//Adapter - DONE
//ViewHolder - DONE
//layout - DONE

