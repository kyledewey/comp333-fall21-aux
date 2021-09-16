// list = Cons(1, Cons(2, Cons(3, Nil)))
// Cons:
//  -head: element on this node
//  -tail: reference to the rest of the list
//
// [1, ...].append(...)
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

    public boolean isEmpty() {
        return false;
    }

    public static int sum(int[] elements, int startIndex) {
        if (startIndex >= elements.length) {
            return 0;
        } else {
            return elements[startIndex] + sum(elements, startIndex + 1);
        }
    }

    // tail-call optimization - O(n) stack space => O(1) stack space
    public static int sum2(int[] elements, int accum, int startIndex) {
        if (startIndex >= elements.length) {
            return accum;
        } else {
            return sum2(elements, elements[startIndex] + accum, startIndex + 1);
        }
    }

    public static int sum2(int[] elements, int startIndex) {
        return sum2(elements, 0, startIndex);
    }
        
    // [8, 9, 7].take(2) ==> 8 + [9, 7].take(1) ==> [8, 9]
    public ImmutableList take(int numElements) {
        // head: 8
        if (numElements <= 0) {
            return new Nil();
        } else {
            // rest: [9]
            ImmutableList rest = tail.take(numElements - 1);
            return new Cons(head, rest);
        }
    }

    // [1, 2, 3].addAmount(4);
    // (1 + 4) :: ([2, 3].addAmount(4))
    // (1 + 4) :: ((2 + 4) :: [3].addAmount(4))
    // (1 + 4) :: ((2 + 4) :: ((3 + 4) :: [].addAmount(4)))
    // (1 + 4) :: ((2 + 4) :: ((3 + 4) :: []))
    // (1 + 4) :: ((2 + 4) :: [7])
    // (1 + 4) :: [6, 7]
    // [5, 6, 7]
    
    // [1, 2, 3].addAmount(4); // returns [5, 6, 7]
    //
    // amount: 4
    // this: Cons(1, Cons(2, Cons(3, Nil))) // [1, 2, 3]
    // head: 1
    // tail: Cons(2, Cons(3, Nil)) // [2, 3]
    //
    public ImmutableList addAmount(int amount) {
        // ImmutableList rest = tail.addAmount(amount);
        // // rest: Cons(6, Cons(7, Nil)) // [6, 7]
        // // wanted: 5 + [6, 7]
        // return new Cons(head + amount, rest); // [5, 6, 7]

        return new Cons(head + amount, tail.addAmount(amount));
    }
} // Cons
