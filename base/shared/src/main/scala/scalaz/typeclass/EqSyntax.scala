package scalaz
package typeclass

import scala.language.experimental.macros

trait EqSyntax {
  implicit final class ToEqOps[A: Eq](a: A) {
    private[typeclass] type Equal
    def ===(f: A): Boolean = macro meta.SymOps.fa_1[Equal]
  }
}
