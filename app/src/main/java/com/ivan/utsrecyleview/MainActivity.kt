package com.ivan.utsrecyleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kucingList = listOf<Kucing>(
            Kucing(
                R.drawable.persia,
                "Kucing Persia",
                "Kucing persia menjadi jenis kucing ras asing yang pertama diimpor ke Thailand"
            ),
            Kucing(
                R.drawable.anggora,
                "Kucing Anggora",
                "Kucing Anggora memiliki ciri khas pada bentuk kepalanya yang segitiga berbulu lebat menyerupai singa dengan hidung yang lebih mancung dari kucing jenis lainnya"
            ),
            Kucing(
                R.drawable.siam,
                "Kucing Siam",
                "Kucing Siam merupakan jenis kucing dengan ras oriental yang populer di Thailand dan paling terkenal dari semua jenis kucing pedigree"
            ),
            Kucing(
                R.drawable.ragdoll,
                "Kucing Ragdoll",
                "Kucing Ragdoll merupakan jenis kucing asal Amerika Serikat dengan nama asli Ragdoll yang diambil dari sifatnya yang jinak layaknya sebuah boneka"
            ),
            Kucing(
                R.drawable.mainecoon,
                "Kucing Maine Coon",
                "Kucing Maine Coon merupakan jenis kucing paling besar dari semua jenis Kucing Domestik. Rata-rata berat Kucing Maine Coon mencapai 15 kilogram"
            ),
            Kucing(
                R.drawable.sphynx,
                "Kucing Sphynx",
                "Kucing Sphynx adalah salah satu jenis kucing yang unik karena hampir tidak memiliki bulu sama sekali"
            ),
            Kucing(
                R.drawable.russianblue,
                "Kucing Russian Blue",
                "Kucing Russian Blue berasal dari daerah pelabuhan Arkhangelsk, Rusia. Kucing jenis ini memiliki bulu yang anggun dan mata hijau yang berkilau"
            ),
            Kucing(
                R.drawable.bengal,
                "Kucing Bengal",
                "Jenis Kucing Bengal sebenarnya adalah campuran dari berbagai ras kucing seperti Abyssinian, American Shorthair, Burmese, Egyptian Mau dan Asian Leopard. Kucing Bengal bahkan masih satu keluarga dengan macan tutul"
            ),
            Kucing(
                R.drawable.munchkin,
                "Kucing Munchkin",
                "Kucing Munchkin memiliki ciri khas bentuk tubuh yang unik, yakni tubuh mungil meskipun usianya sudah dewasa. Bentuk kaki pun pendek dan mungil"
            ),
            Kucing(
                R.drawable.britishshorthair,
                "Kucing British Shorthair",
                "Kucing British Shorthair adalah jenis kucing yang ideal sebagai hewan peliharaan karena bentuk tubuhnya yang sempurna"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_kucing)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = KucingAdapter(this, kucingList){
            val intent = Intent (this, DetailKucingActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}