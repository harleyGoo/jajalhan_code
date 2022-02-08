package java.베스트앨범;

import java.util.*;

class Main {
  public static void main(String[] args) {
    String[] genres = {"classic", "pop", "classic", "classic", "pop"};
    int[] plays = {500, 600, 150, 800, 2500};

    Map<String, Integer> map = new HashMap<>();
    for(int i = 0; i < genres.length; i++) {
      map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
    }
    //key값만 가져와서 genre에 넣어준다
    ArrayList<String> genre = new ArrayList<>();
    for(String key : map.keySet()) {
      genre.add(key);
    }
    //key값에 해당하는 value를 내림차순으로 정렬한다.
    Collections.sort(genre, (o1, o2) -> map.get(o2) - map.get(o1));
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i < genre.size(); i++) {
      String g = genre.get(i);
      //해당 장르의 음악 중에서 play횟수가 가장 큰 인덱스를 찾는다
      int max = 0;
      int firstIdx = -1;
      for(int j = 0; j < genres.length; j++) {
        if(g.equals(genres[j]) && max < plays[j]) {
          max = plays[j];
          firstIdx = j;
        }
      }
      //해당 장르의 음악 중에서 play횟수가 두번째로 큰 인덱스를 찾는다.
      max = 0;
      int secondIdx = -1;
      for(int j = 0; j < genres.length; j++) {
        if(g.equals(genres[j]) && max < plays[j] && j != firstIdx) { 
          max = plays[j];
          secondIdx = j;
        }
      }
      list.add(firstIdx);
      if(secondIdx >= 0) list.add(secondIdx); //secondIdx는 존재 할수도, 안할수도 있다.
    }
    int[] result = new int[list.size()];
    for(int i = 0; i < list.size(); i++) {
        result[i] = list.get(i);
    }
    System.out.println(result);
    
    HashMap<String, Integer> hm = new HashMap<String, Integer>();
    //hashmap에 장르별 플레이 횟수 저장
    for(int i = 0; i < genres.length; i++) {                             
        hm.put(genres[i], hm.getOrDefault(genres[i], 0) + plays[i]);
    }
    //나중에 int[]형으로 바꿔서 리턴할 arrayList
    ArrayList<Integer> answers = new ArrayList<Integer>();
    //Value를 내림차순으로 정리하기 위해 정의
    ArrayList<String> al = new ArrayList<String>(hm.keySet());
    //ArrayList를 hm Value 내림차순 순으로 정렬
    Collections.sort(al, (o1,o2)->(hm.get(o2).compareTo(hm.get(o1))));
    
    //비교, 정답 추출 실행문
    for(int i = 0; i < al.size(); i++) {
      String TempGenres = al.get(i);
      int firstIdx = 0;
      int secondIdx = 0;
      int max = 0;
      //첫번째 값 구하기
      for(int j = 0; j < genres.length; j++) {
        //높은 순으로 가져온 장르와 genres배열의 값이 같으면
        if(TempGenres.equals(genres[j])) {
          //max와 비교해서 최댓값 갱신
          if(plays[j]> max) {
            max = plays[j];
            firstIdx = j;
          }
        }
      }

      max = -1; //장르가 하나일 수 있으므로 -1
      //두번째 값 구하기
      for(int j = 0; j < genres.length; j++) {
        if(TempGenres.equals(genres[j])) {
          if(j != firstIdx && plays[j] > max) {
            max = plays[j];
            secondIdx = j;
          }
        }
      }
      answers.add(firstIdx); //제일 큰 값 추가
      if(max != -1) {
      answers.add(secondIdx); //다음 큰 값 추가
      }
    }

    System.out.println(answers.stream().mapToInt(Integer::intValue).toArray());
  }
}