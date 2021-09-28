public class Cons implements ImmutableList {
    // ---BEGIN INSTANCE VARIABLES---
    public final int head;
    public final ImmutableList tail;
    // ---END INSTANCE VARIABLES---

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    } // Cons

    public boolean equals(final Object other) {
        if (other instanceof Cons) {
            final Cons otherCons = (Cons)other;
            return head == otherCons.head && tail.equals(otherCons.tail);
        } else {
            return false;
        }
    } // equals
    
    public String toString() {
        return "Cons(" + head + ", " + tail.toString() + ")";
    } // toString

    public int hashCode() {
        return sum();
    } // hashCode

    public int length() {
        return 0;
    }

    public int sum() {
        return 0;
    }

    // [1, 2, 3].append([4, 5, 6]) ==>
    //   1 :: [2, 3].append([4, 5, 6])
    public ImmutableList append(final ImmutableList other) {
        return null;
    }
    
    public boolean contains(final int value) {
        return false;
    }

    public boolean isEmpty() {
        return false;
    }

    public static void castTest() {
        Object obj = "foo";
        String s = (String)obj; // compiles, runtime check that obj is a String
    }
    
    public static ImmutableList addAmountStatic(ImmutableList input, int amount) {
        // tail.addAmount(amount);
        // if (tail instanceof Nil) {
        //   return addAmountForNil(...);
        // } else {
        //   return addAmountForCons(...);
        // }
        
        if (input instanceof Nil) {
            // base case
            return new Nil();
        } else {
            // recursive case
            // we know it's a Cons
            Cons asCons = (Cons)input; // cast
            ImmutableList rest = addAmountStatic(asCons.tail, amount);
            return new Cons(asCons.head + amount, rest);
        }
    }
    
    // [1, 2, 3].addAmount(4)
    // 
    // amount: 4
    // head: 1
    // tail: [2, 3]
    // this: [1, 2, 3]
    // return value: [5, 6, 7]
    //
    // O(n)
    public ImmutableList addAmount(int amount) {
        // rest = [2, 3].addAmount(4)
        // rest = new Cons(2, new Cons(3, new Nil())).addAmount(4)
        // rest: [6, 7]
        ImmutableList rest = tail.addAmount(amount);
        return new Cons(head + amount, rest); // [5, 6, 7]
    }

    // [8, 9, 10].drop(1) ==> [9, 10].drop(0) ==> [9, 10]
    // O(n)
    public ImmutableList drop(int amount) {
        if (amount <= 0) {
            return this;
        } else {
            return tail.drop(amount - 1);
        }
    }

    // [8, 9, 10].take(1) // returns [8]
    // Cons(8, Cons(9, Cons(10, Nil))).take(1)
    //
    // amount: 1
    // head: 8
    // tail: Cons(9, Cons(10, Nil)) // [9, 10]
    // this: Cons(8, Cons(9, Cons(10, Nil))) // [8, 9, 10]
    public ImmutableList take(int amount) {
        if (amount <= 0) {
            return new Nil();
        } else {
            // [8, 9, 10].take(1) ==> 8 :: [9, 10].take(0)
            //
            // [9, 10].take(0) ==> []
            ImmutableList rest = tail.take(amount - 1);
            return new Cons(head, rest); // [8]
        }
    }

    // shorter version - does the same thing
    // take: O(n)
    public ImmutableList take(int amount) {
        return (amount <= 0) ? new Nil() : new Cons(head, tail.take(amount - 1));
    }
    
    // mergesort: O(n lg(n))
    // O(lg(n)) recursive calls to mergesort
    
} // Cons
