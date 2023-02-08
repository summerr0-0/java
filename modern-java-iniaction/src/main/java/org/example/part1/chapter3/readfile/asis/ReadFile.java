package org.example.part1.chapter3.readfile.asis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    //실행 어라운드 패턴 : 자원 열기 -> 자원 처리 -> 자원 닫기
    public String processFile() throws IOException {
        //try with resource 구문으로 자원을 닫을 필요 없이 간단히 구현 가능하기
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return br.readLine();
        }
    }
}
