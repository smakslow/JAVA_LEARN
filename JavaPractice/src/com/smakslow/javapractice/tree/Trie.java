package com.smakslow.javapractice.tree;

public class Trie {
    private Trie[] children;  //26λ�ַ���
    private boolean isEnd;  //����Ƿ��ǵ��ʽ�β

    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }

    void insert(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new Trie();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    boolean search(String word) {
        Trie node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private Trie searchPrefix(String prefix) {
        Trie node = this;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            int index = ch - 'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }
}
