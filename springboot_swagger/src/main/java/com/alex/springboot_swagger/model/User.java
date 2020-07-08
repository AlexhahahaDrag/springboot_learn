package com.alex.springboot_swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Description: user类
 * Author:      alex
 * CreateDate:  2020/7/8 16:31
 * Version:     1.0
 *
*/
@ApiModel(value = "user", description = "user类")
public class User {

    @ApiModelProperty(value = "id", name = "id", example = "1")
    private Long id;

    @ApiModelProperty(value = "姓名", name = "name", example = "alex")
    private String name;

    @ApiModelProperty(value = "年龄", name = "age", example = "18")
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
