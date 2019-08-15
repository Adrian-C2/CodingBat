package CodingBat;

public class Warmup1 {

    public static void main(String args[]) {
        Warmup1 test  = new Warmup1();
        System.out.println(test.frontTimes("Cg", 2));
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return !(aSmile ^ bSmile);
    }

    public int sumDouble(int a, int b) {
        return a == b ? (a + b) * 2 : (a + b);
    }

    public int diff21(int n) {
        return n > 21 ? Math.abs(n-21) * 2 : Math.abs(n-21);
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }

    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || (a+b) == 10);
    }

    public boolean nearHundred(int n) {
        return Math.abs(n-100) < 11 || Math.abs(n-200) < 11;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        return negative ? (a < 0 && b < 0) : (a < 0 && b > 0) || (a > 0 && b < 0);
    }

    public String notString(String str) {
        return str.contains("not") ? str.substring(0,3).equalsIgnoreCase("not") ? str : "not " + str : "not " + str;
    }

    public String missingChar(String str, int n) {
        return str.substring(0,n)+str.substring(n+1,str.length());
    }

    public String frontBack(String str) {
        return str.isEmpty() ? "" : (str.charAt(str.length()-1) + (str.length() > 1 ? str.substring(1,str.length()-1) : "") +
                (str.length() > 1 ? str.charAt(0) : ""));
    }

    public String front3(String str) {
        return str.length() < 3 ? str+str+str : str.substring(0,3)+str.substring(0,3)+str.substring(0,3);
    }

    public String backAround(String str) {
        return str.charAt(str.length()-1)+str+str.charAt(str.length()-1);
    }

    public boolean or35(int n) {
        return ((n%3) == 0 || (n%5) == 0);
    }

    public String front22(String str) {
        return str.length() < 2 ?
                str+str+str :
                str.substring(0,2)+str+str.substring(0,2);
    }

    public boolean startHi(String str) {
        return str.length() > 1 ? str.substring(0,2).equalsIgnoreCase("hi") : false;
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100);
    }

    public boolean in1020(int a, int b) {
        return (a > 9 && a < 21) || (b > 9 && b < 21);
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a > 12 && a < 20) || (b > 12 && b < 20) || (c > 12 && c < 20);
    }

    public boolean loneTeen(int a, int b) {
        return (a > 12 && a < 20) ^ (b > 12 && b < 20);
    }

    public String stringTimes(String str, int n) {
        String res = "";

        for(int i = 0; i < n; i++)
            res += str;

        return res;
    }

    public String frontTimes(String str, int n) {
        String res =  "";

        for(int i = 0; i < n; i++)
            res += str.length() < 3 ? str : str.substring(0,3);

        return res;
    }
}
