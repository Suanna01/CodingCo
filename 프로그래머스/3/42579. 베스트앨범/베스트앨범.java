import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        
        // 장르를 재생수가 높은 순서대로 정렬하기
        // 장르내에서 재생수가 높은 순서대로 정렬하기
        
        // 장르별 총 재생 수 합 구하기
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        // 장르를 총 재생수 순서대로 정렬하기
        List<String> sortedGenres = new ArrayList<>(map.keySet());
        sortedGenres.sort((a,b) -> 
                  Integer.compare(map.get(b), map.get(a))  // 이 곳엔 a,b가 포함되어야 함
        );
        
        // 정답 리스트
        List<Integer> answer = new ArrayList<>();
        
        // 정렬된 장르를 바탕으로, 해당 장르의 노래들을 재생수 순서대로 정렬하기 
        // [i, 재생수] 형식의 리스트 만들기
        // 장르는 이미 정렬되었고, 장르와 노래 리스트의 인덱스가 똑같기 때문에 
        // 2중 for문을 통해 이중 리스트를 만들지 않고 인덱스로 구분된 형식의 1차원 리스트로 구현할 수 있음.
        
        // 정렬된 장르 기준으로 
        for (String genre: sortedGenres) {
            // [i, 재생수] 리스트 만들기 => 정렬된 장르에 따라 sortedSongs에 재생순으로 정렬되게 됨.
            List<int[]> sortedSongs = new ArrayList<>();
            for (int i = 0; i < plays.length; i++) {
                if (genres[i].equals(genre)) {
                    sortedSongs.add(new int[]{i, plays[i]});
                }
            }
            // 재생순으로 정렬하기.
            // 2중 for문이라 여기까지 같은 장르이니 재생수만 정렬하면 됨.
            sortedSongs.sort((a,b) -> { // 여기서 a,b는 sortedSongs의 타입인 int[]이 담겨있음.
                if (a[1] == b[1]) { // 재생수 같으면 고유번호 낮은거부터
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(b[1], a[1]);
            });
            
            // 그럼 여기까지, 한 장르내에서 재생순 정렬 끝남.
            
            
            // 베스트 앨범에 장르별로 상위 노래 2개의 인덱스 담기
            for (int i = 0; i < Math.min(2, sortedSongs.size()); i++) {
                answer.add(sortedSongs.get(i)[0]);
            }
        }
        
        //배열로 바꾸어 return
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}