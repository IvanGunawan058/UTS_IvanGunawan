package com.ivan.utsrecyleview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Kucing(
        val imgKucing: Int,
        val nameKucing: String,
        val descKucing: String
) : Parcelable
