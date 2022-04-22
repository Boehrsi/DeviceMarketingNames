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

    fun testData() {
        val result0 = DeviceMarketingNames.getNamesFromModel("001HT")
        val result1 = DeviceMarketingNames.getNamesFromModel("10 Plus")
        val result2 = DeviceMarketingNames.getNamesFromModel("2000_000170_00")
        val result3 = DeviceMarketingNames.getNamesFromModel("3000")
        val result4 = DeviceMarketingNames.getNamesFromModel("4003J")
        val result5 = DeviceMarketingNames.getNamesFromModel("5-Inches")
        val result6 = DeviceMarketingNames.getNamesFromModel("6002")
        val result7 = DeviceMarketingNames.getNamesFromModel("701HW")
        val result8 = DeviceMarketingNames.getNamesFromModel("80-1")
        val result9 = DeviceMarketingNames.getNamesFromModel("9 inch SDU")
        val resultA = DeviceMarketingNames.getNamesFromModel("A-TT00")
        val resultB = DeviceMarketingNames.getNamesFromModel("B BOT 550")
        val resultC = DeviceMarketingNames.getNamesFromModel("C Bot Tab 70")
        val resultD = DeviceMarketingNames.getNamesFromModel("D-805XATV HD")
        val resultE = DeviceMarketingNames.getNamesFromModel("E-Tab 4G")
        val resultF = DeviceMarketingNames.getNamesFromModel("F and U Android TV")
        val resultG = DeviceMarketingNames.getNamesFromModel("G Guard SMART TV")
        val resultH = DeviceMarketingNames.getNamesFromModel("H-35")
        val resultI = DeviceMarketingNames.getNamesFromModel("I star two")
        val resultJ = DeviceMarketingNames.getNamesFromModel("J101")
        val resultK = DeviceMarketingNames.getNamesFromModel("K-BOOK73G")
        val resultL = DeviceMarketingNames.getNamesFromModel("L-01E")
        val resultM = DeviceMarketingNames.getNamesFromModel("M BOT TAB 100")
        val resultN = DeviceMarketingNames.getNamesFromModel("N-01D")
        val resultO = DeviceMarketingNames.getNamesFromModel("O2 TV Box")
        val resultP = DeviceMarketingNames.getNamesFromModel("P-01K")
        val resultQ = DeviceMarketingNames.getNamesFromModel("Q Explorist HR")
        val resultR = DeviceMarketingNames.getNamesFromModel("R1 HD")
        val resultS = DeviceMarketingNames.getNamesFromModel("S-SAB220")
        val resultT = DeviceMarketingNames.getNamesFromModel("T-01D")
        val resultU = DeviceMarketingNames.getNamesFromModel("U FEEL")
        val resultV = DeviceMarketingNames.getNamesFromModel("V TAB 10'' LITE")
        val resultW = DeviceMarketingNames.getNamesFromModel("W-K130-EEA")
        val resultX = DeviceMarketingNames.getNamesFromModel("X MAX")
        val resultY = DeviceMarketingNames.getNamesFromModel("Y10")
        val resultZ = DeviceMarketingNames.getNamesFromModel("Z-2252")
        val resultLowercaseA = DeviceMarketingNames.getNamesFromModel("a4")
        val resultLowercaseB = DeviceMarketingNames.getNamesFromModel("b1-720")
        val resultLowercaseC = DeviceMarketingNames.getNamesFromModel("calgary")
        val resultLowercaseD = DeviceMarketingNames.getNamesFromModel("d-01H")
        val resultLowercaseE = DeviceMarketingNames.getNamesFromModel("e-tab 20")
        val resultLowercaseF = DeviceMarketingNames.getNamesFromModel("f400")
        val resultLowercaseG = DeviceMarketingNames.getNamesFromModel("g06")
        val resultLowercaseH = DeviceMarketingNames.getNamesFromModel("h33")
        val resultLowercaseI = DeviceMarketingNames.getNamesFromModel("i-STYLE 713")
        val resultLowercaseJ = DeviceMarketingNames.getNamesFromModel("jupiter")
        val resultLowercaseK = DeviceMarketingNames.getNamesFromModel("keeby")
        val resultLowercaseL = DeviceMarketingNames.getNamesFromModel("l4300")
        val resultLowercaseM = DeviceMarketingNames.getNamesFromModel("mDESK")
        val resultLowercaseN = DeviceMarketingNames.getNamesFromModel("nJoy_Arcas_7")
        val resultLowercaseO = DeviceMarketingNames.getNamesFromModel("omega_lite_4")
        val resultLowercaseP = DeviceMarketingNames.getNamesFromModel("pearl")
        val resultLowercaseQ = DeviceMarketingNames.getNamesFromModel("quattro")
        val resultLowercaseR = DeviceMarketingNames.getNamesFromModel("realme SA Smart TV")
        val resultLowercaseS = DeviceMarketingNames.getNamesFromModel("s4")
        val resultLowercaseT = DeviceMarketingNames.getNamesFromModel("tab10")
        val resultLowercaseU = DeviceMarketingNames.getNamesFromModel("uie4027lgu")
        val resultLowercaseV = DeviceMarketingNames.getNamesFromModel("v7-EEA")
        val resultLowercaseW = DeviceMarketingNames.getNamesFromModel("w6")
        val resultLowercaseX = DeviceMarketingNames.getNamesFromModel("xTablet-A680")
        val resultLowercaseY = DeviceMarketingNames.getNamesFromModel("yetruepad21")
        val resultLowercaseZ = DeviceMarketingNames.getNamesFromModel("zx70")
        assertEquals(result0, "Desire HD")
        assertEquals(result1, "10 Plus")
        assertEquals(result2, "rephone")
        assertEquals(result3, "3000")
        assertEquals(result4, "PIXI3(4)")
        assertEquals(result5, "5-Inches")
        assertEquals(result6, "G3 Pro")
        assertEquals(result7, "HUAWEI MediaPad M3 Lite")
        assertEquals(result8, "Maxwell 10 / Maxwell-10")
        assertEquals(result9, "SDU")
        assertEquals(resultA, "A-TT00")
        assertEquals(resultB, "B bot 550")
        assertEquals(resultC, "C bot tab 70")
        assertEquals(resultD, "D-805XATV HD")
        assertEquals(resultE, "chagall")
        assertEquals(resultF, "Greece")
        assertEquals(resultG, "G Guard SMART TV")
        assertEquals(resultH, "H-35")
        assertEquals(resultI, "I star two")
        assertEquals(resultJ, "J101")
        assertEquals(resultK, "K-BOOK73G")
        assertEquals(resultL, "LG Optimus G")
        assertEquals(resultM, "M bot tab 100")
        assertEquals(resultN, "MEDIAS PP N-01D")
        assertEquals(resultO, "O2 TV Box")
        assertEquals(resultP, "P-01K")
        assertEquals(resultQ, "Wear")
        assertEquals(resultR, "R1 HD")
        assertEquals(resultS, "S-SAB220")
        assertEquals(resultT, "REGZA Phone T-01D")
        assertEquals(resultU, "U FEEL")
        assertEquals(resultV, "VT10E2")
        assertEquals(resultW, "Y50")
        assertEquals(resultX, "X MAX")
        assertEquals(resultY, "Y10 / Y10_1 / Y10_1_EEA / Y10_EEA")
        assertEquals(resultZ, "Z-2252")
        assertEquals(resultLowercaseA, "a4")
        assertEquals(resultLowercaseB, "B1-720")
        assertEquals(resultLowercaseC, "Devour")
        assertEquals(resultLowercaseD, "d-01H")
        assertEquals(resultLowercaseE, "e-tab 20")
        assertEquals(resultLowercaseF, "F400")
        assertEquals(resultLowercaseG, "g06+")
        assertEquals(resultLowercaseH, "H-33")
        assertEquals(resultLowercaseI, "i-STYLE 713")
        assertEquals(resultLowercaseJ, "B.PROカーナビ / CyberNavi / Navigation")
        assertEquals(resultLowercaseK, "Intel Jasper Lake Chromebook")
        assertEquals(resultLowercaseL, "L4300")
        assertEquals(resultLowercaseM, "mDESK")
        assertEquals(resultLowercaseN, "Arcas 7")
        assertEquals(resultLowercaseO, "Omega Lite 4")
        assertEquals(resultLowercaseP, "NETBOX")
        assertEquals(resultLowercaseQ, "quattro")
        assertEquals(resultLowercaseR, "realme SA Smart TV")
        assertEquals(resultLowercaseS, "s4")
        assertEquals(resultLowercaseT, "tab10")
        assertEquals(resultLowercaseU, "U+tv UHD3")
        assertEquals(resultLowercaseV, "v7-EEA")
        assertEquals(resultLowercaseW, "w6")
        assertEquals(resultLowercaseX, "xTablet-A680")
        assertEquals(resultLowercaseY, "yetruepad21")
        assertEquals(resultLowercaseZ, "ZX70")
    }
}