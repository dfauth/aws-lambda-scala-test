package hello

import com.github.dnvriend.lambda._
import com.github.dnvriend.lambda.annotation.HttpHandler
import play.api.libs.json._

@HttpHandler(path = "/hello", method = "get")
class HelloScalaLambda extends ApiGatewayHandler {
  override def handle(
                       request: HttpRequest,
                       ctx: SamContext
                     ): HttpResponse = {
    HttpResponse
      .ok
      .withBody(Json.toJson("Hello Scala world from AWS Lambda"))
  }
}