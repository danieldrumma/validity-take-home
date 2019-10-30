package com.validity.models;

public class Record {
    private String full;
    private String first_name;
    private String last_name;
    private String company;
    private String email;
    private String address1;
    private String address2;
    private String zip;
    private String city;
    private String state_long;
    private String state;
    private String phone;
    private String[] fields = {first_name, last_name, company, email, address1, address2,
                                zip, city, state_long, state, phone};

    /**
     * splits given line into array and assigns to corresponding variable
     *
     * todo: handle comma in company name for advanced input - commented out code
     * @param line
     */
    public Record (String line){

        String[] line_sep = line.split(",");
        full = line;
//        ArrayList<String> line_sep2 = new ArrayList<>();
//        Scanner sc = new Scanner(line);
//        sc.useDelimiter(",");
//        while(sc.hasNext()){
//            String curr = sc.next();
//            line_sep2.add(curr);
//            if(curr.contains("\"")){
//                String next_curr = sc.next();
//                curr = curr + ", " +next_curr;
//
//            }
//            System.out.println(curr);
//        }
//        for(int i = 0; i <) fill line_sep correctly
//        for(int i = 1; i < line_sep.length;i++){
//            if(line_sep.length == 12 && (i == 9)) {
//                fields[i - 1] = line_sep[i];
//            } else if( (i != 9 && line_sep[i] != null)){
//                fields[i - 1] = line_sep[i];
//            }
//        }

        first_name = line_sep[1];
        last_name = line_sep[2];
        company = line_sep[3];
        email = line_sep[4];
        address1 = line_sep[5];
        address2 = line_sep[6];
        zip = line_sep[7];
        city = line_sep[8];
        state_long = line_sep[9];
        state = line_sep[10];
        phone = line_sep[11];

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

    public String getState_long() {
        return state_long;
    }

    public String[] getFields() {
        return fields;
    }

    @Override
    public String toString() {
        if(state_long != null){
            return  first_name + " " + last_name + " " + company + " " + email + " " + address1 + " " + address2 + " "
                    + zip + " " + city + " " + state_long + " " + state + " " + phone;
        } else {
            return first_name + " " + last_name + " " + company + " " + email + " " + address1 + " " + address2 + " "
                    + zip + " " + city + " " + state + " " + phone;
        }
    }


}
