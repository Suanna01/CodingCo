import java.io.*;

public class Main {
    //평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.

    //평가 : 내용
    //A : best!!!
    //B : good!!
    //C : run!
    //D : slowly~
    //나머지 문자들 : what?

    //switch( ) ... case... break; 제어문을 사용해보기
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        switch(a){
            case "A":
                System.out.println("best!!!");
                break;
            case "B":
                System.out.println("good!!");
                break;
            case "C":
                System.out.println("run!");
                break;
            case "D":
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
                break;

        }
    }
}
