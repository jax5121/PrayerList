package com.example.prayerlist

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Prayer(val summary:String, val description: String): Parcelable