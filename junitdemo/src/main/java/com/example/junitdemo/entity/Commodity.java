package com.example.junitdemo.entity;

import java.util.Objects;

/**
 * @author  wangzhenyu
 * @date  19/3/26
 */
public class Commodity {
    private int id;
    private String name;
    private String no;
    private double price;

    public Commodity() {
    }

    public Commodity(int id, String name, String no, double price) {
        this.id = id;
        this.name = name;
        this.no = no;
        this.price = price;
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

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", no='" + no + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){ return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Commodity commodity = (Commodity) o;
        return id == commodity.id &&
                Double.compare(commodity.price, price) == 0 &&
                Objects.equals(name, commodity.name) &&
                Objects.equals(no, commodity.no);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, no, price);
    }
}
