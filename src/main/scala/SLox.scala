import exceptions.SLoxException

@main def slox(args: String*): Unit = {
  args.toList match
    case scriptName :: Nil => runFile(scriptName)
    case Nil => runPrompt()
    case exception: SLoxException => exitSLox(exception)
    case exception => throw Exception(exception.toString)  // TODO: Refactor to not exit so ungracefully.
}

def runFile(fileName: String): Unit = ???

def runPrompt(): Unit = ???

def exitSLox(exception: SLoxException): Unit = {
  System.out.println(exception.toString)
  System.exit(exception.exitCode)
}
