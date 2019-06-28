package com.albion.labs.lang

import java.io.File
import java.net.URL

class FileOperation {
    companion object {
        fun openFile(path: String): List<String> = File(path).readLines()
        fun openFile(url: URL) : String = url.readText(Charsets.UTF_8)
    }

}