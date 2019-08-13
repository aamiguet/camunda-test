package example

import org.camunda.dmn.DmnEngine
import org.camunda.dmn.DmnEngine._
import java.io.InputStream
import java.io.FileInputStream
import org.camunda.dmn.parser.DmnParser

object Decision extends App {
  
  def evaluate(stream: InputStream, decisionId: String, context: Map[String, Any]) {
    val engine = new DmnEngine

    val result =
      engine
        .parse(stream)
        .flatMap(dmn => engine.eval(dmn, decisionId, context))
          
    result match {
      case Left(failure) => println(failure.message)
      case Right(NilResult) => println("Cannot decide on dish - no rule corresponding to the inputs")
      case Right(r) => {
        val result = r.asInstanceOf[Result]
        println(s"The dish is ${result.value.toString}")
      }
    }
  }

  override def main(args: Array[String]) {
    if (args.length >= 2) {
      println(args(0))
      val stream = new FileInputStream(s"resources/dish-decision.dmn11.xml")
      val decisionId = "decision"
      val context: Map[String, Any] = List(("season", args(0)), ("guestCount", args(1).toInt)).toMap
      evaluate(stream, decisionId, context)
    } else {
      println("Incomplete arguments");
    }
  }
}