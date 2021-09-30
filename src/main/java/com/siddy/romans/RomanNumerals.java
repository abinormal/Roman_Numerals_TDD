package com.siddy.romans;

public class RomanNumerals {

    // Given a string of numerals return the value as an int
    public int getNumeral(String string) {
        return switch (string) {
            case "I" -> 1;
            case "V" -> 5;
            case "X" -> 10;
            case "L" -> 50;
            case "C" -> 100;
            case "D" -> 500;
            case "M" -> 1000;
            default -> 0;
        };
    }

    // Given an int return the Roman numerals as a String
    public String getNumeral(int number) {
        // Get last digit
        // Get the numeral
        // Take last digit off number
        int length = String.valueOf(number).length();

        if (number == 0) {
            return "";
        }
        return switch (length) {
            case 1 -> getUnits(number);
            case 2 -> getTens(getLastDigit(stripOffLastDigit(number))) +
                    getUnits(getLastDigit(number));
            case 3 -> getHundreds(getLastDigit(stripOffLastDigit(stripOffLastDigit(number)))) +
                    getTens(getLastDigit(stripOffLastDigit(number))) +
                    getUnits(getLastDigit(number));
            case 4 -> getThousands(getLastDigit(stripOffLastDigit(stripOffLastDigit(stripOffLastDigit(number))))) +
                    getHundreds(getLastDigit(stripOffLastDigit(stripOffLastDigit(number)))) +
                    getTens(getLastDigit(stripOffLastDigit(number))) +
                    getUnits(getLastDigit(number));
            default -> "I can't handle this many numbers yet.";
        };
    }

    private int stripOffLastDigit(int number) {
        return number / 10;
    }

    private int getLastDigit(int number) {
        return number % 10;
    }

    private String getUnits(int number) {
        String[] units = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return units[number];
    }

    private String getTens(int number) {
        String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        return tens[number];
    }

    private String getHundreds(int number) {
        String[] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        return hundreds[number];
    }

    // todo - work out how to create a macron over the numeral to specify 1000s
    private String getThousands(int number) {
        String[] thousands = {"","M","MM","MMM","MMMM","MMMMM","MMMMMM","MMMMMMM","MMMMMMMM","MMMMMMMMM"};
        return thousands[number];
    }
}
