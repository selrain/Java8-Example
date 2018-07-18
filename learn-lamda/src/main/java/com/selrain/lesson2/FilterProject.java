package com.selrain.lesson2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @Author serlain
 * @Date 2018/7/8 下午6:58
 */
public class FilterProject {


    public Project filterJavaProject(List<Project> projectList) {
        for (Project project : projectList) {
            if ("Java".equals(project.getName())) {
                return project;
            }
        }
        return null;
    }

    public Project filterJavaProjectByPredicate(List<Project> projectList, Predicate<Project> predicate) {
        for (Project project : projectList) {
            if (predicate.test(project)) {
                return project;
            }
        }
        return null;
    }
    
    public List<Project> addStar(List<Project> projectList,Function<Project,Project> function){
        List<Project> newProjects=new ArrayList<>();
        for (Project project:projectList){
            newProjects.add(function.apply(project));
        }
        return newProjects;
    }

    public static void main(String[] args) {
        List<Project> projectList = new ArrayList<>();
        projectList.add(new Project("Java", 1000));
        projectList.add(new Project("php", 500));
        projectList.add(new Project("python", 50));

        FilterProject filterProject = new FilterProject();

        Project project = filterProject.filterJavaProject(projectList);
        System.out.println(project);
        // 2. 行为参数化：简洁、灵活
        Project project1 = filterProject.filterJavaProjectByPredicate(projectList, p -> p.getName().equals("Java"));
        System.out.println(project1);

        //方法引用
        projectList.sort(Comparator.comparing(Project::getName));


        List<Project> newProjects=filterProject.addStar(projectList,(p1)->new Project(p1.getName(),p1.getStar()+1));
        //消费型接口
        newProjects.forEach(System.out::println);
    }
}
