package exceptions

import utils.ExitCodes.ExUsage

val Usage: String = "Usage: slox [script]"
val ExitMessage = "Incorrect usage of CLI"

case class UsageException(override val exitCode: Int = ExUsage,
                          override val exitMessage: String = ExitMessage,
                          protected val usage: String = Usage
                         ) extends SLoxException {

  override def toString: String = super.toString + s"\nUsage: $usage"
}
