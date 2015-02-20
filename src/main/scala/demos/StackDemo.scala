package demos

import datastructures.stack.{Cons, Nil, Stack}

/**
 * Created by kasonchan on 2/19/15.
 */
object StackDemo {
  def main(args: Array[String]) {
    //    Empty int stack
    val s1: Stack[Int] = Nil
    println("s1: " + s1)
    println("isEmpty s1? " + Stack.isEmpty(s1))
    println("pop s1: " + Stack.pop(s1))

    //    String stack
    val s2: Stack[String] = Cons("s", Nil)
    println("s2: " + s2)
    println("isEmpty s2? " + Stack.isEmpty(s2))
    println("pop s2: " + Stack.pop(s2))

    //    Push new number to integer stack
    val s3: Stack[Any] = Stack.pushToStack(3, s2)
    println("s3: " + s3)

    //    Push
    val s4 = Stack.push("a")
    println("s4: " + s4)
  }
}
