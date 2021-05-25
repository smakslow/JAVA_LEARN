package aliyun.tianchi.No_67;

import java.util.*;

public class D {
    class Word {
        String s;
        int cnt;

        public Word(String s, int cnt) {
            this.s = s;
            this.cnt = cnt;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        for (String word : words) {
            hashmap.put(word, hashmap.getOrDefault(word, 0) + 1);
        }
        ArrayList<String> ans = new ArrayList<>();
        PriorityQueue<Word> pq = new PriorityQueue<>((o1, o2) -> {
            if (o1.cnt == o2.cnt) {
                return o1.s.compareTo(o2.s);
            }
            return o2.cnt - o1.cnt;
        });
        for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
            pq.offer(new Word(entry.getKey(), entry.getValue()));
        }
        int cnt = 0;
        while (!pq.isEmpty() && cnt < k) {
            ans.add(pq.poll().s);
            cnt++;
        }
        return ans;
    }
}
