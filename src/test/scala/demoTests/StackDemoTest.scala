package demoTests

import org.scalatest.{FlatSpec, ShouldMatchers}
import datastructures.stack.{Cons, Nil, Stack}

/**
 * Created by kasonchan on 2/19/15.
 */
class StackDemoTest extends FlatSpec with ShouldMatchers {
  "1. Stack.push(5)" should "= Cons(5, Nil)" in {
    Stack.push(5) should be(Cons(5, Nil))
  }

  "2. Stack.push(\"Apple\")" should "= Cons(\"Apple\", Nil)" in {
    Stack.push("Apple") should be(Cons("Apple", Nil))
  }

  "3. Stack.push(Nil)" should "= Cons(Nil, Nil)" in {
    Stack.push(Nil) should be(Cons(Nil, Nil))
  }
}
