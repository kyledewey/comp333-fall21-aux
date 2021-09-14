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
} // ImmutableList
