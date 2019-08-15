package CodingBat;

public class WarmUp2 {

    public static void main(String args[]) {
        WarmUp2 test  = new WarmUp2();
        System.out.println(test.altPairs("x"));
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

    public int countXX(String str) {
        int res = 0;
        String prev = "";

        for(char item : str.toCharArray()) {
            if(prev.equalsIgnoreCase(item+"") && prev.equalsIgnoreCase("x"))
                res++;

            prev = item+"";
        }


        return res;
    }

    boolean doubleX(String str) {
        String prev = "";

        for(char item : str.toCharArray()) {
            if(prev.equalsIgnoreCase(item+"") && prev.equalsIgnoreCase("x")) {
                return true;
            }
            else if(prev.equalsIgnoreCase("x"))
                return false;

            prev = item+"";
        }

        return false;
    }

    public String stringBits(String str) {
        String res =  "";

        for(int i = 0; i < str.length(); i+= 2)
            res += str.charAt(i);

        return res;
    }

    public String stringSplosion(String str) {
        String res = "";

        for (int i = 0; i <= str.length(); i++) {
            res += str.substring(0,i);
        }

        return res;
    }

    public int last2(String str) {
        if(str.length() < 2)
            return 0;

        int counter = -1;
        String last = str.substring(str.length()-2,str.length()), prev = "";

        for(char item : str.toCharArray()) {
            if(last.equalsIgnoreCase(prev+item))
                counter++;

            prev = item+"";
        }

        return counter;
    }

    public int arrayCount9(int[] nums) {
        int counter = 0;

        for(int item : nums) {
            if(item == 9)
                counter++;
        }

        return counter;
    }

    public boolean arrayFront9(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(i > 3)
                return false;

            if(nums[i] == 9)
                return true;
        }

        return false;
    }

    public boolean array123(int[] nums) {
        if(nums.length < 3)
            return false;

        for(int i = 0; i < nums.length-2; i++) {
            if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3)
                return true;
        }

        return false;
    }

    public int stringMatch(String a, String b) {
        int counter = 0, top = a.length() > b.length() ? b.length() : a.length();

        for(int i = 0; i < top-1; i++) {
            if(b.substring(i,i+2).equalsIgnoreCase(a.substring(i,i+2))) {
                counter++;
            }
        }

        return counter;
    }

    public String StringX(String str) {
        if(str.isEmpty() || str.equalsIgnoreCase("X"))
            return str;

        return (str.charAt(0) == 'x' ? "x" : "")+str.replace("x","")+
                (str.charAt(str.length()-1) == 'x' ? "x" : "");
    }

    public String altPairs(String str) {
        String result = "";

        for(int i = 0; i < str.length()-1; i+=4) {
            result += str.substring(i, i+2);
        }

        return result;
    }

    public void printTo10(int currentNumber, int top) {
        System.out.println(currentNumber);

        if(currentNumber < top)
            printTo10(currentNumber+1, top);
    }
}