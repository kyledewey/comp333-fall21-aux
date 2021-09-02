public class Main {
    // stream is a global variable
    // error-handling
    // userWantsConsole and destinationFile are one unit
    private static FileOutputStream stream = null;
    
    public static void writeThing(boolean userWantsConsole,
                                  String destinationFile,
                                  int thingToWrite) {
        if (userWantsConsole) {
            System.out.println(thingToWrite);
        } else {
            stream.writeln(thingToWrite);
        }
    }
    
    public static int doComputation(boolean userWantsConsole,
                                    String destinationFile) {
        int intermediateValue = 32; // some long-running computation

        writeThing(userWantsConsole,
                   destinationFile,
                   intermediateValue);

        return intermediateValue + 42;
    }
    
    public static void main(String[] args) {
        boolean userWantsConsole = doesUserWantConsole(args);
        String destinationFile = getDestinationFile(args);

        if (!userWantsConsole) {
            File file = new File(destinationFile);
            stream = new FileOutputStream(file);
        }
        
        int output = doComputation(userWantsConsole, destinationFile);

        writeThing(userWantsConsole,
                   destinationFile,
                   output);

        stream.close();
    }
}
