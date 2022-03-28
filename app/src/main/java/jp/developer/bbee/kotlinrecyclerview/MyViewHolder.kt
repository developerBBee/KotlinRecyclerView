package jp.developer.bbee.kotlinrecyclerview

import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val title = itemView.findViewById<TextView>(R.id.title)
    val subTitle = itemView.findViewById<TextView>(R.id.subTitle)
    val desc = itemView.findViewById<TextView>(R.id.desc)
    val deleteButton = itemView.findViewById<ImageButton>(R.id.deleteButton)
}
