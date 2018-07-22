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
/*




        //方法引用
        projectList.sort(Comparator.comparing(Project::getName));


*/

    }
}
