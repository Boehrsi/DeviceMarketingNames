package de.boehrsi.devicemarketingnames

import junit.framework.TestCase

class DeviceMarketingNamesTest : TestCase() {
    private val model = "SM-J250F"
    private val modelFirstResult = "Galaxy Grand Prime Pro"
    private val modelResult = "Galaxy Grand Prime Pro / Galaxy J2 / Galaxy J2 Pro"

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
        val result = DeviceMarketingNames.getFirstNameFromModel(model)

        assertEquals(modelFirstResult, result)
    }

    fun testGetFirstNameFromMissingModel() {
        val missingModel = "invalid_data"
        val result = DeviceMarketingNames.getFirstNameFromModel(missingModel)

        assertEquals(missingModel, result)
    }
}