public interface ImmutableList {
    public boolean equals(final Object other);
    public String toString();
    public int hashCode();

    public int length();
    public int sum(); // empty list sum is defined as 0
    public ImmutableList append(final ImmutableList other);
    public boolean contains(final int value);

    public boolean isEmpty();

    // ["foo", "bar", "baz"].take(0);     // returns []
    // [].take(3);                        // returns []
    // ["foo", "bar"].take(3);            // returns ["foo", "bar"]
    // ["a", "b", "c", "d", "e"].take(2); // ["a", "b"]
    public ImmutableList take(int numElements);

    // [].addAmount(4); // returns []
    // [1, 2, 3].addAmount(4); // returns [5, 6, 7]
    // [8, 2, 4].addAmount(1); // returns [9, 3, 5]
    public ImmutableList addAmount(int amount);
} // ImmutableList
