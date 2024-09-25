# interleave

Interleave is a straightforward method that puts elements from zero or more Iterables into a single list. It takes the first item in each list, then the second, and so, up to the length of the shortest argument.

## Examples

With no arguments, it trivially returns an empty list.
```groovy
interleave() == []
```

If any lists are empty, it returns an empty list (because the shortest argument has no elements).
```groovy
interleave([], [1, 2]) == []
```

Otherwise, it puts the first element from each list into the result, then the second, and so on.
```groovy
interleave([1, 2], [3, 4], [5, 6, 7]) == [1, 3, 5, 2, 4, 6]
```

## Usage

Run tests with maven.