package io.trosa.houden

import cats.syntax.semigroup._
import cats.instances.int._

object Add {
  def exec(a: Int, b: Int): Int =
    a |+| b
}
