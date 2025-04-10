import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int N=Integer.parseInt(br.readLine());
        Stack<Integer> stack=new Stack<>();
        int num = 1; //push할 숫자
        boolean possible=true;

        for (int i=0;i<N;i++){
            int target = Integer.parseInt(br.readLine());

            // target이 나올 때까지 push
            while(num<=target){
                stack.push(num++);
                sb.append("+\n");
            }

            //top이 target이면 pop
            if(stack.peek()==target){
                stack.pop();
                sb.append("-\n");
            }
            else{
                // top이 target이 아니면 불가능
                // (스택이라서 top이 target이 아니면 그 아래에 있는 값은 꺼낼 수 X)
                possible=false;
                break;
            }
        }

        System.out.println(possible?sb:"NO");
    }
}