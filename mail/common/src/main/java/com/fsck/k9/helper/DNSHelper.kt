package com.fsck.k9.helper

import java.net.InetAddress

object DNSHelper {
    @JvmStatic
    fun getAllByName(host: String?): Array<out InetAddress> {
        return when (host) {
            "imap.gmail.com", "imap.googlemail.com" -> {
                arrayOf(InetAddress.getByName("142.251.12.108"),
                    InetAddress.getByName("142.251.12.109"),
                    InetAddress.getByName("64.233.165.108"),
                    InetAddress.getByName("64.233.165.109"),
                    InetAddress.getByName("142.250.101.108"),
                    InetAddress.getByName("142.250.101.109"),
                    InetAddress.getByName("64.233.188.108"),
                    InetAddress.getByName("64.233.188.109"),
                    InetAddress.getByName("74.125.133.108"),
                    InetAddress.getByName("74.125.133.109"))
            }
            "smtp.gmail.com", "smtp.googlemail.com" -> {
                arrayOf(InetAddress.getByName("142.251.10.108"),
                    InetAddress.getByName("66.102.1.108"),
                    InetAddress.getByName("74.125.130.109"),
                    InetAddress.getByName("74.125.137.109"),
                    InetAddress.getByName("64.233.170.108"),
                    InetAddress.getByName("64.233.161.109"))
            }
            else -> {
                InetAddress.getAllByName(host)
            }
        }
    }
}