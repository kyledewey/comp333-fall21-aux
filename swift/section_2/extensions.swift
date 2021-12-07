// public class String {
//   public String substring(int start, int end) { ... }
// }

protocol Negateable {
    // Self: the type we implement the protocol for
    func negate() -> Self;
}

extension Int : Negateable {
    func negate() -> Int {
        return -self
    }
}

extension Bool : Negateable {
    // methods in Swift use self instead of this
    func negate() -> Bool {
        // self is Swift's this (Java, JavaScript, or C++)
        return !self
    }
}

let b1 = true;
//print(b1.negate());

let i1 = 17;
//print(i1.negate());


// typeclasses - protocols and extensions in Swift
protocol Equality {
    func equals(_ a: Self) -> Bool;
}

extension Int : Equality {
  // self: Int
  func equals(_ a: Int) -> Bool {
    return self == a
  }
}

extension String : Equality {
    func equals(_ a: String) -> Bool {
        return self == a
    }
}

// print("foo".equals("bar"));
// print(3.equals(3));
// print(3.equals(4));

indirect enum MyList<A> {
    case Cons(A, MyList<A>)
    case Nil
}

func allEqual<A: Equality>(_ list: MyList<A>) -> Bool {
    switch list {
    case .Nil:
        return true // empty list
    case .Cons(_, .Nil):
        return true // list with one element
    case .Cons(let first, .Cons(let second, let rest)):
        // list with at least two elements
        // [1, 1, 2, 2, 3, 3]
        // 1 == 1
        // [1, 2, 2, 3, 3]
        // 1 == 2
        return first.equals(second) && allEqual(MyList.Cons(second, rest))
    }
}

// protocol Number {
//     func zero() -> Self;
//     func add(_ other: Self) -> Self;
// }

// func sum<A: Number>(list: MyList<A>) -> A { ... }

// [1, 1]
print(allEqual(MyList.Cons(1, MyList.Cons(1, MyList.Nil))))
// ["foo", "bar"]
print(allEqual(MyList.Cons("foo", MyList.Cons("bar", MyList.Nil))))
// [1, 1, 2, 2, 3, 3]
let list = MyList.Cons(1, MyList.Cons(1, MyList.Cons(2, MyList.Cons(2, MyList.Cons(3, MyList.Cons(3, MyList.Nil))))))
print(allEqual(list))

                                      
print("foo".equals(3))
