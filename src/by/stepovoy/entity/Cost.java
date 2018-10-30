package by.stepovoy.entity;

public class Cost {
    private String currency;
    private Double value;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nvalue : " + getValue());
        stringBuilder.append("\ncurrency : " + getCurrency());
        return stringBuilder.toString();
    }
//    @Override
//    public String toString() {
//        return "Cost{" +
//                "currency='" + currency + '\'' +
//                ", value=" + value +
//                '}';
//    }
}
