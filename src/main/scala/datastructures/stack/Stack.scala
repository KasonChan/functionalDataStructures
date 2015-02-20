package datastructures.stack

/**
 * Created by kasonchan on 2/19/15.
 */
sealed trait Stack[+A]

case object Nil extends Stack[Nothing]

case class Cons[+A](head: A, tail: Stack[A]) extends Stack[A]

object Stack {
  def push(x: Any): Stack[Any] = {
    Cons(x, Nil)
  }

  def pushToStack(x: Any, s: Stack[Any]): Stack[Any] = {
    x match {
      case Nil => s
      case ns => Cons(x, s)
    }
  }

  def isEmpty(s: Stack[Any]): Boolean = {
    s match {
      case Nil => true
      case _ => false
    }
  }

  def pop(s: Stack[Any]): Any = {
    s match {
      case Nil => Nil
      case Cons(x, xs) => x
    }
  }
}

