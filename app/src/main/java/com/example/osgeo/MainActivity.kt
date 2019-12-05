package com.example.osgeo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.osgeo.adapter.ProjectAdapter
import com.example.osgeo.model.Project
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val list = ArrayList<Project>()

    private val listName = arrayOf(
        "deegree",
        "GDAL/OGR",
        "GeoMoose",
        "GeoNetwork"
    )
    private val listImage = arrayOf(
        "https://www.osgeo.org/wp-content/uploads/Deegree_740x412_acf_cropped-1.png",
        "https://www.osgeo.org/wp-content/uploads/GDAL-1_740x412_acf_cropped.png",
        "https://www.osgeo.org/wp-content/uploads/GeoMoose.png",
        "https://www.osgeo.org/wp-content/uploads/GeoNetwork-1_740x412_acf_cropped.png"
    )
    private val listDesc = arrayOf(
        "deegree is open source software for spatial data infrastructures and the geospat…",
        "GDAL is a C++ translator library for more than 200 raster and vector geospatial …",
        "GeoMoose is a Web Client JavaScript Framework for displaying distributed cartogr…",
        "GeoNetwork is a catalog application to manage spatially referenced resources. It…"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMain.setHasFixedSize(true)
        rvMain.layoutManager = LinearLayoutManager(this)

        for (i in listName.indices) {
            list.add(Project(listName[i], listImage[i], listDesc[i]))

            if (listName.size - 1 == i) {
                val adapter = ProjectAdapter(list)
                adapter.notifyDataSetChanged()

                rvMain.adapter = adapter
            }
        }
    }
}
