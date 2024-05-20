package com.hutech.demo.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class SinhVien {
    @NotBlank(message = "Name is required")
    private String ten;
    @Min(value = 18, message = "Age >= 18")
    @Max(value = 100, message = "Age <= 100")
    private int tuoi;
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Faculty must be words")
    private String khoa;

    // Getters and Setters
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public String getKhoa() {
        return khoa;
    }
    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
}
