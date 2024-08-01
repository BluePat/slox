@main def slox(args: String*): Unit = {
  args.toList match
    case scriptName :: Nil => runFile(scriptName)
    case Nil => runPrompt()
    case _ => println(Usage)  // TODO: Make suitable throwable.
}

val Usage: String = "Usage: slox [script]"

def runFile(fileName: String): Unit = ???

def runPrompt(): Unit = ???
