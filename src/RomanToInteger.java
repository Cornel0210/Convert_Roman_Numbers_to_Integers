public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("MDCXCV"));
    }

    public static int romanToInt(String s) {
        if (s.length()<=1){
            return get(s);
        }
        int sum = 0;
        String input;
        for (int i = 0; i < s.length()-1; i++) {
            input = s.substring(i, i+2);
            if (get(input)<0){
                sum += get(input.substring(0,1));
            } else {
                sum += get(input);
                i++;
            }
            if(i+1 == s.length()-1){
                sum+= get(s.substring(s.length()-1));
            }
        }
        return sum;
    }

    private static int get(String input){
        switch (input){
            case "I":
                return 1;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "IX":
                return 9;
            case "X":
                return 10;
            case "XL":
                return 40;
            case "L":
                return 50;
            case "XC":
                return 90;
            case "C":
                return 100;
            case "CD":
                return 400;
            case "D":
                return 500;
            case "CM":
                return 900;
            case "M":
                return 1000;
            default:
                return -1;
        }
    }
}
