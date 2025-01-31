# Scala Bug: Mutable ListBuffer Affecting Immutable List

This example demonstrates a common pitfall in Scala involving the `ListBuffer` and the seemingly immutable `List`.  Direct assignment does *not* create a copy; modifications to the `ListBuffer` affect the variable referencing it.

## Bug Description

The `bug.scala` file shows how assigning a `ListBuffer` to an `immutable List` variable doesn't create a defensive copy.  Subsequent changes to the `ListBuffer` unexpectedly modify the 'immutable' list.

## Solution

The `bugSolution.scala` provides the correct way to create an immutable copy using `toList`.

This is a subtle bug, especially for those new to Scala's immutable data structures.