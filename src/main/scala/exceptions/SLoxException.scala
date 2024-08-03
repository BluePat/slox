package exceptions

import utils.MethodInsight.getCurrentMethodName

trait SLoxException extends Exception {
  val exitCode: Int
  val exitMessage: String
  private val methodOnExit: String = getCurrentMethodName
  override def toString: String = s"\nMethod: $methodOnExit\nExit Code: $exitCode -- $exitMessage"
}
