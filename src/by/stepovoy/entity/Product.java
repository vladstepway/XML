package by.stepovoy.entity;

public class Product {
    private Integer id;
    private String type;
    private String company;
    private String country;
    private String purpose;
    private Cost cost = new Cost();

    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String[] toStringArray (){
        return new String[] {String.valueOf(getId()),
                getPurpose(),
                getCompany(),
                getType(),
                getCountry(),
                getCost().getCurrency(),
                String.valueOf(getCost().getValue())};
    }

    @Override
            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("\nid : " + getId());
                stringBuilder.append("\ntype : " + getType());
                stringBuilder.append("\ncompany : " + getCompany());
                stringBuilder.append("\npurpose : " + getPurpose());
                stringBuilder.append(getCost());

                return stringBuilder.toString();
            }
//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", type='" + type + '\'' +
//                ", company='" + company + '\'' +
//                ", country='" + country + '\'' +
//                ", purpose='" + purpose + '\'' +
//                ", cost=" + cost.toString() +
//                '}';
//    }
}
