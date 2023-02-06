package uz.abbosbek.wallpaper_app.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.abbosbek.wallpaper_app.R
import uz.abbosbek.wallpaper_app.adapte.WallPaperAdapter
import uz.abbosbek.wallpaper_app.model.WallPaperData

class WallPaperActivity : AppCompatActivity() {

    private lateinit var wallPaperAdapter: WallPaperAdapter
    private lateinit var wallImageList:ArrayList<WallPaperData>
    private lateinit var wallPaperRec: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wall_paper)

        wallPaperRec = findViewById(R.id.wallRec)
        wallImageList = ArrayList()
        wallPaperAdapter = WallPaperAdapter(this, wallImageList)

        var layoutM = GridLayoutManager(applicationContext,2)
        layoutM.orientation = LinearLayoutManager.VERTICAL
        wallPaperRec.layoutManager = layoutM

        wallPaperRec.adapter = wallPaperAdapter

        wallPaperList()
    }
    private fun wallPaperList() {
        wallImageList.add(WallPaperData(R.drawable.image_1))
        wallImageList.add(WallPaperData(R.drawable.image_2))
        wallImageList.add(WallPaperData(R.drawable.image_3))
        wallImageList.add(WallPaperData(R.drawable.image_4))
        wallImageList.add(WallPaperData(R.drawable.image_4))
        wallImageList.add(WallPaperData(R.drawable.image_6))
        wallImageList.add(WallPaperData(R.drawable.image_6))
        wallImageList.add(WallPaperData(R.drawable.image_2))
        wallImageList.add(WallPaperData(R.drawable.image_3))
    }
}