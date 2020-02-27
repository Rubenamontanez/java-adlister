package model;

public class EmployeeBean {
    private long emo_no;
    private  String birht_date;
    private String first_name;
    private String last_name;
    private char gender;
    private String hire_date;

    public EmployeeBean(){

    }

    public long getEmo_no() {
        return emo_no;
    }

    public void setEmo_no(long emo_no) {
        this.emo_no = emo_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getHire_date() {
        return hire_date;
    }

    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }
}
