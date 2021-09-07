public class Main {    
    public static int doComputation(Writer writer) {
        int intermediateValue = 32; // some long-running computation

        writer.writeThing(intermediateValue);

        return intermediateValue + 42;
    }

    // - Wanted: an animal
    //    - Give: a cat
    //    - Give: a dog
    //    - Give: a dolphin
    
    //
    // - Writer (general type)
    //    - TerminalWriter (subtype of Writer)
    //    - FileWriter (subtype of Writer)
    //
    // - Writer (base class)
    //    - TerminalWriter (subclass of Writer; inherits from Writer)
    //    - FileWriter (subclass of Writer; inherits from Writer)
    public static Writer makeWriter(boolean userWantsConsole,
                                    String destinationFile) {
        if (userWantsConsole) {
            // subtyping polymorphism
            return new TerminalWriter();
        } else {
            return new FileWriter(destinationFile);
        }
    }
    
    public static void main(String[] args) {
        boolean userWantsConsole = doesUserWantConsole(args);
        String destinationFile = getDestinationFile(args);
        Writer writer = makeWriter(userWantsConsole, destinationFile);

        int output = doComputation(writer);

        // ad-hoc polymorphism / virtual dispatch / dynamic dispatch
        writer.writeThing(output);

        writer.close();
    }
}
