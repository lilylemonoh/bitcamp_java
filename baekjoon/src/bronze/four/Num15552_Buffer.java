package bronze.four;

import java.io.*;

public class Num15552_Buffer {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
    	
    	BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osw);

        int Testcase = Integer.parseInt(br.readLine());
        for(int i=0; i < Testcase; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            bw.write((a+b) + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}