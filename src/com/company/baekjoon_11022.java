package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            st  = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(String.format("Case #%d: %d + %d = %d",i+1,a,b,a+b)+"\n");
        }

        bw.close();


    }
}
