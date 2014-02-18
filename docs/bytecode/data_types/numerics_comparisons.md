# Numerics Comparisons

In depth test of comparisons against ints

## Source
See [NumericsComparisons.java](../../../bytecode/DataTypes/NumericsComparisons.java)

## Output

### Var comapes

for int i in (-1, 0, 1):
  for int j in (-1, 0, 1):
      compare i < j

| i | j | == | > | < | >= | <= |
| --- | --- | --- | --- | --- | --- | --- |
| -1 | -1 | 3 | 4 | 3 | 3 | 4 |
| -1  | 0 | 3 | 3 | 4 | 3 | 4 |
| -1  | 1 | 3 | 3 | 4 | 3 | 4 |
| 0 | -1 | 3 | 4 | 3 | 4 | 3 |
| 0  | 0 | 4 | 3 | 3 | 4 | 4 |
| 0  | 1 | 3 | 3 | 4 | 3 | 4 |
| 1 | -1 | 3 | 4 | 3 | 3 | 3 |
| 1  | 0 | 3 | 4 | 3 | 4 | 3 |
| 1  | 1 | 4 | 3 | 3 | 4 | 4 |

Conclusion: 4 bytecodes for true comparisons, 3 bytecodes for false comparisons

### Compares against constant zero

| i | == | < | > |
| --- | --- | --- | --- |
| -1 |  2 | 3 | 2 |
| 0  | 3 | 2 | 2 |
| 1  | 2 | 2 | 3 |

Conclusion: 3 bytecodes for true comparisons, 2 bytecodes for false comparisons

## Conclusion
Try to compare aginst zero when possible, try and make the majority of compares false!
