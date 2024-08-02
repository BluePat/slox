import exceptions.{SLoxException, UsageException}

@main def slox(args: String*): Unit = {
  args.toList match
    case scriptName :: Nil => runFile(scriptName)
    case Nil => runPrompt()
    case _ => throw UsageException(exitMessage = "No argument provided!")  // TODO: Add handling downstream.
}

def runFile(fileName: String): Unit = ???

def runPrompt(): Unit = ???
