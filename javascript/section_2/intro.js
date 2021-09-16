// In Java: types must be explicitly written
// public static int addTwo(int x, int y) {
//   int temp = x + y;
//   return temp;
// }
//

// JavaScript:
function addTwo(x, y) {
    let temp = x + y;
    return temp;
}

// In Java: can't write it (not valid Java below)
// public static (int | String) doSomething(int x) { ... }
function doSomething(x) {
    if (x > 7) {
        return 13;
    } else {
        return "hello";
    }
}
