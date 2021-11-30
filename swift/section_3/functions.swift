// In Java:
// public static int multiply(int first, int second) {
//   return first * second;
// }

func multiply(first: Int, second: Int) -> Int {
    return first * second
} // multiply

// Swift has semicolon inference

// C++: let is basically const
// Java: let is basically final
let temp = multiply(first: 3, second: 4)
// print(temp)

// self-documenting code - hit yes in the chat if you've heard of it
// Good variable/class names
// Simpler code
// Avoid comments

func subtract(_ first: Int, _ second: Int) -> Int {
    return first - second;
}

func divide(_ first: Int, _ second: Int) -> Int {
    return first / second;
}

let temp2 = divide(temp, 2)
// print(temp2)

let someFunction: (Int, Int) -> Int = divide
let temp3 = someFunction(10, 5)
//print(temp3)

func doOperation(_ b: Bool,
                 _ f1: (Int, Int) -> Int,
                 _ f2: (Int, Int) -> Int) -> Int {
    if b {
        return f1(3, 4);
    } else {
        return f2(3, 4);
    }
}

let temp4 = doOperation(true, subtract, divide);
print(temp4); // -1
let temp5 = doOperation(false, subtract, divide);
print(temp5); // 0
//                                         in JavaScript
//                                         (a, b) => a * b
let temp6 = doOperation(false, subtract, { (a, b) in a * b });
print(temp6);

let mult/*: (Int, Int) -> Int*/ = { (a: Int, b) in a * b };
print(mult(7, 8));

let thunk: () -> Int = { 2 + 2 };

