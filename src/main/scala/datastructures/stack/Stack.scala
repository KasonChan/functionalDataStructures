package datastructures.stack

/**
 * Created by kasonchan on 2/19/15.
 */
sealed trait L[+A]

case class Cons[+A](head: A, tail: L[A]) extends L[A]

case object Nil extends L[Nothing]

class Stack[A] {

  private var s: L[A] = Nil

  override def toString = s.toString

  /**
   * Add an element of type A to the stack *
   * @param x A
   * @return Stack[A]
   */
  def push(x: A): L[A] = {
    s = s match {
      case Nil => Cons(x, Nil)
      case Cons(y, ys) => Cons(x, Cons(y, ys))
      case _ => s
    }

    s
  }

  /**
   * Return true if the stack is empty *
   * @return Boolean
   */
  def isEmpty: Boolean = {
    s match {
      case Nil => true
      case Cons(y, ys) => false
    }
  }

  /**
   * Returns the head of the stack and removes it from the stack *
   * @return head: A
   */
  def pop: Any = {
    val result = s match {
      case Nil => (Nil, Nil)
      case Cons(x, xs) => (x, xs)
    }

    s = result._2
    result._1
  }

  /**
   * Returns the head of the stack *
   * @return head: A
   */
  def head: Any = {
    s match {
      case Nil => Nil
      case Cons(x, xs) => x
    }
  }

  /**
   * Returns the tail of the stack *
   * @return tail: Stack[A]
   */
  def tail: L[A] = {
    s match {
      case Nil => Nil
      case Cons(x, xs) => xs
    }
  }
}



