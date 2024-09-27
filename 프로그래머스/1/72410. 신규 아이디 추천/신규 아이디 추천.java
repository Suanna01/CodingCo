import java.util.*;

class Solution {
    public String solution(String new_id) {
        //1
        char[] C = new_id.toLowerCase().toCharArray();
        ArrayList<Character> cc = new ArrayList<>();
        
        //2
        for (char c : C) {
            if (Character.isLetter(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.') {
                cc.add(c);
            }
        }
        //3
        for (int i = 1; i < cc.size(); i++) {
            if (cc.get(i) == '.' && cc.get(i - 1) == '.') {
                cc.remove(i);
                i--; // 현재 인덱스가 줄어드므로 다시 검사
            }
        }
        //4
        if (cc.size() > 0 && cc.get(0) == '.') {
            cc.remove(0); // 시작의 마침표 제거
        }
        if (cc.size() > 0 && cc.get(cc.size() - 1) == '.') {
            cc.remove(cc.size() - 1); // 끝의 마침표 제거
        }
        //5
        if (cc.isEmpty()) {
            cc.add('a');
        }
        //6
        if (cc.size() >= 16) {
            cc = new ArrayList<>(cc.subList(0, 15)); // 첫 15개 문자만 남김
            if (cc.get(cc.size() - 1) == '.') {
                cc.remove(cc.size() - 1); // 끝의 마침표 제거
            }
        }
        //7
        while (cc.size() < 3) {
            cc.add(cc.get(cc.size() - 1)); // 마지막 문자를 반복하여 추가
        }
        
        StringBuilder result = new StringBuilder();
        for (char c : cc) {
            result.append(c);
        }

        return result.toString();
    }
}