package exercise.chap_46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInsertRemovePerformanceTest {

    static final int SIZE = 100;

    public static void main(String[] args) {

        long startTime;
        long endTime;
        //List : 어떤 순서가 있는 데이터의 집합
        //List 종류: 1.ArrayList 2.LinkedList
        //ArrayList 데이터 영역이 순차적으로 배열 되어 있는 것 (Array
        //연속적인 공간에 순차적으로 데이터 저장
        //ex : LottoNumber..
        //몇번째의 인덱스 값을 조회 해야 된다면 사용
        //장점: indexing이 가능 위치를 찾을때 상수의 시간(data 양이 아무리 많든 똑같은 속도로 찾음)이 절약
        //단점 추가 기존에 있는 값을 다 옮겨야됨 삭제가 어려움
        //size 가 고정인게 장점일 경우도 있음
        //data size가 고정 size를 넓히려면 새로 하나 만들어서 전부 복사를 해야됨

        // 공통점: 순서가 있는 데이터 저장 및 자료 구조

        //LinkedList
        //비연속적인 공간에 순서대로 데이터 저장
        //다음 데이터를 가르키는 정보를 추가적으로 데이터를 저장을 해야된다 . (메모리를 좀 더 먹음)
        //장점 : 추가 및 삭제가 쉽다 만일 가운데에 값을 추가해야 될 경우
        // 5 > 11 이 5 > 9 > 11 을 넣기가 쉬움 단점은 찾을때 앞에서부터 찾아야되서 오래걸림

        //List ArrayList 구현
        List<Integer> integerList1 = new ArrayList<>();

        startTime = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            integerList1.add(i);
            //5번 돌 때 마다 1번씩 빠지게 되서 20부터 시작
            if( i % 5 == 0 ) integerList1.remove(0);
        }

        endTime = System.currentTimeMillis();

        System.out.println("ArrayList 삽입/삭제 요청 걸린시간: " + (endTime - startTime) + "ms");

        //List LinkedList 구현
        List<Integer> integerList2 = new LinkedList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            integerList2.add(i);
            if( i % 5 == 0 ) integerList2.remove(0);
        }

        endTime = System.currentTimeMillis();

        System.out.println("ArrayList: " + integerList1);
        System.out.println("ArrayList: " + integerList2);

        System.out.println("LinkedList 삽입/삭제 요청 걸린시간: " + (endTime - startTime));
    }
}
