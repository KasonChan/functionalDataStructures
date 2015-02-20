package demoTests

import datastructures.stack.{Nil, Stack}
import org.scalatest.{FlatSpec, ShouldMatchers}

/**
 * Created by kasonchan on 2/19/15.
 */
class StackDemoTest extends FlatSpec with ShouldMatchers {

  "1. stack after push(5)" should "= Cons(5,Nil)" in {
    val stack = new Stack[Int]
    stack.push(5)
    stack.toString should be("Cons(5,Nil)")
  }

  "2. stack after pushing 1 to 10" should "= Cons(10,Cons(9,Cons(8,Cons(7,Cons(6,Cons(5,Cons(4,Cons(3,Cons(2,Cons(1,Nil))))))))))" in {
    val stack = new Stack[Int]
    for (i <- 1 to 10)
      stack.push(i)
    stack.toString should be("Cons(10,Cons(9,Cons(8,Cons(7,Cons(6,Cons(5,Cons(4,Cons(3,Cons(2,Cons(1,Nil))))))))))")
  }

  "3. stack isEmpty" should "= true" in {
    val stack = new Stack[Int]
    stack.isEmpty should be(true)
  }

  "4. stack after push(5) isEmpty" should "= false" in {
    val stack = new Stack[Int]
    stack.push(5)
    stack.toString should be("Cons(5,Nil)")
    stack.isEmpty should be(false)
  }

  "5. stack pop" should "= Nil" in {
    val stack = new Stack[Int]
    stack.pop should be(Nil)
    stack.toString should be("Nil")
  }

  "6. stack after pushing 1 to 10 and pop" should "= 10" in {
    val stack = new Stack[Int]
    for (i <- 1 to 10)
      stack.push(i)
    stack.pop should be(10)
    stack.toString should be("Cons(9,Cons(8,Cons(7,Cons(6,Cons(5,Cons(4,Cons(3,Cons(2,Cons(1,Nil)))))))))")
  }

  "7. stack after pushing 1 to 10 head" should "= 10" in {
    val stack = new Stack[Int]
    for (i <- 1 to 10)
      stack.push(i)
    stack.head.toString should be("10")
  }

  "8. stack after pushing 1 to 10 tail" should "= Cons(9,Cons(8,Cons(7,Cons(6,Cons(5,Cons(4,Cons(3,Cons(2,Cons(1,Nil)))))))))" in {
    val stack = new Stack[Int]
    for (i <- 1 to 10)
      stack.push(i)
    stack.tail.toString should be("Cons(9,Cons(8,Cons(7,Cons(6,Cons(5,Cons(4,Cons(3,Cons(2,Cons(1,Nil)))))))))")
  }

  "9. stack after push(Name(\"Kason\", \"Chan\") tail" should "= Nil" in {
    case class Name(first: String, last: String)

    val stack = new Stack[Name]
    stack.push(Name("Kason", "Chan"))
    stack.tail.toString should be("Nil")
  }

  "10. stack after push(Name(\"Kason\", \"Chan\") push(Name(\"Connor\", \"Freeman\")" should
    "= Cons(Name(\"Connor\",\"Freeman\"),Cons(Name(\"Kason\",\"Chan\"),Nil))" in {
    case class Name(first: String, last: String)

    val stack = new Stack[Name]
    stack.push(Name("Kason", "Chan"))
    stack.push(Name("Connor", "Freeman"))
    stack.toString should be("Cons(Name(Connor,Freeman),Cons(Name(Kason,Chan),Nil))")
  }
}
