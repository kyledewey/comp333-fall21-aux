public interface ImmutableList {
    public boolean equals(final Object other);
    public int length();
    public int sum(); // empty list sum is defined as 0
    public ImmutableList append(final ImmutableList other);
    public boolean contains(final int value);
    public String toString();
    public int hashCode();

    public boolean isEmpty();

    // [].addAmount(3) // returns []
    // [1].addAmount(7) // returns [8]
    // [1, 2].addAmount(9) // returns [10, 11]
    // [1, 2, 3].addAmount(5) // returns [6, 7, 8]
    //
    // public ImmutableList addAmount(int amount) {
    //   if (base case) {
    //     // do base case stuff
    //   } else {
    //     // do recursive case stuff
    //   }
    // }
    public ImmutableList addAmount(int amount);

    // [8, 9, 10].drop(0); // returns [8, 9, 10]
    // [8, 9, 10].drop(1); // returns [9, 10]
    // [8, 9, 10].drop(2); // returns [10]
    // [8, 9, 10].drop(3); // returns []
    // [8, 9, 10].drop(4); // returns []
    // [].drop(1);         // returns []
    public ImmutableList drop(int amount);
} // ImmutableList
