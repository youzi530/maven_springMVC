package com.domain;

public class Login {
    //属性
    private Integer id;			//用户ID
    private String name;		//用户名
    private String password;	//密码
    private Integer phone;

    //属性 id 的 get/set 方法
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    //属性 name 的 get/set 方法
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    //属性 password 的 get/set 方法
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                '}';
    }
}
