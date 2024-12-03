# Kotlin mutableListOf removeIf Bug

This repository demonstrates a potential issue with Kotlin's `mutableListOf` and its `removeIf` function.  When removing multiple consecutive elements that satisfy the predicate, the function can behave unexpectedly due to index shifting during the removal process.

The `bug.kt` file contains the code exhibiting the problem.  The `bugSolution.kt` file provides a solution to address this issue.

## Problem

The issue arises because `removeIf` modifies the list's indices while iterating. This can cause elements to be skipped or removed incorrectly, especially when consecutive elements satisfy the removal condition.

## Solution

The recommended solution involves iterating over a copy of the list or using an iterator to safely remove elements without impacting the iteration process.
