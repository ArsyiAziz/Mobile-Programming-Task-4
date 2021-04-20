package com.arsyiaziz.task4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ComputerModel {
    private String name;
    private String summary;
    private LocalDate releaseDate;
    private int photo;
    private double introductoryPrice;
    private String developer;

    public String getIntroductoryPrice() {
        return String.format("US$%,.2f", introductoryPrice);
    }

    public void setIntroductoryPrice(double introductoryPrice) {
        this.introductoryPrice = introductoryPrice;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getReleaseDate() {
        return releaseDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
