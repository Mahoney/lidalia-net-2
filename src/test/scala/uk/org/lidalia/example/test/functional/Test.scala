package uk.org.lidalia.example.test.functional

import uk.org.lidalia.example.local.EnvironmentDefinition
import uk.org.lidalia.example.system.HasLogger
import uk.org.lidalia.slf4jext.Level
import uk.org.lidalia.slf4jtest.TestLoggerFactory

object Test extends HasLogger {

  TestLoggerFactory.getInstance().setPrintLevel(Level.INFO)

  def main(args: Array[String]) {

    EnvironmentDefinition.withA { environment =>
      log.info(s"Running a test against server on port ${environment.server.localPort} $environment")
    }
  }
}
