package demos

import datastructures.stack.Stack

case class Name(first: String, Last: String)

/**
 * Created by kasonchan on 2/19/15.
 */
object Demos {
  def main(args: Array[String]) {
    val stack1 = new Stack[Int]

    //    Pop stack1
    stack1.pop
    println(stack1)

    //    Push 1 to 10 to stack1
    for (i <- 1 to 10)
      stack1.push(i)

    println(stack1)
  }
}
