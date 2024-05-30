package org.herro85

import org.herro85.service.JsonParserService

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val parser = JsonParserService()
    val changeLog = parser.parse("src/test/resources/liquibase-config/example-changelog.json")
    println(changeLog)
}