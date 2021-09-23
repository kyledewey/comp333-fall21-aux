// Java equivalent:
// Java is statically-typed (types exist at compile time)
// public static int addTwo(int x, int y) {
//   return x + y;
// }
//
// public static String addTwo(String x, String y) {
//   return x + y;
// }

// JavaScript code:
// JavaScript is dynamically-typed (types exist only at runtime)
// no return type
// no parameter types
function addTwo(x, y) {
    // int temp = 17;
    // temp = "foobar"; // type mismatch: expected int, got String

    // ==: kinda equal
    // ===: no, really, equal
    if (typeof(x) == "number" && typeof(y) == "number") {
        let temp = x + y;
        return temp;
    } else {
        // ERROR
    }
}


// Haskell: statically, strongly-typed, type-inferred
// addTwoBasic x y = x + y

function addTwoBasic(x, y) {
    return x + y;
}
