package uk.org.lidalia
package exampleapp.server.services

import uk.org.lidalia.exampleapp.system.db.changelog.Migrator.changeSet
import uk.org.lidalia.exampleapp.system.db.changelog.Migrator.createTable
import uk.org.lidalia.exampleapp.system.db.changelog.Migrator.column

package object profiles {

  val userProfileTableCreation =
    changeSet(
      id = "userProfileTableCreation",
      createTable(
        tableName = "user_profile",
        column(
          name = "user_id",
          dataType = "UUID"
        ),

        column(
          name = "username",
          dataType = "varchar(1024)"
        ),

        column(
          name = "password",
          dataType = "varchar(1024)"
        )
      )
    )
}
