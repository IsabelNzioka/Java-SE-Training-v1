package com.systechafrica.part3.collections;

public class Student {
    private String name;
    private Integer id;
    private String regNo;
    private String email;


    public Student(String name, Integer id, String regNo, String email) {
        this.name = name;
        this.id = id;
        this.regNo = regNo;
        this.email = email;
    }

    public Student(String name, String regNo, String email) {
        this.name = name;

        this.regNo = regNo;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" + "id" + id + "name" + name + '\'' +
                ", name=" + name + '\'' +
                ", email=" + email + '\'' + "}";
    }


//?    The root interface in the collection hierarchy. 
//?   A collection represents a group of objects, known as its elements. Some collections allow duplicate elements and others do not. 
//?    Some are ordered and others unordered.
}
