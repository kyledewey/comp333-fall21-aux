public interface ImmutableList {
    public boolean equals(final Object other);
    public int length();
    public int sum(); // empty list sum is defined as 0
    public ImmutableList append(final ImmutableList other);
    public boolean contains(final int value);
    public String toString();
    public int hashCode();


    // true if the list is empty
    // false if the list is non-empty
    public boolean isEmpty();
    // public boolean isEmpty() {
    //   if (head == null) { // java handles this
    //     return true;
    //   } else {            // java handles this
    //     return false;
    //   }
    // }
    //
    // ImmutableList list1 = new Nil(); // []
    // System.out.println(list1.isEmpty()); // prints true
    //
    // ImmutableList list2 = new Cons(1, new Nil()); // [1]
    // System.out.println(list2.isEmpty()); // prints false


    // [].addAmount(4);         // returns []
    // [8, 9, 10].addAmount(4); // returns [12, 13, 14]
    // [8].addAmount(3);        // returns [11]
    // [3, 7].addAmount(1);     // returns [4, 8]
    public ImmutableList addAmount(int amount);
    //
    // public ImmutableList addAmount(int amount) {
    //   if (head is null) {
    //     // do base case
    //   } else {
    //     // do recursive case
    //   }
    // }
} // ImmutableList
