package com.example.springshiro.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("account")
public class Account {
    private Integer id;
    private String username;
    private String password;
    private String perms;
    private String role;

}
