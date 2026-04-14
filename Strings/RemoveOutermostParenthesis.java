
public class RemoveOutermostParenthesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(remove(s));
    }

    static String remove(String s){
        StringBuilder s1 = new StringBuilder();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(count>0){
                    s1.append(ch);
                }
                count++;
            }else if(ch == ')'){
                count--;
                if(count>0){
                    s1.append(ch);
                }
            }
        }
        return s1.toString();
    }
}
