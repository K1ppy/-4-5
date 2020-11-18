package com.bsu;

import java.util.Objects;
import java.time.LocalDate;

public class Company {
    private String name;
    private String shortName;
    private LocalDate actualizationDate;
    private String address;
    private LocalDate foundationDate;
    private int numberOfMembers;
    private String auditor;
    private String phoneNumber;
    private String email;
    private String industry;
    private String typeOfActivity;
    private String webAddress;

    public Company(String name1, String shName, LocalDate actual, String addr, LocalDate foundData, int numb, String aud, String phoneNumb,
                   String em, String indus, String type, String web) {
        this.name = name1;
        this.shortName = shName;
        this.actualizationDate = actual;
        this.address = addr;
        this.foundationDate = foundData;
        this.numberOfMembers = numb;
        this.auditor = aud;
        this.phoneNumber = phoneNumb;
        this.email = em;
        this.industry = indus;
        this.typeOfActivity = type;
        this.webAddress = web;
    }

    @Override
    public String toString() {
        return name + ";" + shortName + ";" + actualizationDate.toString() + ";" + address + ";" + foundationDate.toString() + ";" + numberOfMembers + ";" + auditor +
                ";" + phoneNumber + ";" + ";" + email + ";" + industry + ";" + typeOfActivity + ";" + webAddress;
    }

    @Override
    public boolean equals(Object item) {
        if (this == item) return true;
        if (item == null || getClass() != item.getClass()) return false;
        Company some = (Company) item;
        return Objects.equals(name, some.name) && Objects.equals(shortName, some.shortName) &&
                Objects.equals(actualizationDate, some.actualizationDate) && Objects.equals(address, some.address) &&
                Objects.equals(foundationDate, some.foundationDate) && (numberOfMembers == some.numberOfMembers) &&
                Objects.equals(auditor, some.auditor) && Objects.equals(phoneNumber, some.phoneNumber) &&
                Objects.equals(email, some.email) && Objects.equals(industry, some.industry) &&
                Objects.equals(typeOfActivity, some.typeOfActivity) &&
                Objects.equals(webAddress, some.webAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shortName, actualizationDate, address, foundationDate, numberOfMembers, auditor,
                phoneNumber, email, industry, typeOfActivity, webAddress);
    }

    public String getShortName() {
        return shortName.toLowerCase();
    }

    public String getIndustry() {
        return industry.toLowerCase();
    }

    public String getActivityType() {
        return typeOfActivity.toLowerCase();
    }

    public int getNumberOfEmployee() {
        return numberOfMembers;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }
}
