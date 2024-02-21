package com.example.shadowfighthandbook.model;

public class Equips {

    int id, category;
    String img, title, faction, chapter, color, text;

    public Equips(int id, String img, String title, String faction, String chapter, String color, String text, int category) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.faction = faction;
        this.chapter = chapter;
        this.color = color;
        this.text = text;
        this.category = category;

    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
