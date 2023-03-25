import me.shadaj.scalapy.py
import me.shadaj.scalapy.py.SeqConverters

import scala.util.{Failure, Success, Try}
import sys.env

@main
def main(): Unit = {
  println("Hello world!")
  println(env("SCALAPY_PYTHON_PROGRAMNAME"))
  val listLengthPython = py.Dynamic.global.len(List(1, 2, 3).toPythonProxy)
  println(listLengthPython)
}
