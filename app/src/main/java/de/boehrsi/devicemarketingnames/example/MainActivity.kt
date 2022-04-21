package de.boehrsi.devicemarketingnames.example

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import de.boehrsi.devicemarketingnames.DeviceMarketingNames

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.deviceName).text = DeviceMarketingNames.getSingleName()
        findViewById<TextView>(R.id.deviceNameList).text = DeviceMarketingNames.getNames()

        val model = "SM-J250F"
        findViewById<TextView>(R.id.customDeviceName).text = DeviceMarketingNames.getSingleNameFromModel(model)
        findViewById<TextView>(R.id.customDeviceNameList).text = DeviceMarketingNames.getNamesFromModel(model)
    }
}