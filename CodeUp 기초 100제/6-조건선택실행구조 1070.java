import java.io.*;

public class Main {
    //월이 입력될 때 계절 이름이 출력되도록 해보자.

    //월 : 계절 이름
    //12, 1, 2 : winter
    //  3, 4, 5 : spring
    //  6, 7, 8 : summer
    //  9, 10, 11 : fall

    //switch( ).. case ... break; 제어문 사용하기
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        switch(a){
//            case(12|1|2):  // <-- case에서 여러 값을 or로 묶는 것은 불가능
//            case는 각각의 값에 대해 별도로 작성해야 하며, 각 case는 특정한 값만 매칭해야 함.
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;
            default:
                break;
        }

    }
}
