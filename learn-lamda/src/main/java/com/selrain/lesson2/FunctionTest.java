package com.selrain.lesson2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionTest {
    static List<Project> projectList = new ArrayList<>();

    static {
        projectList.add(new Project("Java", 1000));
        projectList.add(new Project("php", 500));
        projectList.add(new Project("python", 50));
    }

    @Test
    public void FunctionInterfaceDemoTest() {
        //自定义函数式接口
        FunctionInterfaceDemo<Integer> demo = (x) -> x > 20;
        System.out.println(demo.test(21));
    }

    @Test
    public void ConsumerTest() {
        //消费型接口
        projectList.forEach(System.out::println);
        Consumer consumer = (x) -> System.out.println("my age :" + x);
        consumer.accept(220);
    }

    @Test
    public void SupplierTest() {
        Supplier supplier = () -> Math.random();
        System.out.println(supplier.get());
    }

    @Test
    public void FunctionTest() {
        Function<String, Integer> function = (x) -> Integer.parseInt(x);
        System.out.println(function.apply("12"));

        Function<Project, String> projectStringFunction = (p) -> p.getName();
        projectList.stream().map(projectStringFunction).forEach(System.out::println);
    }

    @Test
    public void PredicateTest() {
        FilterProject filterProject = new FilterProject();
        Project project = filterProject.filterJavaProject(projectList);
        System.out.println(project);
        // 2. 行为参数化：简洁、灵活
        Project project1 = filterProject.filterJavaProjectByPredicate(projectList, p -> p.getName().equals("Java"));
        System.out.println(project1);
    }

    @Test
    public void MethodReferences() {
        //静态方法:
        projectList.stream().forEach(System.out::println);

        //实例方法
        projectList.stream().forEach(Project::getName);

        //构造函数
        Supplier<Project> supplier = Project::new;
        projectList.add(supplier.get());
    }

    /**
     * 支持在接口中声明方法同时提供实现。
     */
    @Test
    public void defaultMathod() {
        projectList.sort(Comparator.comparing(Project::getStar));
        projectList.forEach(System.out::println);
    }

}
