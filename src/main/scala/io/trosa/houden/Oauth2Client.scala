package io.trosa.houden

import cats.effect.IO
import hammock.jvm.Interpreter
import io.trosa.houden.types.Oauth2Token

class Oauth2Client[A](token: Oauth2Token) {

  implicit val interpreter = Interpreter[IO]

}
