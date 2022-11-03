package com.example.myexperience

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class werkErvaring(var datumVan: String, var datumTot: String, var school: String, var functie: String) : Parcelable {
}