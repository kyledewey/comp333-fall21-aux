public class Main {
    // Nesting if's
    // passing same variables repeatedly
    // doComputation itself doesn't need userWantsConsole
    // stream is a global variable
    
    public static void writeThing(boolean userWantsConsole,
                                  String destinationFile,
                                  int thingToWrite) {
        if (userWantsConsole) {
            System.out.println(thingToWrite);
        } else {
            if (stream == null) {
                File file = new File(destinationFile);
                stream = new FileOutputStream(file);
            }
            stream.writeln(thingToWrite);
        }
    }
    
    public static int doComputation(boolean userWantsConsole,
                                    String destinationFile) {
        // do some computation
        int output = ...; // intended to be some complex calculation
        writeThing(userWantsConsole, destinationFile, output);
    }
    
    // Takes some arguments from the user
    // Performs some computation
    // Depending on arguments, write output to the console,
    // or to a provided file
    public static void main(String[] args) {
        boolean userWantsConsole = doesUserWantConsole(args);
        String destinationFile = getDestinationFile(args);

        int output = doComputation(userWantsConsole, destinationFile);
        writeThing(userWantsConsole, destinationFile, output);

        if (stream != null) {
            stream.close();
        }
    }
}
