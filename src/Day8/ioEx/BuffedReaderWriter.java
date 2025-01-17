package Day8.ioEx;

import java.io.*;  // java.io. 모든 클래스를 import하겠다.
import java.util.StringTokenizer;


//BufferedReader , BufferedWriter
public class BuffedReaderWriter {
    public static void main(String[] args) throws IOException {

        // 키보드 입력
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        // 콘솔 출력
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

//        String str = br.readLine();  // 한줄에 입력받기
//
//        bw.write(str);
//        bw.flush(); // 남은 값 모두 출력하면서 비우기 기능

        int number = Integer.parseInt(br.readLine()); // 5를 정수로 바꾸어 저장

        for(int i = 1;i <= number;i++);{
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken()); // 첫번째로 입력된 숫자 입력
            int second = Integer.parseInt(st.nextToken()); // 두번쨰로 입력된 숫자 저장

            bw.write(String.valueOf(first)+ " ");
            bw.write(String.valueOf(second) + "\n");
        }
        bw.flush();

    }
}
