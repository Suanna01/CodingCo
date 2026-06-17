import java.io.*;
import java.util.*;

class Solution {
    public String solution(int age) {
        String s = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int num = c - '0';
            sb.append((char) ('a' + num));
        }
        
        return sb.toString();
    }
}