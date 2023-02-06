package uz.abbosbek.wallpaper_app.adapte

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import uz.abbosbek.wallpaper_app.MainActivity
import uz.abbosbek.wallpaper_app.R
import uz.abbosbek.wallpaper_app.model.WallPaperData

class WallPaperAdapter(val cotext: Context, val wallImageList: ArrayList<WallPaperData>) :
    RecyclerView.Adapter<WallPaperAdapter.WallpaperViewHolder>()
        {
            inner class WallpaperViewHolder(val v:View):RecyclerView.ViewHolder(v){
                val wallpaperImage= v.findViewById<ImageView>(R.id.wall_image)
            }

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WallpaperViewHolder {
                val inflater = LayoutInflater.from(parent.context)
                val v = inflater.inflate(R.layout.wall_paper_item, parent, false)

                return WallpaperViewHolder(v)
            }

            override fun onBindViewHolder(holder: WallpaperViewHolder, position: Int) {
                val newListWall = wallImageList[position]
                holder.wallpaperImage.setImageResource(newListWall.walImage)
                holder.wallpaperImage.setOnClickListener {
                    val wallInt = Intent(cotext,MainActivity::class.java)
                    wallInt.putExtra("wallImg",newListWall.walImage)
                    cotext.startActivity(wallInt)
                }
            }

            override fun getItemCount(): Int = wallImageList.size
        }