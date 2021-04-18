package com.smalsow.javapractice.tree;

public class TrieTest {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("hello");
        boolean b = trie.startsWith("he");
        System.out.println(b);
        boolean search = trie.search("he");
        System.out.println(search);
    }
}
