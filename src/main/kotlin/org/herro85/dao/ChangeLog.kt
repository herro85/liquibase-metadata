package org.herro85.dao

import com.google.gson.annotations.SerializedName

data class ChangeLog(
    @SerializedName("changeLog")
    val changeSets: List<ChangeSet>
)

data class ChangeSet (
    @SerializedName("changeSet")
    val changeSet: ChangeSetDetails
)

data class ChangeSetDetails (
    val id: String,
    val author: String,
    val changes: List<Change>
)

sealed class Change {
    abstract val tag: String
}

data class CreateTableChange (
    override val tag: String,
    val tableName: String,
    val columns: List<Column>
) : Change()

data class AddColumnChange (
    override val tag: String,
    val tableName: String,
    val column: Column
) : Change()

data class DropTableChange (
    override val tag: String,
    val tableName: String
) : Change()

data class ModifyColumnChange (
    override val tag: String,
    val tableName: String,
    val column: Column
) : Change()

data class TagChange (
    override val tag: String
) : Change()

data class Column (
    val name: String,
    val type: String
)