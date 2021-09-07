// Problem: different code behaviors are possible.
//          each one is very different from the other
public interface Writer {
    public void writeThing(int thingToWrite);
    public void close();
}


// public class Writer {
//     private final FileOutputStream stream;

    // public Writer(boolean userWantsConsole,
    //               String destinationFile) {
    //     if (!userWantsConsole) {
    //         File file = new File(destinationFile);
    //         stream = new FileOutputStream(file);
    //     } else {
    //         stream = null;
    //     }
    // }

//     public void writeThing(int thingToWrite) {
//         if (stream != null) {
//             stream.writeln(thingToWrite);
//         } else {
//             System.out.println(thingToWrite);
//         }
//     }

//     public void close() {
//         if (stream != null) {
//             stream.close();
//         }
//     }
// }
