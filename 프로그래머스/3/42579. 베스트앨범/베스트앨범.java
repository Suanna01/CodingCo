import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        
        // 장르 정렬 map
        Map<String, Integer> totalPlays = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            totalPlays.put(genres[i], totalPlays.getOrDefault(genres[i], 0) + plays[i]);
        }
        // 장르별 노래 정렬 map
        Map<String, List<int[]>> songs = new HashMap<>();
        for (int i = 0; i < plays.length; i++) {
            songs.putIfAbsent(genres[i], new ArrayList<>());
            songs.get(genres[i]).add(new int[]{i, plays[i]});
        }
        
        List<String> sortedGenres = new ArrayList<>(totalPlays.keySet());
        sortedGenres.sort((a,b) -> 
                          Integer.compare(totalPlays.get(b), totalPlays.get(a))
        ); 
        
        for (String genre: sortedGenres) {
            List<int[]> list = songs.get(genre);
            list.sort((a,b) -> {
                if (a[1] == b[1]) { // 노래 재생 수 같을 때
                    return Integer.compare(a[0], b[0]); // 장르 고유번호 오름차
                }
                return Integer.compare(b[1],a[1]); // 노래 재생 수 내림차
            });
                
            for (int i = 0; i<Math.min(2, list.size()); i++) {
                answer.add(list.get(i)[0]);
            }
        }
            
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}