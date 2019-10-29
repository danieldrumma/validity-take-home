package com.validity.main;

public class Record {
    public String full;
    public String first_name;
    public String last_name;
    public String company;
    public String email;
    public String address1;
    public String address2;
    public String zip;
    public String city;
    public String state;
    public String phone;

    public Record (String line){
        String[] line_sep = line.split(",");
        full = line;
        first_name = line_sep[1];
        last_name = line_sep[2];
        company = line_sep[3];
        email = line_sep[4];
        address1 = line_sep[5];
        address2 = line_sep[6];
        zip = line_sep[7];
        city = line_sep[8];
        state = line_sep[9];
        phone = line_sep[10];

    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getCompany() {
        return company;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPhone() {
        return phone;
    }

    public String getFull() {
        return full;
    }

    @Override
    public String toString() {
        return  first_name + " " + last_name + " " + company + " " + email + " " + address1 + " " + address2 + " "
                + zip + " " + city + " " + state + " " + phone;
    }
}
