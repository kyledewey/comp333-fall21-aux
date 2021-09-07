public class Main {    
    public static int doComputation(Writer writer) {
        int intermediateValue = 32; // some long-running computation

        writer.writeThing(intermediateValue);

        return intermediateValue + 42;
    }
    
    public static void main(String[] args) {
        boolean userWantsConsole = doesUserWantConsole(args);
        String destinationFile = getDestinationFile(args);
        Writer writer = new Writer(userWantsConsole, destinationFile);

        int output = doComputation(writer);

        writer.writeThing(output);

        writer.close();
    }
}
