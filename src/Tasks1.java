import java.util.Arrays;

public class Tasks1 {

    public static String hiddenAnagram(String input1, String input2) {
        String secondInput = "";
        String firstInput = "";
        for (int i = 0; i < input1.length(); i++) {
            if (input1.charAt(i) != ' ') {
                firstInput += input1.charAt(i);
            }
        }
        for (int i = 0; i < input2.length(); i++) {
            if (input2.charAt(i) != ' ') {
                secondInput += input2.charAt(i);
            }
        }
        System.out.println("First");
        String finalString = "";
        char[] secondString = secondInput.toCharArray();
        char[] secondStringSaved = secondString;
        boolean done = false;
        for (int i = 0; i < firstInput.length() - secondInput.length() - 1; i++) {
            for (int j = 0; j < secondString.length; j++) {
                if (firstInput.charAt(i) == secondString[j]) {
                    finalString += firstInput.charAt(i);
                    secondString[j] = ' ';
                    done = true;
                }
            }
            if (!done) {
                finalString = "";
                secondString = secondStringSaved;
            }
        }
        return finalString;
    }

    public static String[] collect(String input, int wordLength) {
        int length = input.length();
        int size = input.length() / wordLength;
        String[] newString = new String[size];
        while (input.length() >= wordLength){
            for (int i = 0; i < size; i++) {
                length = input.length();
                newString[i] = input.substring(0, wordLength);
                input = input.substring(wordLength, length);
                if (input.length() < wordLength) {
                    break;
                }
            }
        }
        return newString;
    }

    public static String nicoCipher(String message, String key){
        int length = message.length();
        int lengthY = key.length();
        int counter = (length-length%lengthY) / lengthY;
        if (length%lengthY != 0){
            counter++;
        }
        for (int i = length; i < counter * lengthY; i++){
            message += " ";
        }
        char[][][] v = new char[counter][lengthY][2];
        for (int i = 0; i < counter; i++){
            for (int j = 0; j < lengthY; j++){
                v[i][j][0] = message.charAt(i * lengthY + j);
                v[i][j][1] = key.charAt(j);
            }
            Arrays.sort(v[i], (a,b) ->(int) a[1] - (int) b[1]);
        }
        String result = "";
        for (int i = 0; i < counter; i++){
            for (int j = 0; j < lengthY; j++){
                result += v[i][j][0];
            }
        }
        return result;
    }

    public static int[] twoProduct(int[] array, int target){
        int[] returnArray = new int[2];
        for (int i = 1; i < array.length; i++){
            for (int j = 0; j < i; j++){
                if (array[i] * array[j] == target){
                    returnArray[0] = array[i];
                    returnArray[1] = array[j];
                    return returnArray;
                }
            }
        }
        return returnArray;
    }

    public static int[] isExact(int inputNumber){
        int[] returnArray = new int[2];
        int counter = 1;
        int result = 1;
        while (result < inputNumber){
            result = result * (counter + 1);
            counter++;
            if (result == inputNumber){
                returnArray[0] = result;
                returnArray[1] = counter;
                return returnArray;
            }
        }
        return returnArray;
    }


}
