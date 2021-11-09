// local type inference
let x = 17
// x = 18; // works fine
//print(x)

// public static int multiply(int first, int second) {
//   return first * second;
// }
//
// func returnsVoid() -> Void {}
// func returnsVoid() {}

func add(_ first: Int, second: Int) -> Int {
    return first + second;
}

func multiply(_ first: Int, second: Int) -> Int {
    return first * second
}

// self-documenting code - well-chosen names,
// avoid comments
let temp: Int = multiply(3, second: 4);
//print(temp);

let myFunction: (Int, Int) -> Int = multiply;
//print(myFunction(5, 5));

func hasStringInt(s: String, i: Int) -> (String, Int) {
    return (s, i)
}

// one variable that holds two functions
// tuple
let basicTuple/*: (String, Int)*/ = ("foo", 17);
let (s, i) = basicTuple;
// print(basicTuple.0)
// print(basicTuple.1)

// arrays: size fixed at runtime, homogeneous types
// int someVariable = userInput();
// int[] myArray = new int[someVariable];

// tuples: size fixed at compile time, hetergeneous types
let myFunctions/*: ((Int, Int) -> Int, (Int, Int) -> Int)*/ = (add, multiply);

func doOperation(_ b: Bool,
                 _ f1: (Int, Int) -> Int,
                 _ f2: (Int, Int) -> Int) -> String {
    if b {
        return String(f1(3, 4));
    } else {
        return String(f2(3, 4));
    }
}

let doOpResult = doOperation(true, add, multiply);
// print(doOpResult);
// print(doOperation(false, add, multiply))

print(doOperation(true, add, { (x, y) in x / y }))

// in JavaScript:
// let divide = (x, y) => x / y;
let divide = { (x: Int, y) in x / y };
// print(divide(10, 2))

let getFirstIndex = { (s: String) in s.firstIndex(of: " ") }
// print(getFirstIndex("foo bar"))
