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

Looping over an array of 100 elements this is the result.
```
iteratorFor
  ByteCodes: 1318
genericFor
  ByteCodes: 1414
optimizedFor
  ByteCodes: 1114
basicWhile
  ByteCodes: 1414
optimizedWhile
  ByteCodes: 1114
basicDoWhile
  ByteCodes: 1309
optimizedDoWhile
  ByteCodes: 1013
recursive
  ByteCodes: 1203
staticRecursive
  ByteCodes: 1104
```


## Conclusion

  * Doing a compare against 0 (all the optimized loops do this) saves 3 bytecodes per iteration!
  * If you are really going for extra performance go for the do while loop.
  * Overall as long as you optimized doesn't matter if you use for, while or do while
  * Recursion seems like a valid option especially if you can force it to be static
