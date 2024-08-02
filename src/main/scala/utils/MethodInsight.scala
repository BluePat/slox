package utils

object MethodInsight {

  def getCurrentMethodName: String = Thread
    .currentThread
    .getStackTrace()(3)  // TODO: Validate index - 3 seems to be working.
    .getMethodName
}
