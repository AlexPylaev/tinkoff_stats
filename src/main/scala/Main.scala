import org.reactivestreams.Subscriber
import ru.tinkoff.invest.openapi.OpenApi
import ru.tinkoff.invest.openapi.okhttp.OkHttpOpenApi
import ru.tinkoff.invest.openapi.model.rest._
import ru.tinkoff.invest.openapi.model.streaming._

import java.util.concurrent.Executors

@main def hello: Unit = 
  println("Hello world!")
  println(msg)

def msg = "I was compiled by Scala 3. :)"
