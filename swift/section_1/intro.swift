// local type inference
let x = 17
// x = 18; // works fine
print(x)

// public static int multiply(int first, int second) {
//   return first * second;
// }
//
// func returnsVoid() -> Void {}
// func returnsVoid() {}

func multiply(_ first: Int, second: Int) -> Int {
    return first * second
}

// self-documenting code - well-chosen names,
// avoid comments
let temp = multiply(3, second: 4);
print(temp);
