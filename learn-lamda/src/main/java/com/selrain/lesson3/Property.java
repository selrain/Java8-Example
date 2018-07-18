package com.selrain.lesson3;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * @Author serlain
 * @Date 2018/7/9 下午10:19
 */
@Data
@AllArgsConstructor
public class Property {
    String name;
    // 距离，单位:米
    Integer distance;
    // 销量，月售
    Integer sales;
    // 价格，这里简单起见就写一个级别代表价格段
    Integer priceLevel;
}
