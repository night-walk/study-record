package com.example.demo;

/**
 * @Author: zhoujing
 * @Date: 2025/2/10 15:47
 * @Description:
 */
public class Employee {

    private String uId;   // ID
    private String name;  // 姓名
    private String desc;  // 备注

    public Employee(String uId, String name, String desc) {
        this.uId = uId;
        this.name = name;
        this.desc = desc;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
