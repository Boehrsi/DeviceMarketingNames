package de.boehrsi.devicemarketingnames

import android.os.Build
import de.boehrsi.devicemarketingnames.data.lookupAndroidName

/**
 * Get the marketing names of the device or for a given model.
 *
 * For more information please see the [documentation](https://github.com/Boehrsi/DeviceMarketingNames/blob/main/README.md).
 */
object DeviceMarketingNames {
    private var deviceNames: String? = null

    /**
     * Get all marketing names of the device. If multiple names match the model, those are concatenated and separated by " / ".
     * The model used for the lookup is determined by [Build.MODEL]. Lookup results are cached.
     *
     * @return the marketing names of the device.
     * @see getSingleName to get only one of the marketing names.
     * @see getNamesAsList to get all matching marketing names as list.
     */
    fun getNames(): String = deviceNames ?: lookupAndroidName(Build.MODEL).also { deviceNames = it }

    /**
     * Get all marketing names of the device as list.
     * The model used for the lookup is determined by [Build.MODEL]. Lookup results are cached.
     *
     * @return the marketing names of the device.
     * @see getSingleName to get only one of the marketing names.
     * @see getNames to get all matching marketing names as single string.
     */
    fun getNamesAsList(): List<String> = getNames().getList()

    /**
     * Get one marketing name of the device. If multiple names match the model, the first match is selected.
     * The model used for the lookup is determined by [Build.MODEL]. Lookup results are cached.
     *
     * @return the marketing name of the device.
     * @see getNames to get all matching marketing names as single string.
     * @see getNamesAsList to get all matching marketing names as list.
     */
    fun getSingleName(): String = getNames().getFirst()

    /**
     * Get all marketing names for the given model. If multiple names match the model, those are concatenated and separated by " / ".
     *
     * @return the marketing names of the model.
     * @see getSingleNameFromModel to get only one of the marketing names.
     * @see getNamesFromModelAsList to get all matching marketing names as list.
     */
    fun getNamesFromModel(model: String): String = lookupAndroidName(model)

    /**
     * Get all marketing names for the given model as list.
     *
     * @return the marketing names of the model.
     * @see getSingleNameFromModel to get only one of the marketing names.
     * @see getNamesFromModel to get all matching marketing names as single string.
     */
    fun getNamesFromModelAsList(model: String): List<String> = getNamesFromModel(model).getList()

    /**
     * Get one marketing name for the given model. If multiple names match the model, the first match is selected.
     *
     * @return the marketing name of the device.
     * @see getNamesFromModel to get all matching marketing names as single string.
     * @see getNamesFromModelAsList to get all matching marketing names as list.
     */
    fun getSingleNameFromModel(model: String): String = getNamesFromModel(model).getFirst()

    internal fun String.getList() = split("/").map { it.trim() }

    internal fun String.getFirst() = getList().first()
}

