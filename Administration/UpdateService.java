package com.example.administration_saklaenhaamim_2221380;

public class UpdateService {
    public String name;
    public String type;
    public String avalability;
    public int price;

    public UpdateService(String name, String type, String avalability, int price) {
        this.name = name;
        this.type = type;
        this.avalability = avalability;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAvalability() {
        return avalability;
    }

    public void setAvalability(String avalability) {
        this.avalability = avalability;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "UpdateService{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", avalability='" + avalability + '\'' +
                ", price=" + price +
                '}';
    }
}
