# scrimp
scrimp has two things:
  1. A bunch of bytecode tests to help you see what is the most bytecode efficient route to go down
  2. A collection of lightweight data structures and algorithms in java for use in MIT's BattleCode competition (battlecode.org)
    * As theses are classes they inherently won't be the fastest, but they will be much better than using the built in java.utils.* data structures

## ByteCode Tests

Check out [the tests](docs/bytecode/bytecode.md)!

## Data structures

#### Who should use this
These aren't the best things to use, they are just a lot faster than the Java equivalents. For example:

```
System.out.println("Good Way Array");
Timer.StartTimer();
int[] intA = new int[num];
for (int i = 0; i < num; i++) {
    intA[i] = i;

}
for (int i = 0; i < num; i++) {
    System.out.println(intA[i]);
}
Timer.EndTimer();
// 963 Bytecodes


System.out.println("Iterable Array");
Timer.StartTimer();
IterableArray a = new IterableArray();
for (int i = 0; i < num; i++) {
    a.add(i);
}
for (Object i: a) {
    System.out.println(i);
}
Timer.EndTimer();
// 3000 Bytecodes


System.out.println("ArrayList");
Timer.StartTimer();
ArrayList<Integer> b = new ArrayList<Integer>();
for (int i = 0; i < num; i++) {
    b.add(i);
}
for (int i: b) {
    System.out.println(i);
}
Timer.EndTimer();
// 5668 Bytecodes
```

So while the scrimp [IterableArray](arrays/IterableArray.java) is about 2x more efficient than the java.utils.ArrayList it's still 3x less efficient than doing it the optimal way!
