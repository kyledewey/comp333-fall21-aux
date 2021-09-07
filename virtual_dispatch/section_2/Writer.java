// Needs virtual dispatch
//  - Multiple distinct behaviors are possible;
//    isolate code related to the different
//    behaviors
//  1.) Writing to a terminal
//  2.) Writing to a file
//  3.) Writing to a network location

public interface Writer {
    public void writeThing(int thingToWrite);
    public void close();
}

// public class Writer {
//     private final FileOutputStream stream;
//     private final Socket socket;
    
//     public Writer(final boolean userWantsConsole,
//                   final String destinationFile,
//                   final IPAddress address) {
//         if (destinationFile != null) {
//             File file = new File(destinationFile);
//             stream = new FileOutputStream(file);
//             socket = null;
//         } else if (address != null) {
//             socket = new Socket(address);
//             stream = null;
//         } else if (userWantsConsole) {
//             stream = null;
//             socket = null;
//         } else {
//             throw new InvalidArgumentException("not sure what to open");
//         }
//     }

//     1,000 possible behaviors - 1,000 checks
//     O(n) to figure out which code to execute
//
//     Virtual dispatch: O(1)

//     public void writeThing(int thingToWrite) {
//         if (stream != null) {
//             stream.writeln(thingToWrite);
//         } else if (socket != null) {
//             socket.writeln(thingToWrite);
//         } else {
//             System.out.println(thingToWrite);
//         }
//     }

//     public void close() {
//         if (stream != null) {
//             stream.close();
//         } else if (socket != null) {
//             socket.close();
//         }
//     }
// }
