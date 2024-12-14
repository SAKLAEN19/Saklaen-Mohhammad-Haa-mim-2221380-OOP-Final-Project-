package com.example.administration_saklaenhaamim_2221380;

public class DeleteService {
    private String mealName;
    private int price;

    public DeleteService(String mealName, int price) {
        this.mealName = mealName;
        this.price = price;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "DeleteService{" +
                "mealName='" + mealName + '\'' +
                ", price=" + price +
                '}';
    }
}
