#  Functions

This tests the various ways of defining functions

## Source
See [Functions.java](../../../bytecode/ControlFlow/Functions.java)

## Output

```
Running funA
 ByteCodes: 3
Running funB
 ByteCodes: 3
Running funC
 ByteCodes: 3
Running funD
 ByteCodes: 2
Running funE
 ByteCodes: 3
Running funF
 ByteCodes: 2
Running funG
 ByteCodes: 5
Running funH
 ByteCodes: 6
Running funI
 ByteCodes: 4
```

## Conclusion
Use static functions when you can! Final doesn't seem to make a difference. Functions that accept/return something are a bit more expensive than those that don't. Overall function calls don't cost a ton unless you are calling them a lot!
