package com.company.Anything;

import java.util.Date;

public class Payment {
    public String typePay;
    public String cardNumber;
    public Date expDate;
    public String CVV;
    public String cardUser;

    public Payment( String cardNumber, Date expDate, String CVV, String cardUser) {
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.CVV = CVV;
        this.cardUser = cardUser;
    }

    public String getTypePay() {
        return typePay;
    }

    public void setTypePay(String typePay) {
        this.typePay = typePay;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public String getCardUser() {
        return cardUser;
    }

    public void setCardUser(String cardUser) {
        this.cardUser = cardUser;
    }
}
