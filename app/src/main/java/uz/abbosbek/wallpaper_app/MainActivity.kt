package uz.abbosbek.wallpaper_app

import android.app.WallpaperManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var bSetWallPaper:Button? = null
    private lateinit var wallImg: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wallImg = findViewById(R.id.wallpaper_image)
        val wallInt = intent.extras
        val newWallImg = wallInt!!.getInt("wallImg")
        wallImg.setImageResource(newWallImg)

        val wallPaperManager = WallpaperManager.getInstance(applicationContext)

        bSetWallPaper = findViewById(R.id.set_wallpaper_button)

        bSetWallPaper!!.setOnClickListener {
            try {
                wallPaperManager.setResource(newWallImg)
            }catch (e:Exception){
                e.printStackTrace()
            }
        }

    }
}