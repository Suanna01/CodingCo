import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 장르를 해시맵으로 묶어서 장르별로 재생 수 합치기 -> 장르를 총 재생 수 기준으로 정렬하기
        // 장르 내에서 재생 수 기준으로 해당 노래의 인덱스로 정렬하기
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        List<String> sortedGenres = new ArrayList<>();
        for (String genre : map.keySet()) {
            sortedGenres.add(genre);
        }
        sortedGenres.sort((a, b) -> {
            return Integer.compare(map.get(b), map.get(a));
        });
        
        List<Integer> answer = new ArrayList<>();
        
        for (String genre : sortedGenres) {
            // 장르 내, [인덱스, 재생 수] 리스트
            List<int[]> playList = new ArrayList<>();
            
            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(genre)) {
                    playList.add(new int[]{i, plays[i]});
                }               
            }
            
            // 재생 수 기준 정렬하기
            playList.sort((a, b) -> {
                if (a[1] == b[1]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(b[1], a[1]);
            });
            
            for (int i = 0; i < Math.min(2, playList.size()); i++) {
                answer.add(playList.get(i)[0]);
            }
            
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}