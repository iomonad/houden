package io.trosa.houden

package object models {

  case class OAuth2(oauthClientId: String,
                    oauthClientSecret: String,
                    oauthOAuthorizeEndpoint: String,
                    oauthAccessTokenEndpoint: String,
                    oauthCallback: Option[String],
                    oauthAccessToken: Option[String])

}
