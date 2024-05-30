package org.herro85.org.herro85.service

import com.google.gson.InstanceCreator
import org.herro85.dao.Change
import org.herro85.dao.CreateTableChange
import java.lang.reflect.Type

class ChangeAbstractClassCreator : InstanceCreator<Change> {

    override fun createInstance(type: Type): Change {
        // Logic to determine the concrete subclass to instantiate
        // This could involve checking for specific fields in the JSON or other criteria

        // Example: Create a default concrete subclass
        return CreateTableChange()
    }
}