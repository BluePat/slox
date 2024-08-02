package exceptions

import utils.SysExits.ExUsage
import utils.MethodInsight.getCurrentMethodName

val Usage: String = "Usage: slox [script]"

case class UsageException(override protected val exitCode: Int = ExUsage,
                          override protected val exitMessage: String,
                          override protected val usage: String = Usage,
                          override protected val methodOnExit: String = getCurrentMethodName
                         ) extends SLoxException
