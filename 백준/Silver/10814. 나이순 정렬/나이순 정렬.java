import java.io.*;
import java.util.*;

public class Main{
    // 정렬을 위해 객체 생성
    static class Person{
        int age;
        String name;
        int order; //입력된 순서

        //생성자
        Person(int age, String name, int order){
            this.age=age;
            this.name=name;
            this.order=order;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //Person 객체 배열 생성
        Person[] people = new Person[n];

        for (int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            people[i] = new Person(age, name, i);
        }

        /*
        정렬 기준 :
        1순위. 나이순 정렬
        2순위. 나이 같으면 입력 순서에 따라 정렬
        */
        Arrays.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2){
                if (p1.age==p2.age){
                    return p1.order-p2.order; //나이가 같으면 입력된 순서에 따라 비교
                }
                return p1.age-p2.age; //나이순 정렬
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Person p : people){
            sb.append(p.age).append(' ').append(p.name).append('\n');
        }

        System.out.print(sb);
    }
}