package niukecontest;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        //int[] arr = {5,1,0,4,3,2};
        int[] arr = {5, 0, 4, 3, 2};
        System.out.println(solution(arr, 3));
    }

    private static int solution(int[] fa, int x) {
        if (fa[x] == x)
            return x;
        else
            return solution(fa, fa[x]);
    }

    /*ruleKey == "type" วา ruleValue == typei กฃ
    ruleKey == "color" วา ruleValue == colori กฃ
    ruleKey == "name" วา ruleValue == namei กฃ*/
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
         int res = 0;
         int index;
         if(ruleKey.equals("type")){
             index = 0;
         }else if(ruleKey.equals("color")){
             index = 1;
         }else {
             index = 2;
         }
         String temp;
        for (List<String> item : items) {
            temp = item.get(index);
            if (ruleValue.equals(temp)) {
                res++;
            }
        }
       return  res;
    }
}
