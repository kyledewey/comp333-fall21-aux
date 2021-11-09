// let is used to introduce an immutable variable
// var is used to introduce a mutable variable

// Swift is statically typed
let x: Int = 17; // Swift has type inference - inferred x is of type Int
let outer = false
if true {
    let x: String = "foo"
    var fromOuter = false
    if true {
        let x: Bool = true
        print(x);
        print(outer);
        fromOuter = x
    }
    print(x); // prints "foo"
}
print(x); // prints 17

