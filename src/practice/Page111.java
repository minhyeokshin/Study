package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Page111 {
    public static void main(String[] args) throws IOException
    {
        System.out.println("정수를 3개 입력하십시오.");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();

        int sum = 0;
        sum += Integer.parseInt(str1);
        sum += Integer.parseInt(str2);
        sum += Integer.parseInt(str3);

        System.out.printf("3개 정수의 합은 %d입니다.",sum);
    }
}
