package arraysEasy.Strings;

public class LargeOddNum {
    public static void main(String[] args) {
        String s = "04507";
        System.out.println(largestOddNum(s));
    }

    static String largestOddNum(String s){
        int ind = -1,i;
        for(i=s.length()-1;i>=0;i--){
            if((s.charAt(i) - '0') % 2 == 1){
                ind = i;
                break;
            }
        }

        if(ind == -1) return "";
        i=0;
        while(i<=ind && s.charAt(i)=='0'){
            i++;
        }
        return s.substring(i,ind+1);
    }
}
