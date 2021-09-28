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

    // Nil always empty list
    // [].isEmpty();
    public boolean isEmpty() {
        return true;
    }

    // base case
    // [].addAmount(4); // returns []
    public ImmutableList addAmount(int amount) {
        return this;
        //return new Nil();
    }

    public ImmutableList drop(int number) {
        return new Nil();
    }

    // [].length() ==> 0
    // [].sum() ==> 0
    // [].append([1, 2, 3]) ==> [1, 2, 3]
    // [].contains(30) ==> false
} // Nil
    
