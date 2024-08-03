package utils

 /** Object containing Preferable Exit Codes for Programs.
  *
  * For exit codes, I’m using the conventions defined in the UNIX “sysexits.h” header.
  * [[https://man.freebsd.org/cgi/man.cgi?query=sysexits&apropos=0&sektion=0&manpath=FreeBSD+4.3-RELEASE&format=html]]
  */
object ExitCodes {
  val ExOk = 0                // Successful termination
  val ExBase = 64             // Base value for error messages
  val ExUsage = 64            // Command line usage error
  val ExDataErr = 65          // Data format error
  val ExNoInput = 66          // Cannot open input
  val ExNoUser = 67           // Addressee unknown
  val ExNoHost = 68           // Host name unknown
  val ExUnavailable = 69      // Service unavailable
  val ExSoftware = 70         // Internal software error
  val ExOsErr = 71            // System error (e.g., can't fork)
  val ExOsFile = 72           // Critical OS file missing
  val ExCantCreate = 73       // Can't create (user) output file
  val ExIOErr = 74            // Input/output error
  val ExTempFail = 75         // Temp failure; user is invited to retry
  val ExProtocol = 76         // Remote error in protocol
  val ExNoPerm = 77           // Permission denied
  val ExConfig = 78           // Configuration error
  val ExMax = 78              // Maximum listed value
}
