package com.selrain.lesson2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author serlain
 * @Date 2018/7/8 下午6:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project implements Serializable {

    private String name;

    private Integer star;
}
