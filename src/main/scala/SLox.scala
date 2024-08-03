import exceptions.GeneralConstants.Prompt
import exceptions.{SLoxException, UsageException}
import utils.ExitCodes.ExOk

import scala.io.{Source, StdIn}
import scala.annotation.tailrec
import scala.util.{Failure, Success, Try, Using}

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

def runFile(scriptName: String): Unit = {
  // Performs an operation on a resource and then releases it.
  Using( Source.fromFile(scriptName) ) {
    script => run(script.mkString)
  }
}

@tailrec def runPrompt(): Unit = {
  print(Prompt)
  StdIn.readLine() match
    case null => { /* Stop processing further inputs -- End of input stream has been reached. */ }
    case command => run(command)

  runPrompt()
}

def run(command: String): Unit = ???

def exitSLox(): Unit = {
  System.out.println("Successful termination.")
  System.exit(ExOk)
}

def exitSLox(exception: SLoxException): Unit = {
  System.out.println(exception.toString)
  System.exit(exception.exitCode)
}
