package leetcode.biweekly_contest._60;

import java.util.HashMap;

public class C {
    class Node{

    }
    class LockingTree {
        int[] parent;
        int n;
        HashMap<Integer, Integer> map; //num, user

        public LockingTree(int[] parent) {
            this.parent = parent;
            this.n = parent.length;
            this.map = new HashMap<>();
        }

        public boolean lock(int num, int user) {
            if (map.containsKey(num)) return false;
            map.put(num, user);
            parent[num] = 1;
            return true;
        }

        public boolean unlock(int num, int user) {
            if (map.getOrDefault(num, -1) == user) {
                map.remove(num);
                parent[num] = 0;
                return true;
            }
            return false;
        }

        public boolean upgrade(int num, int user) {
            if (checkChild(num, 0) && checkPar(num) && !map.containsKey(num)) {
                lock(num, user);
                delete(num);
                return true;
            }
            return false;
        }

        private void delete(int num) {
            int left = num * 2 + 1;
            int right = num * 2 + 2;
            if (left < n) {
                if (parent[left] == 1) {
                    parent[left] = 0;
                    map.remove(left);
                }
                delete(left);
            }
            if (right < n) {
                if (parent[right] == 1) {
                    parent[right] = 0;
                    map.remove(right);
                }
                delete(right);
            }
        }

        private boolean checkPar(int num) {
            while (num >= 0) {
                int p;
                if (num % 2 == 0) {
                    p = (num - 1) / 2;
                } else {
                    p = num / 2;
                }
                if (parent[p] == 1) return false;
                num = p;
            }
            return true;
        }

        private boolean checkChild(int num, int cnt) {
            int left = num * 2 + 1;
            int right = num * 2 + 2;
            if (left < n) {
                if (parent[left] == 1) cnt++;
                checkChild(left, cnt);
            }
            if (right < n) {
                if (parent[right] == 1) cnt++;
                checkChild(right, cnt);
            }
            return cnt > 0;
        }
    }

/**
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */
}
