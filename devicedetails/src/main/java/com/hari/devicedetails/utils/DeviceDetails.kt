package com.hari.devicedetails.utils

import java.lang.StringBuilder

public class DeviceDetails {

    companion object{
        fun deviceInfo(): String{

            val deviceName = android.os.Build.DEVICE
            val brandName = android.os.Build.BRAND
            val modelName = android.os.Build.MODEL
            val versionName = android.os.Build.VERSION.SDK_INT

            val deviceInfoBuilder = StringBuilder()
            deviceInfoBuilder.append(deviceName).append(brandName).append(modelName).append(versionName)
            return deviceInfoBuilder.toString()
        }
    }
}