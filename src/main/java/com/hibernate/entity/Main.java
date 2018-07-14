package com.hibernate.entity;

import com.hibernate.validation.ValidationUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setId("111");
        person.setName("张三");
        person.setSex("女");


        Address address = new Address();
        address.setCity("南京");
        address.setProvince("江苏");
        address.setStreet("建邺区");

        person.setAddress(address);


        List<Address> addresses = new ArrayList<>();
        addresses.add(address);

        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setPhone("13056325894");
        List<String> emails = new ArrayList<>();
        emails.add("11@qq.com");
        emails.add("12@qq.com");
        contactInfo.setEmails(emails);

        contactInfo.setAddresses(addresses);
        person.setContactInfo(contactInfo);

        ValidationUtil.validator(person);


        PlaceName placeName = new PlaceName();
        placeName.setChName("                                            ");
        placeName.setEnName("   11 ");
        placeName.setPassword("1111");
        placeName.setPasswordVerify("1111");
        ValidationUtil.validator(placeName);
    }


}
