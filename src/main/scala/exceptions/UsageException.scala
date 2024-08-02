package exceptions

import utils.ExitCodes.ExUsage
import utils.MethodInsight.getCurrentMethodName

val Usage: String = "Usage: slox [script]"

case class UsageException(override protected val exitCode: Int = ExUsage,
                          override protected val exitMessage: String,
                          protected val usage: String = Usage
                         ) extends SLoxException {

  override def toString: String = super.toString + s"\nUsage: $usage"
}
