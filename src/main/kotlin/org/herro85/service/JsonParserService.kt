package org.herro85.service

import com.google.gson.GsonBuilder
import org.herro85.dao.ChangeLog
import org.herro85.dao.ChangeSet
import java.io.File

class JsonParserService {
    fun parse (fileName:String): ChangeLog {
        val jsonString = readFileToString(fileName)

        // Create a Gson instance
        val gson = GsonBuilder().create()

        // Parse the JSON string into a ChangeLog object
        val changeLog = gson.fromJson(jsonString, ChangeLog::class.java)

        // Now you can access the changelog data
        println(changeLog.changeSets.size)
        changeLog.changeSets.forEach { changeSet ->
            println(changeSet)
        }

        return changeLog
    }

    private fun readFileToString(filePath: String): String? {
        val file = File(filePath)
        return try {
            file.readText()
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}