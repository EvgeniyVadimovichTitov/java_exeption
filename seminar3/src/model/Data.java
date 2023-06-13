package model;

public class Data {
    private String lastname;
    private String name;
    private String surname;
    private String birthDate;
    private String phone;
    private Character gender;

    public Data(String lastname, String name, String surname, String birthDate, String phone, Character gender){
        this.lastname = lastname;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
    }
    public Data(String lastname, String name, String birthDate, String phone, Character gender){
        this(lastname, name, "", birthDate, phone, gender);
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public Character getGender() {
        return gender;
    }

    public String getSurname(){
        return this.surname;
    }
    public String getLastname(){return this.lastname;}
}
