package jp.developer.bbee.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyListAdapter(private val data: MutableList<ListItem>): RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = data[position].title
        holder.subTitle.text = data[position].subTitle
        holder.desc.text = data[position].desc
        holder.deleteButton.setImageResource(android.R.drawable.ic_delete)

        val p = position
        holder.deleteButton.setOnClickListener {
            data.removeAt(p)
            notifyItemRemoved(p)
            notifyItemRangeChanged(p, itemCount)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
