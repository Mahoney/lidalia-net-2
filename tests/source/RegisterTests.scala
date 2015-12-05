package uk.org.lidalia
package exampleapp.tests.functional

import org.slf4j.LoggerFactory
import uk.org.lidalia.exampleapp.tests.support.{EnvironmentTests, TestEnvironment, TestEnvironmentDefinition}
import uk.org.lidalia.scalalang.ResourceFactory

class RegisterTests(
  envDefinition: ResourceFactory[TestEnvironment]
) extends EnvironmentTests(
  envDefinition
) {

  def this() = this(TestEnvironmentDefinition())

  test("register") { environment =>
    LoggerFactory.getLogger(classOf[RegisterTests]).info("Test in progress")
  }
}
