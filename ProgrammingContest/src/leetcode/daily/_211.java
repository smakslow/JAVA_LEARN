package leetcode.daily;

public class _211 {
    class Trie {

        Trie[] children;
        boolean isEnd;

        public Trie() { // ��ʼ��

            children = new Trie[26];
            isEnd = false;
        }
    }

    class WordDictionary {
        Trie root;

        public WordDictionary() {
            root = new Trie(); // ��ʼ��
        }

        public void addWord(String word) { // �� word ��ӵ����ݽṹ�У�֮����Զ�������ƥ��
            Trie node = this.root;
            int n = word.length();
            for (int i = 0; i < n; i++) {
                if (node.children[word.charAt(i) - 'a'] == null) {
                    node.children[word.charAt(i) - 'a'] = new Trie();
                }
                node = node.children[word.charAt(i) - 'a'];
            }
            node.isEnd = true;
        }

        public boolean search(String word) {
            return searchWord(word, this.root);
        }

        public boolean searchWord(String word, Trie root) { // �ݹ�

            Trie node = root;
            int n = word.length();
            for (int i = 0; i < n; i++) {

                char c = word.charAt(i);
                if (c != '.' && node.children[c - 'a'] == null) return false;
                if (c == '.') { // ����� '.'����Ըýڵ����в�Ϊ�յĽڵ�����������
                    for (int j = 0; j < 26; j++) { // �������� node.children[26]
                        // ���������һ����ĸ�������һ����ĸ��ʼ�ټ��������
                        if (node.children[j] != null) {
                            if (searchWord(word.substring(i + 1), node.children[j])) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                node = node.children[c - 'a'];
            }
            return node.isEnd;
        }
    }

}
