package com.ivan.utsrecyleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailKucingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kucing)



        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val kucing = intent.getParcelableExtra<Kucing>(MainActivity.INTENT_PARCELABLE)

        val imgKucing = findViewById<ImageView>(R.id.img_item_photo)
        val nameKucing = findViewById<TextView>(R.id.tv_item_name)
        val descKucing = findViewById<TextView>(R.id.tv_item_description)

        imgKucing.setImageResource(kucing?.imgKucing!!)
        nameKucing.text = kucing.nameKucing
        descKucing.text = kucing.descKucing
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}