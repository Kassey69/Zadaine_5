package select.exafrgmple5.myapplication

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SportCarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val brandTextureView: TextView = itemView.findViewById(R.id.brand_text_view)
    private val speedTextureView: TextView = itemView.findViewById(R.id.speed_text_view)
    private val driftLevelTextureView: TextView = itemView.findViewById(R.id.driftLevel_text_view)
    private val colorTextureView: TextView = itemView.findViewById(R.id.color_text_view)

    fun bind(sportCar: Car.SportCar) {
        brandTextureView.text = "Brand -${sportCar.brand}"
        speedTextureView.text = "speed -${sportCar.speed}km/h"
        driftLevelTextureView.text = "Drift lvl -${sportCar.driftLevel}"
        colorTextureView.text = "Color - ${sportCar.color}"
    }

}