 






/**
 * Created by Yang on 1/23/20.
 */

import java.util.Arrays;
import java.util.*;

public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String s : array) {
            if (s == value) {return true;} 
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String tmp = "";
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length -1 -i];
            array[array.length -1 -i] = tmp;;  
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] comp = array.clone();
        String tmp = "";
        for (int i = 0; i <= array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length -1 -i];
            array[array.length -1 -i] = tmp;  
        }
        if (Arrays.equals(array, comp)) {return true;}
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        //String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        //String[] alp = alphabet.split(" ");
        String string = "";
        boolean flag = true;
        for (String letter : array) {
            string = string + letter;
        }
        string = string.toLowerCase();
        
        for (char c = 'a'; c <= 'z'; ++c) {
            if(!string.contains(String.valueOf(c))) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int counter = 0;
        for (String s : array) {
            if (s == valueToRemove) {
                counter = counter + 1;
            }
        }
        String[] result = new String[array.length - counter];
        int index = 0;
        while(index < result.length) {
            for (String s : array) {
                if (s != valueToRemove) {
                    result[index] = s;
                    index = index + 1;
                }
            }
        }
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> arr_list = new ArrayList<String>(Arrays.asList(array));
        ArrayList<String> result = new ArrayList<String>();
        
        result.add(arr_list.get(0));
        
        for(int i = 1; i < arr_list.size(); i++) {
            if (!arr_list.get(i - 1).equals(arr_list.get(i))) {
                result.add(arr_list.get(i));
            }
        }
        String[] result_array = result.toArray(new String[result.size()]);
        for (int i = 0; i < result_array.length; i++) {
            result_array[i] = result.get(i);
        }
        return result_array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> arr_list = new ArrayList<String>(Arrays.asList(array));
        ArrayList<String> result = new ArrayList<String>();
        String dup_word = arr_list.get(0);
        String result_str = arr_list.get(0);
        
        for(int i = 1; i < arr_list.size(); i++) {
            if (arr_list.get(i).equals(dup_word)){
                result_str = result_str + arr_list.get(i);
            }
            else {
                result.add(result_str);
                dup_word = arr_list.get(i);
                result_str = arr_list.get(i);
            }
        }
        result.add(result_str);
        
        
        String[] result_array = result.toArray(new String[result.size()]);
        for (int i = 0; i < result_array.length; i++) {
            result_array[i] = result.get(i);
        }
        return result_array;
    }


}
