import me.shadaj.scalapy.py
import me.shadaj.scalapy.py.SeqConverters

import scala.util.{Failure, Success, Try}
import sys.env

@main
def main(): Unit = {
  println("Hello world!")
  val list    = py.Dynamic.global.range(1, 3 + 1)
  val listSum = py.Dynamic.global.sum(list)
  println(listSum)
}
