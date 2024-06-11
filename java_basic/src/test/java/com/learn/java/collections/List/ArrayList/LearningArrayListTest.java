package com.learn.java.collections.List.ArrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LearningArrayListTest {

    @Test
    public void newStringArrayListAddTest() {
        ArrayList<String> stringList = new ArrayList<>(100);
        LearningArrayList<String> learningArrayList = new LearningArrayList<String>(stringList);

        ArrayList<String> arrayList = learningArrayList.getList();

        learningArrayList.addElement("Test");
        learningArrayList.addElement("Test2");

        learningArrayList.injectElement(1, "inject Test");

        System.out.println("======================================");

        for (String str: arrayList) {
            System.out.println("str = " + str);
        }

        System.out.println("======================================");

        ArrayList<String> stringList2 = new ArrayList<>();
        LearningArrayList<String> learningArrayList2 = new LearningArrayList<>(stringList2);

        ArrayList<String> arrayList2 = learningArrayList2.getList();

        learningArrayList2.addAllElement(arrayList);

        for (String str : arrayList2) {
            System.out.println("str2 = " + str);
        }

        System.out.println("======================================");

        assertTrue(arrayList.contains("Test"));
        assertTrue(arrayList.contains("Test2"));
        assertTrue(arrayList.contains("inject Test"));
        assertTrue(arrayList2.containsAll(arrayList));
        assertEquals(arrayList.size(), arrayList2.size());
        assertEquals(arrayList, arrayList2);
    }

    @Test
    public void referenceTest () {
        ArrayList<String> list = new ArrayList<>();
        LearningArrayList<String> stringArrayList = new LearningArrayList<>(list);
        
        stringArrayList.addElement("A");

        // list의 주솣 값을 list2가 참조하고 있기 때문에 list에 추가해도 list2는 같은 곳을 바라보기 때문에 동일한 list가 담기게 된다.
        ArrayList<String> list2 = list;
        LearningArrayList<String> stringArrayList2 = new LearningArrayList<>(list2);
        stringArrayList.addElement("Ooops");
        
        for(String str: stringArrayList.getList()) {
            System.out.println("str = " + str);
        }

        assertTrue(list2.contains("Ooops"));
    }
}