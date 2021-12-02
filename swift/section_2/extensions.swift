// public class String {
//   public String substring(int start, int end) { ... }
// }

extension Bool {
    // methods in Swift use self instead of this
    func negate() -> Bool {
        return !self
        // if (self) {
        //     return false
        // } else {
        //     return true
        // }
    }
}

let b1 = true;
print(b1.negate());
