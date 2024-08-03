import exceptions.{SLoxException, UsageException}
import utils.ExitCodes.ExOk

import scala.util.{Success, Failure, Try}

@main def slox(args: String*): Unit = {
  Try {
    args.toList match {
      case scriptName :: Nil => runFile(scriptName)
      case Nil => runPrompt()
      case _ => throw UsageException()
    }
  } match {
      case Success(_) => exitSLox()
      case Failure(exception: SLoxException) => exitSLox(exception)
      case Failure(exception) => println(s"Unhandled exception; failure in Main: $exception")
  }
}

def runFile(fileName: String): Unit = ???

def runPrompt(): Unit = ???

def exitSLox(): Unit = {
  System.out.println("Successful termination.")
  System.exit(ExOk)
}

def exitSLox(exception: SLoxException): Unit = {
  System.out.println(exception.toString)
  System.exit(exception.exitCode)
}
