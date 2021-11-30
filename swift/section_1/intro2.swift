func add(_ x: Int, _ y: Int) -> Int {
    return x + y;
}

func subtract(_ x: Int, _ y: Int) -> Int {
    return x - y;
}

// print(add(2, 3))

// temp's type: (Int, Int) -> Int
let temp: (Int, Int) -> Int = add;
// print(temp(5, 6));

func concat(_ x: String, _ y: String) -> String {
    return x + y;
}

let temp2: (String, String) -> String = concat;
// print(temp2("foo", "bar"));

//                                (x, y) => x / y // JavaScript

// func divide(first: Int, second: Int) -> Int {
//     return first / second;
// }

let divide: (Int, Int) -> Double = { (x, y) in Double(x / y) };

print(divide(9, 3))
print(divide(10, 5))
print(divide(7, 2))

let thunk: () -> Int = { 1 + 3 };
print(thunk())

