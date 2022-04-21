package de.boehrsi.devicemarketingnames

import android.os.Build
import de.boehrsi.devicemarketingnames.data.lookupAndroidName

object DeviceMarketingNames {
    fun getNames(): String = lookupAndroidName(Build.MODEL)

    fun getNamesAsList(): List<String> = getNames().getList()

    fun getFirstName(): String = getNames().getFirst()

    fun getNamesFromModel(model: String): String = lookupAndroidName(model)

    fun getNamesFromModelAsList(model: String): List<String> = getNamesFromModel(model).getList()

    fun getFirstNameFromModel(model: String): String = getNamesFromModel(model).getFirst()

    private fun String.getList() = split("/").map { it.trim() }

    private fun String.getFirst() = getList().first()
}

