package com.albion.labs.texts

class IPDefanger {
    companion object {
        fun defangIPaddr(address: String): String {
            val n = address.split(".")
            var result = ""
            for(i in n.indices) {
                result += n[i]
                if(i != n.size - 1) {
                    result += "[.]"
                }
            }
            return result
        }
    }
}