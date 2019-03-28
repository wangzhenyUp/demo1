package com.gradleexample.demo.entity;

/**
 * @author 王振宇
 * @date 19/3/19
 */
public class Employees {
    private int id;
    private String name;
    private String sex;
    private String workno;

    public Employees() {
    }

    public Employees(String name, String sex, String workno) {
        this.name = name;
        this.sex = sex;
        this.workno = workno;
    }

    public Employees(int id, String name, String sex, String wokeno) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.workno = wokeno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWokeno() {
        return workno;
    }

    public void setWokeno(String wokeno) {
        this.workno = wokeno;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", workno='" + workno + '\'' +
                '}';
    }
}
