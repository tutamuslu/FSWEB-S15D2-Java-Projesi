package com.workintech.company.model;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class main {
    public static void main(String[] args) {

        Task task1 = new Task("Java Collections", "Write List", "Ann", Priority.LOW, Status.ASSIGNED);
        Task task2 = new Task("Java Collections", "Write Set", "Bob", Priority.LOW, Status.ASSIGNED);
        Task task3 = new Task("Java Collections", "Write LinkedList", "Carol", Priority.LOW, Status.ASSIGNED);
        Task task4 = new Task("Java Collections", "Write Map", "Bob", Priority.LOW, Status.ASSIGNED);
        Task task5 = new Task("Java Collections", "Write ArrayList", "Ann", Priority.LOW, Status.ASSIGNED);

        Set<Task> annsTask = new LinkedHashSet<>();
        annsTask.add(task1);
        annsTask.add(task5);

        Set<Task> bobTask = new LinkedHashSet<>();
        bobTask.add(task2);
        bobTask.add(task4);

        Set<Task> carolTask = new LinkedHashSet<>();
        carolTask.add(task3);

        TaskData taskData = new TaskData(annsTask, bobTask, carolTask);
        List<Set<Task>> tasks = new ArrayList<>();
        tasks.add(annsTask);
        tasks.add(bobTask);
        tasks.add(carolTask);
        System.out.println(taskData.getUnion(tasks));



    }
}
