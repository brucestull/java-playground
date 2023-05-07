package com.print_a_thing;

public class RunIt {
    public static void main(String[] args) {
        PrintAThing thePrinter = new PrintAThing();
        String theMessageToPrint = "The Big Ol' Thing!";
        thePrinter.printTheThingWeGet(theMessageToPrint);
        thePrinter.printTheThingWeGet("The Big Ol' Thing!");
    }
}
