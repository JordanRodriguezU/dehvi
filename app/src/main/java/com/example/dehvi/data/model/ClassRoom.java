package com.example.dehvi.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClassRoom {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("classYear")
    @Expose
    private Integer classYear;
    @SerializedName("section")
    @Expose
    private String section;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("gradeId")
    @Expose
    private Integer gradeId;
    @SerializedName("teacherId")
    @Expose
    private Integer teacherId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassYear() {
        return classYear;
    }

    public void setClassYear(Integer classYear) {
        this.classYear = classYear;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}
