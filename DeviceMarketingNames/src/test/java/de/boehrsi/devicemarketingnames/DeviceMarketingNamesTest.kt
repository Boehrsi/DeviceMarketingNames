package de.boehrsi.devicemarketingnames

import de.boehrsi.devicemarketingnames.DeviceMarketingNames.getFirst
import de.boehrsi.devicemarketingnames.DeviceMarketingNames.getList
import junit.framework.TestCase

class DeviceMarketingNamesTest : TestCase() {
    private val model = "SM-J250F"
    private val modelFirstResult = "Galaxy Grand Prime Pro"
    private val modelResult = "Galaxy Grand Prime Pro / Galaxy J2 / Galaxy J2 Pro"
    private val modelExampleList = "some / device / data"
    private val modelExampleSome = "some"
    private val modelExampleDevice = "device"
    private val modelExampleData = "data"
    private val modelExampleInvalid = "invalid_data"
    private val modelExampleEmpty = ""

    fun testGetNamesFromModel() {
        val result = DeviceMarketingNames.getNamesFromModel(model)

        assertEquals(modelResult, result)
    }

    fun testGetNamesFromModelAsList() {
        val result = DeviceMarketingNames.getNamesFromModelAsList(model)

        assertEquals(3, result.size)
        assertTrue(result.contains(modelFirstResult))
    }

    fun testGetFirstNameFromModel() {
        val result = DeviceMarketingNames.getSingleNameFromModel(model)

        assertEquals(modelFirstResult, result)
    }

    fun testGetFirstNameFromUnknownModel() {
        val result = DeviceMarketingNames.getSingleNameFromModel(modelExampleInvalid)

        assertEquals(modelExampleInvalid, result)
    }

    fun testGetFirstNameFromNoModel() {
        val result = DeviceMarketingNames.getSingleNameFromModel(modelExampleEmpty)

        assertEquals(modelExampleEmpty, result)
    }

    fun testGetListMultipleDevices() {
        val result = modelExampleList.getList()

        assertEquals(3, result.size)
        assertTrue(result.contains(modelExampleSome))
        assertTrue(result.contains(modelExampleDevice))
        assertTrue(result.contains(modelExampleData))
    }

    fun testGetListSingleDevice() {
        val result = modelExampleDevice.getList()

        assertEquals(1, result.size)
        assertTrue(result.contains(modelExampleDevice))
    }

    fun testGetListNoDevice() {
        val input = modelExampleEmpty

        val result = input.getList()

        assertEquals(1, result.size)
        assertTrue(result.contains(modelExampleEmpty))
    }

    fun testGetFirstMultipleDevices() {
        val input = modelExampleList

        val result = input.getFirst()

        assertEquals(modelExampleSome, result)
    }

    fun testGetFirstSingleDevice() {
        val result = modelExampleDevice.getFirst()

        assertEquals(modelExampleDevice, result)
    }

    fun testGetFirstNoDevice() {
        val input = modelExampleEmpty

        val result = input.getFirst()

        assertEquals(modelExampleEmpty, result)
    }
}