package de.boehrsi.devicemarketingnames

import android.os.Build
import de.boehrsi.devicemarketingnames.data.lookupAndroidName

object DeviceMarketingNames {
    private var deviceNames: String? = null

    fun getNames(): String = deviceNames ?: lookupAndroidName(Build.MODEL).also { deviceNames = it }

    fun getNamesAsList(): List<String> = getNames().getList()

    fun getSingleName(): String = getNames().getFirst()

    fun getNamesFromModel(model: String): String = lookupAndroidName(model)

    fun getNamesFromModelAsList(model: String): List<String> = getNamesFromModel(model).getList()

    fun getSingleNameFromModel(model: String): String = getNamesFromModel(model).getFirst()

    internal fun String.getList() = split("/").map { it.trim() }

    internal fun String.getFirst() = getList().first()
}

