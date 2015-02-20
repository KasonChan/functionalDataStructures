Functional Data Structures
==========================

This is a repo contains the following data structure implementations. They are 
written in Scala with SBT.

*  Stack
  -  `push`: Adds an element to the stack
  -  `isEmpty`: Returns true if the stack is empty
  -  `pop`: Returns the head of the stack and removes it from the stack
  -  `head`: Returns the head of the stack
  -  `tail`: Returns the tail of the stack

Assumptions
-----------

I assume you have installed the following:

*  [Scala](http://www.scala-lang.org/download/)
*  [SBT](http://www.scala-sbt.org/download.html)

Running the Code
----------------

Follow these steps to run the code:

1.  `cd` into the _this_ directory.
2.  Enter `sbt run` to execute `Demo`.
3.  Enter `sbt test` to execute all the test cases in `demoTest`.
4.  Enter `sbt "test-only demoTest.classname"` to execute the test cases in the specified class.
