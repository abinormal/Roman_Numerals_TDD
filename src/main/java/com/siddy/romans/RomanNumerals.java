package com.siddy.romans;

public class RomanNumerals {

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
            default -> "Something went wrong";
        };
    }

    private int stripOffLastDigit(int number) {
        return number / 10;
    }

    private int getLastDigit(int number) {
        return number % 10;
    }

    private String getUnits(int number) {
        return switch (number) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            default -> "";
        };
    }

    private String getTens(int number) {
        return switch (number) {
            case 1 -> "X";
            case 2 -> "XX";
            case 3 -> "XXX";
            case 4 -> "XL";
            case 5 -> "L";
            case 6 -> "LX";
            case 7 -> "LXX";
            case 8 -> "LXXX";
            case 9 -> "XC";
            default -> "";
        };
    }

    private String getHundreds(int number) {
        return switch (number) {
            case 1 -> "C";
            case 2 -> "CC";
            case 3 -> "CCC";
            case 4 -> "CD";
            case 5 -> "D";
            case 6 -> "DC";
            case 7 -> "DCC";
            case 8 -> "DCCC";
            case 9 -> "CM";
            default -> "";
        };
    }
}
