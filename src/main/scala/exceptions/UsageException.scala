package exceptions

import utils.ExitCodes.ExUsage
import utils.MethodInsight.getCurrentMethodName

val Usage: String = "Usage: slox [script]"

case class UsageException(override val exitCode: Int = ExUsage,
                          override val exitMessage: String,
                          protected val usage: String = Usage
                         ) extends SLoxException {

  override def toString: String = super.toString + s"\nUsage: $usage"
}
