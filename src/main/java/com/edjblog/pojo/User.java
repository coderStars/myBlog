package com.edjblog.pojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户实体")
public class User {
    @ApiModelProperty("用户ID")
    private Integer id;
    @ApiModelProperty("用户姓名")
    private String name;
}
