package com.example.dehvi.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Student {
    @SerializedName("dob")
    @Expose
    private String dob;
    @SerializedName("joinDate")
    @Expose
    private String joinDate;
    @SerializedName("earlyBirthAmount")
    @Expose
    private Integer earlyBirthAmount;
    @SerializedName("sponsorId")
    @Expose
    private Integer sponsorId;
    @SerializedName("classRoomId")
    @Expose
    private Integer classRoomId;
    @SerializedName("classRoom")
    @Expose
    private ClassRoom classRoom;
    @SerializedName("form")
    @Expose
    private Form form;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("dni")
    @Expose
    private Integer dni;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("locationId")
    @Expose
    private Integer locationId;
    @SerializedName("status")
    @Expose
    private String status;

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public Integer getEarlyBirthAmount() {
        return earlyBirthAmount;
    }

    public void setEarlyBirthAmount(Integer earlyBirthAmount) {
        this.earlyBirthAmount = earlyBirthAmount;
    }

    public Integer getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(Integer sponsorId) {
        this.sponsorId = sponsorId;
    }

    public Integer getClassRoomId() {
        return classRoomId;
    }

    public void setClassRoomId(Integer classRoomId) {
        this.classRoomId = classRoomId;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
