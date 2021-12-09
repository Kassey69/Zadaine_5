package select.exafrgmple5.myapplication

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class UserViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {

    private val nameTextView:TextView = itemView.findViewById(R.id.name_test_view)
    private val ageTextView:TextView = itemView.findViewById(R.id.age_test_view)

    fun bind(user:User){
        nameTextView.text ="Имя- ${user.name}"
        ageTextView.text ="Имя- ${user.age}"

        itemView.setOnClickListener {
            Toast.makeText(itemView.context,user.name,Toast.LENGTH_LONG).show()
        }
    }
}