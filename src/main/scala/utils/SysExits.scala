package utils

 /** Object containing Preferable Exit Codes for Programs
  *
  * For exit codes, I’m using the conventions defined in the UNIX “sysexits.h” header.
  * [[https://man.freebsd.org/cgi/man.cgi?query=sysexits&apropos=0&sektion=0&manpath=FreeBSD+4.3-RELEASE&format=html sysexits]]
  */
object SysExits {

  val ExOk = 0           // successful termination
  val ExBase = 64        // base value for error messages
  val ExUsage = 64       // command line usage error
  val ExDataErr = 65     // data format error
  val ExNoInput = 66     // cannot open input
  val ExNoUser = 67      // addressee unknown
  val ExNoHost = 68      // host name unknown
  val ExUnavailable = 69 // service unavailable
  val ExSoftware = 70    // internal software error
  val ExOsErr = 71       // system error (e.g., can't fork) */
  val ExOsFile = 72      // critical OS file missing */
  val ExCantCreate = 73  // can't create (user) output file */
  val ExIOErr = 74       // input/output error */
  val ExTempFail = 75    // temp failure; user is invited to retry */
  val ExProtocol = 76    // remote error in protocol */
  val ExNoPerm = 77      // permission denied */
  val ExConfig = 78      // configuration error */
  val ExMax = 78         // maximum listed value */
}
