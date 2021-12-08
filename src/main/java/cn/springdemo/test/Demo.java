package cn.springdemo.test;

import cn.springdemo.entity.User;

import java.util.*;

public class Demo {
    private String specialCharacter1; // 特殊字符值1
    private String specialCharacter2; // 特殊字符值2
    private User user; // JavaBean类型
    private List<String> list; // List类型
    private String[] array; // 数组类型
    private Set<String> set; // Set类型
    private Map<String, String> map; // Map类型
    private Properties props; // Properties类型
    private String emptyValue; // 注入空字符串值
    private String nullValue = "初始值"; // 注入null值


    public Demo() {
    }

    public void setSpecialCharacter1(String specialCharacter1) {
        this.specialCharacter1 = specialCharacter1;
    }

    public void setSpecialCharacter2(String specialCharacter2) {
        this.specialCharacter2 = specialCharacter2;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public void setEmptyValue(String emptyValue) {
        this.emptyValue = emptyValue;
    }

    public void setNullValue(String nullValue) {
        this.nullValue = nullValue;
    }

    @Override
    public String toString() {
        return "TestDemo{" +
                "specialCharacter1='" + specialCharacter1 + '\'' +
                ", specialCharacter2='" + specialCharacter2 + '\'' +
                ", user=" + user +
                ", list=" + list +
                ", array=" + Arrays.toString(array) +
                ", set=" + set +
                ", map=" + map +
                ", props=" + props +
                ", emptyValue='" + emptyValue + '\'' +
                ", nullValue='" + nullValue + '\'' +
                '}';
    }
}
