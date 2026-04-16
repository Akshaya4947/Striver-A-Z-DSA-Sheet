import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        String s = " I am a good coder ";
//      System.out.println(bruteForceApproach(s));
        System.out.println(optimalApproach(s));
    }

    static String bruteForceApproach(String s){
        List<String> l1 = new ArrayList<>();
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                s1.append(s.charAt(i));
            }else if(s1.length()>0){
                l1.add(s1.toString());
                s1.setLength(0);
            }
        }
        if(s1.length()>0){
            l1.add(s1.toString());
        }
        Collections.reverse(l1);
        return String.join(" ",l1);
    }

    static String optimalApproach(String s){
        StringBuilder s1 = new StringBuilder();
        int i = s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)== ' '){
                i--;
            }
            if(i<0) break;
            int end = i;
            while(i>=0 && s.charAt(i)!= ' '){
                i--;
            }
            String s2 = s.substring(i+1,end+1);
            if(s1.length()>0){
                s1.append(" ");
            }
            s1.append(s2);
        }
        return s1.toString();
    }
}
