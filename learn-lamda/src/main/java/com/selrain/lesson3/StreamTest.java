package com.selrain.lesson3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author serlain
 * @Date 2018/7/9 下午11:32
 */
public class StreamTest {

    public static List<Property> propertyList=new ArrayList<>();

    static {
        propertyList.add(new Property("KFC",5000,500,50));
        propertyList.add(new Property("StarBucks",500,35,35));
        propertyList.add(new Property("shuijiao",50,15,10));
    }
    @Test
    public void getMinDsitanceByLamda(){
        Collections.sort(propertyList,Comparator.comparingInt(Property::getDistance));
        System.out.println(propertyList.get(0).getName());
    }

    @Test
    public void getMinDsitanceByStream(){
        String name=propertyList.stream().sorted(Comparator.comparingInt(Property::getDistance)).findFirst()
                .get().name;
        System.out.println(name);
    }

    /**
     * 销量最高的前2位 名称
     */
    @Test
    public void getMostSales(){
        List<Property> properties=propertyList.stream().filter(p->p.sales>50).limit(2).collect(Collectors.toList());
        properties.forEach(p-> System.out.println(p.getName()));
    }
    @Test
    public void getNames(){
        List<Integer> distances=propertyList.stream().map(p->p.getDistance()).collect(Collectors.toList());
        distances.forEach(System.out::println);
    }


}
