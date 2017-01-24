package io.scalajs.nodejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Node.js Error Instance
  * @author lawrence.daniels@gmail.com
  */
@js.native
@JSName("Error")
class Error(message: String = "") extends js.Error(message) {

  def stack: js.Any = js.native

}

/**
  * Error Singleton
  * @author lawrence.daniels@gmail.com
  */
@js.native
@JSName("Error")
object Error extends js.Object {

  /////////////////////////////////////////////////////////////////////////////////
  //      Properties
  /////////////////////////////////////////////////////////////////////////////////

  /**
    * Error.stackTraceLimit
    */
  def stackTraceLimit: Int = js.native

  /////////////////////////////////////////////////////////////////////////////////
  //      Methods
  /////////////////////////////////////////////////////////////////////////////////

  /**
    * Creates a .stack property on targetObject, which when accessed returns a string representing the location in the
    * code at which Error.captureStackTrace() was called.
    * @param targetObject   The first line of the trace, instead of being prefixed with ErrorType: message, will be the
    *                       result of calling targetObject.toString().
    * @param constructorOpt The optional constructorOpt argument accepts a function. If given, all frames above
    *                       constructorOpt, including constructorOpt, will be omitted from the generated stack trace.
    *                       The constructorOpt argument is useful for hiding implementation details of error generation
    *                       from an end user.
    * @example Error.captureStackTrace(targetObject[, constructorOpt])
    */
  def captureStackTrace(targetObject: js.Any, constructorOpt: js.Any = null): Unit = js.native

}