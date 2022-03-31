package jp.developer.bbee.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val data: MutableList<ListItem> = setDataList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startRecyclerView()
    }

    private fun setDataList(): MutableList<ListItem> {
        val retList = mutableListOf(
            ListItem(1, "Ryzen 9 5950X", "85800円",
                "AMD Ryzen 9 5950X without cooler 3.4GHz 16コア / 32スレッド 72MB 105W", ),
            ListItem(2, "Core i9 12900KF", "71800円",
                "Intel Corei9 プロセッサー 12900KF 3.2GHz（ 最大 5.2GHz ） 第12世代 LGA 1700 BX8071512900KF"),
            ListItem(3, "Core i9 12900K", "74000円",
                "Intel Corei9 プロセッサー 12900K 3.2GHz（ 最大 5.2GHz ） 第12世代 LGA 1700 BX8071512900K"),
            ListItem(4, "Ryzen 9 5900X", "63300円",
                "AMD Ryzen 9 5900X without cooler 3.7GHz 12コア / 24スレッド 70MB 105W"),
            ListItem(5, "Ryzen 9 3950X", "66000円",
                "AMD Ryzen 9 3950X, without cooler 3.5GHz 16コア / 32スレッド 70MB 105W"),
            ListItem(6, "Core i9 12900", "67800円",
                "Intel Core i9-12900 2.4 GHz16コアLGA1700プロセッサー BX8071512900"),
            ListItem(7, "Core i9 12900F", "66800円",
                "Intel Core i9-12900F 2.4 GHz16コアLGA1700プロセッサーBX8071512900F"),
            ListItem(8, "Core i7 12700KF", "49500円",
                "Intel Corei7 プロセッサー 12700KF 3.6GHz（ 最大 5.0GHz ） 第12世代 LGA 1700 BX8071512700KF"),
            ListItem(9, "Core i7 12700K", "52000円",
                "Intel Corei7 プロセッサー 12700K 3.6GHz( 最大 5.0GHz ) 第12世代 LGA 1700 BX8071512700K/A"),
            ListItem(10, "Ryzen 9 3900XT", "60000円",
                "AMD Ryzen 9 3900XT without cooler 3.8GHz 12コア / 24スレッド 70MB 105W"),
            ListItem(11, "Ryzen 9 3900X", "58000円",
                "AMD Ryzen 9 3900X with Wraith Prism cooler 3.8GHz 12コア / 24スレッド 70MB 105W"),
            ListItem(12, "Core i7 12700", "44000円",
                "Intel Corei7 プロセッサー 12700K 3.6GHz( 最大 5.0GHz ) 第12世代 LGA 1700 BX8071512700K/A"),
        )
        return retList
    }

    private fun startRecyclerView() {
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true) // 固定サイズ時のパフォーマンス向上
        recyclerView.layoutManager = LinearLayoutManager(this).apply {
            orientation = LinearLayoutManager.VERTICAL
        }
        recyclerView.adapter = MyListAdapter(data)
    }
}