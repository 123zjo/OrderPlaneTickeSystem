package cn.edu.hcnu.dto;

import java.util.Date;
import java.util.Set;

public class Customer {
    private String id;
    private String customerType; //旅客类型：成人、儿童、婴儿
    private String name;
    private String cardId;  //身份证号码
    private String phone;
    private Date birthDate;  //出生日期
    private Set<Order> orders;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
