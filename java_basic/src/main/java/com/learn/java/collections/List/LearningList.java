package com.learn.java.collections.List;

import java.util.ArrayList;
import java.util.List;

public class LearningList<T> {
    protected List<T> list;

    public LearningList(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void addElement(T element) {
        list.add(element);
    }

    public void injectElement(int index, T element) {
        list.add(index, element);
    }

    public void addAllElement(List<T> otherList) {
        list.addAll(otherList);
    }

    public int listSize() {
        return list.size();
    }

    public T getData(int index) {
        return list.get(index);
    }

    public int getIndex(Object object) {
        return list.indexOf(object);
    }

    public int getLastIndex(Object object) {
        return list.lastIndexOf(object);
    }
}
