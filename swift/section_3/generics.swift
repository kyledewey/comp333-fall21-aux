// type variable on data: generics
//
// introduced type variable
//                   |
indirect enum MyList<A> {
    // using type variable
    //        |         |
    case Cons(A, MyList<A>)
    case Nil
}

let list1: MyList<Int> = MyList.Cons(1, MyList.Cons(2, MyList.Nil));
let list2: MyList<String> = MyList.Cons("foo", MyList.Cons("bar", MyList.Nil));
let list3: MyList<Bool> = MyList.Cons(true, MyList.Nil)
//                                  JavaScript: x => x + 1
let list4: MyList<(Int) -> Int> = MyList.Cons({ x in x + 1 }, MyList.Nil)
// print(length(list: list1))
// print(length(list: list2))

// type variable on functions: parametric polymorphism (generics)
//
// introduced type variable
//          |
//          |   use type variable
//          |               |
func length<A>(list: MyList<A>) -> Int {
    switch list {
    case .Cons(_, let tail): return 1 + length(list: tail)
    case .Nil: return 0
    }
}

// indirect enum MyListString {
//     case Cons(String, MyListString)
//     case Nil
// }

// pair - tuple holding two things
let tuple: (Int, String) = (17, "foo");
print(tuple)

let (x, y) = tuple
print(x)
print(y)

// triple - tuple holding three things
let otherTuple: (Int, Bool, String) = (2, false, "foo");

// pair of Int
// 2-tuple of Int
let pairOfInts: (Int, Int) = (2, 3)
