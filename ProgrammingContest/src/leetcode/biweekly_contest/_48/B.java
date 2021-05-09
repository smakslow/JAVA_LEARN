package leetcode.biweekly_contest._48;

import java.util.HashMap;

public class B {
    class AuthenticationManager {
        int timeToLive;
        HashMap<String,Integer> map = new HashMap<>();
        public AuthenticationManager(int timeToLive) {
            this.timeToLive = timeToLive;
        }

        public void generate(String tokenId, int currentTime) {
             map.put(tokenId,currentTime + timeToLive);
        }

        public void renew(String tokenId, int currentTime) {
            if(map.containsKey(tokenId)){
                if(map.get(tokenId) > currentTime){
                    generate(tokenId,currentTime);
                }
            }
        }

        public int countUnexpiredTokens(int currentTime) {
            int res = 0;
            for (Integer value : map.values()) {
                if(currentTime < value){
                    res++;
                }
            }
            return res;
        }
    }
}
