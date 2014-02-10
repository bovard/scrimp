#  If Else vs Switch

This tests using a very long if, else if, ...., else statement vs a switch statement.

## Source
See [IfElseVsSwitch](../../../bytecode/ControlFlow/IfElseVsSwitch.java)

## Output

```
Best Case i = 0
 IfElse
  ByteCodes: 7
 Switch
   ByteCodes: 7

Worst Case i = 31
   IfElse
 ByteCodes: 97
   Switch
 ByteCodes: 7

Average Case i = 15
   IfElse
 ByteCodes: 52
   Switch
 ByteCodes: 7

Loop of 1..31
   IfElse
 ByteCodes: 1874
   Switch
 ByteCodes: 389
```
