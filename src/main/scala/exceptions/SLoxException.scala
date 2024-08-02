package exceptions

trait SLoxException extends Exception {
  protected val exitCode: Int
  protected val exitMessage: String
  protected val methodOnExit: String
  protected val usage: String

  override def toString: String = s"\nMethod: $methodOnExit\nExit Code: $exitCode -- $exitMessage\n$usage"
}
