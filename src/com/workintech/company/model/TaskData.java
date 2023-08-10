package com.workintech.company.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task>bobsTasks;
    private Set<Task>carolTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolTasks = carolTasks;
    }

    public Set<Task> getTasks(String taskOwner){
        if(taskOwner.equals("ann")){
            return annsTasks;
        }
        if(taskOwner.equals("bob")){
            return bobsTasks;
        }
        if(taskOwner.equals("carol")){
            return carolTasks;
        }
        if(taskOwner.equals("all")){
            List<Set<Task>> taskList = new ArrayList<>();
            taskList.add(annsTasks);
            taskList.add(bobsTasks);
            taskList.add(carolTasks);
            return getUnion(taskList);
        }

        return new HashSet<>();

    }
    public Set<Task>getUnion(List<Set<Task>> taskList){
        Set<Task> totals = new HashSet<>();
        for(Set<Task>tasks: taskList) {
            System.out.println("Task: " + tasks);
            totals.addAll(tasks);
        }
        return totals;

    }

    public Set<Task>getUnion(Set<Task>...taskList){
        return null;
    }

}
