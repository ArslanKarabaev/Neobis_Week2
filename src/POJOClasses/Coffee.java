package POJOClasses;

import java.util.Objects;

public class Coffee {
    private int amount;
    private int price;
    private String sort;
    private boolean withMilk;

    public Coffee(int amount, int price, String sort, boolean withMilk) {
        this.amount = amount;
        this.price = price;
        this.sort = sort;
        this.withMilk = withMilk;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public boolean isWithMilk() {
        return withMilk;
    }

    public void setWithMilk(boolean withMilk) {
        this.withMilk = withMilk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return amount == coffee.amount && price == coffee.price && withMilk == coffee.withMilk && sort.equals(coffee.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, price, sort, withMilk);
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "amount=" + amount +
                ", price=" + price +
                ", sort='" + sort + '\'' +
                ", withMilk=" + withMilk +
                '}';
    }
}
