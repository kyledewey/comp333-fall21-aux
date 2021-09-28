// [].append(...)
// null: billion-dollar mistake
//
// Object obj = ...;
// 
public class Nil implements ImmutableList {
    public Nil() {}

    public boolean equals(final Object other) {
        return other instanceof Nil;
    } // equals
    
    public String toString() {
        return "Nil";
    } // toString

    public int hashCode() {
        return 0;
    } // hashCode

    public boolean isEmpty() {
        return true;
    }

    public ImmutableList take(int numElements) {
        return new Nil();
    }

    // amount: ???
    // this: Nil // []
    //
    // [].addAmount(14) ==> []
    public ImmutableList addAmount(int amount) {
        // returns []
        // return new Nil();
        return this;
    }

    // [1, 2, 3].append([4, 5, 6])
    //  1 :: [2, 3].append([4, 5, 6])
    //
    // [].append([17, 32]) ==> [17, 32]
    // [].append([1, 2, 3]) ==> [1, 2, 3]

    // [1, 2, 3].append([8, 1, 2]) ==> [1, 2, 3] // not correct
} // Nil

