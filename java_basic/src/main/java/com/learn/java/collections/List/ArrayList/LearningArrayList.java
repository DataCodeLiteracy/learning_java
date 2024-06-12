package com.learn.java.collections.List.ArrayList;

import com.learn.java.collections.List.LearningList;

import java.util.ArrayList;

public class LearningArrayList<T> extends LearningList<T> {

    // new ArrayList의 <> 에는 데이터 타입 생략 가능
    // ( ) 안에 초기값을 넣어줄 수 있음, 초기값을 넣지 않으면 기본 10개로 생성
    // 동적 배열이기 때문에 리사이징해서 크기를 늘려서 관리,
    // 따라서 너무 빈번하게 리사이징이 일어나지 않게 하기 위해 어느 정도 데이터 크기가 정해져 있다면 초기값을 설정하는 걸 권장
    // ArrayList<String> list = new ArrayList<>(100);

    public LearningArrayList(int initialCapacity) {
        super(new ArrayList<>(initialCapacity));
    }

    public LearningArrayList() {
        super(new ArrayList<>());
    }

    public LearningArrayList(ArrayList<T> list) {
        super(list);
    }

    @Override
    public ArrayList<T> getList() {
        return (ArrayList<T>) list;
    }
}
