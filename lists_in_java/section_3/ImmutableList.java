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
    // [8, 9, 10].addAmount(4); // returns [8 + 4, 9 + 4, 10 + 4] ==> [12, 13, 14]
    // [8].addAmount(3);        // returns [8 + 3] ==> [11]
    // [3, 7].addAmount(1);     // returns [4, 8]
    // [3, 7].addAmount(10);    // returns [13, 17]
    public ImmutableList addAmount(int amount);


    // [8, 9, 10].drop(-5);  // returns [8, 9, 10]
    //   Cons(8, Cons(9, Cons(10, Nil))).drop(-5)
    // [8, 9, 10].drop(0);   // returns [8, 9, 10]
    // [8, 9, 10].drop(2);   // returns [10]
    // [3, 8, 2, 7].drop(1); // returns [8, 2, 7]
    // [3, 7, 1, 0].drop(4); // returns []
    // [6, 2, 3].drop(10);   // returns []
    // [].drop(3);           // returns []
    //   Nil.drop(3);
    public ImmutableList drop(int number);
    
    //
    // public ImmutableList addAmount(int amount) {
    //   if (head is null) {
    //     // do base case
    //   } else {
    //     // do recursive case
    //   }
    // }
} // ImmutableList
