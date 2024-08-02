package utils

object MethodInsight {

  def getCurrentMethodName: String = Thread
    .currentThread
    .getStackTrace()(5)  // TODO: Validate index - 5 seems to be working when calling from ancestor.
    .getMethodName
}
