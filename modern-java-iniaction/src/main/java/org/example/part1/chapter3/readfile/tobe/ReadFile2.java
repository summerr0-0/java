package org.example.part1.chapter3.readfile.tobe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile2 {

    //processFile 메서드가 한번에 두 행을 읽게 하도록 하기.
    //processFile의 동작을 파라미터화 해야 한다
    //processFile 메서드가BufferedReader를 이용해 다른 동작을 수행할 수 있도록 ProcessFile메서드로 동작을 전달

    public String solution() throws IOException {
        //람다를 이용해 다양한 동작을 process file 메서드로 전달할 수 있다.
        //이제 두행을 한번에 처리할 수 있게 됨.
        return processFile((BufferedReader br) -> br.readLine() + br.readLine());
    }

    public String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return p.process(br);
        }
    }

}
