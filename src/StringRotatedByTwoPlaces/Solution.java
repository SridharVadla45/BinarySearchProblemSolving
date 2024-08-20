package StringRotatedByTwoPlaces;

public class Solution {

    public static void main(String[] args) {
      String str1= "daxjheq";
      String str2 ="eqdaxjh";
        System.out.println(str1);
      System.out.println(isRotated(str1,str2));

    }

    public static boolean isRotated(String str1, String str2)
    {
        int len1 = str1.length();
        int len2 = str2.length();
        if(len1!=len2) return false;
        char first = str1.charAt(0);
        char second = str1.charAt(1);
        String antiClock  = str1.substring(2,len1)+ first +second;
        System.out.println("Anti Clock : "+antiClock);
        if(antiClock.equals(str2)) return true;

        String last = String.valueOf(str1.charAt(len1-1));
        String secondLast = String.valueOf(str1.charAt(len1-2));
        String clock  = secondLast + last + str1.substring(0,len1-2);
        System.out.println("Clock : "+clock);

        return clock.equals(str2);
    }


}
