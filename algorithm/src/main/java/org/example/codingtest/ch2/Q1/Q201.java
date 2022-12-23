package org.example.codingtest.ch2.Q1;

import java.util.HashSet;

//중복 없애기: 정렬되어 있지 않은 연결리스트가 주어졌을 때
// 이 리스트에서 중복되는 원소를 제거하는 코드를 작성하라.

public class Q201 {
    //셋을 이용한 방식
    public LinkedList solution(LinkedList list) {
        HashSet<Integer> set = new HashSet<>();
        LinkedList.Node now = list.head;
        while (now.next != null){
            set.add(now.data);
            now = now.next;
        }
        set.add(now.data);
        LinkedList newList = new LinkedList();
        for(int s : set){
            newList.addNode(s);
        }
        return newList;
    }

    //셋을 사용하지 않을 때
    public LinkedList solution2(LinkedList list){
        LinkedList.Node lp = list.head;

        while(lp.next != null){
            LinkedList.Node rp = lp;
            while (rp.next != null){
                if(rp.next.data == lp.data){
                    rp.next = rp.next.next;
                }else {
                    rp = rp.next;
                }
            }
            lp = lp.next;
        }
        return list;
    }

}


