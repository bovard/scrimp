#  Functions

This tests teh various ways of doing loops

## Source
See [Loops.java](../../../bytecode/ControlFlow/Loops.java)

## Output
Looping over an array of 10 elements this is the result.

```
iteratorFor
  ByteCodes: 148
genericFor
  ByteCodes: 154
optimizedFor
  ByteCodes: 124
basicWhile
  ByteCodes: 154
optimizedWhile
  ByteCodes: 124
basicDoWhile
  ByteCodes: 139
optimizedDoWhile
  ByteCodes: 113
recursive
  ByteCodes: 123
staticRecursive
  ByteCodes: 114
```

## Conclusion

  * Doing a compare against 0 (all the optimized loops do this) saves 3 bytecodes a turn and is definitely worth it. 
  * If you are really going for extra performance go for the do while loop or static recursion!
  * Overall as long as you optimized doesn't matter if you use for, while or do while
  * Recursion seems like a valid option especially if you can force it to be static
