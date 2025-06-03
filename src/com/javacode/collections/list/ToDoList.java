package com.javacode.collections.list;

import java.util.*;


public class ToDoList {
    private LinkedList<String> toDoList = new LinkedList<>();

    public void addToList(String task) {
        toDoList.add(task);
        addToAlphabeticalOrder(task);
    }

    private boolean addToAlphabeticalOrder(String task){
        ListIterator<String> listIter = toDoList.listIterator();
        while (listIter.hasNext()){
            int compared = listIter.next().compareTo(task);
            if (compared == 0) {
                System.out.println("Task already exists in the list");
                return true;
            } else if (compared >0) {
                listIter.previous();
                listIter.add(task);
                return true;
            }
        }
        toDoList.add(task);
        return true;
    }
    public void addToListAtPosition(int position, String task) {
        if (position < toDoList.size()) {
            toDoList.add(position, task);
        } else {
            System.out.println("Please enter a new task");
                 }
    }

    public void printToDoList() {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i + " - " + toDoList.get(i));
        }
        Iterator<String> iterator = toDoList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element " + iterator.next());
        }
    }

    public void changeTask(int index, String task) {
        toDoList.set(index, task);
    }

    public void removeTask(String task) {
        toDoList.remove(task);

    }

    public int getTaskPriorety(String task) {
        return toDoList.indexOf(task);
    }
}
