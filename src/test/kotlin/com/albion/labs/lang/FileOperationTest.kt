package com.albion.labs.lang

import org.junit.Test

class FileOperationTest {

    @Test
    fun openFileByPath() {
        val configPath = this.javaClass.classLoader.getResource("kyc.config")!!.path
        val lines = FileOperation.openFile(configPath)
        for (line in lines) {
            println("===== line: $line =====")
        }
    }

    @Test
    fun openFileByURL() {
        val url = this.javaClass.classLoader.getResource("kyc.config")!!
        val lines = FileOperation.openFile(url)
        println(lines)
    }
}