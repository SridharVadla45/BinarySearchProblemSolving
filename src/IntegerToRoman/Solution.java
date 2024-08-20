//package IntegerToRoman;
//
//public class Solution {
//    public static void main(String[] args) {
//        helper(3749);
//    }
//
//    public String intToRoman(int num) {
//        StringBuilder temp = new StringBuilder();
//
//
//
//        return temp.toString();
//    }
//
//
//    private static void helper(int num){
//        StringBuilder temp = new StringBuilder();
//
//        while(num>0){
//            if(num>=1000){
//                int count = num/1000;
//                num-=1000*count;
//                while(count-->0){
//                    temp.append("M");
//                }
//            }else if(num>=100){
//                int count = num/100;
//                num-=100*count;
//                if((count!= 4  count!= 9 ){
//                    while(count-->0){
//                        temp.append("C");
//                    }
//                }else{
//                    temp.append(substractForm(100*count));
//                }
//            }else if(num>=10){
//                int count = num/10;
//                num-=10*count;
//                while(count-->0){
//                    System.out.print(10 +" ");
//                }
//            }else if(num>=1){
//                int count = num/1;
//                num-=1*count;
//                while(count-->0){
//                    System.out.print(1 +" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//// 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
//
//    private static String  substractForm(int num){
//      switch (num){
//          case 4:
//               return "IV";
//          case 9:
//              return "IX";
//          case 40:
//              return "XL";
//          case 90:
//              return "XC";
//          case 400:
//              return "CD";
//          case 900:
//              return "CM";
//          default:
//              return "";
//
//      }
//    }
//
//
//
//
//}
