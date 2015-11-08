package tabulate.interop.scalaz

import org.scalatest.FunSuite
import org.scalatest.prop.GeneratorDrivenPropertyChecks
import org.typelevel.discipline.scalatest.Discipline
import tabulate.laws.discipline.CellCodecTests

import codecs._
import _root_.scalaz.scalacheck.ScalazArbitrary._
import scalaz.Maybe

class MaybeTests extends FunSuite with GeneratorDrivenPropertyChecks with Discipline {
  checkAll("Maybe[Int]", CellCodecTests[Maybe[Int]].cellCodec[String, Float])
}