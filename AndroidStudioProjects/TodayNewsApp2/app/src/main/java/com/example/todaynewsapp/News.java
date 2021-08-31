package com.example.todaynewsapp;

public class News {
    private String title;
    private String content;
    private int aIcon;
    private int aIcon2;
    private int aIcon3;

    public News(String title,String content,int aIcon,int aIcon2,int aIcon3)
    {
        this.title = title;
        this.content = content;
        this.aIcon = aIcon;
        this.aIcon2 = aIcon2;
        this.aIcon3 = aIcon3;
    }

    public News(String title,String content,int aIcon,int aIcon2)
    {
        this.title = title;
        this.content = content;
        this.aIcon = aIcon;
        this.aIcon2 = aIcon2;
    }

    public News(String title,String content,int aIcon)
    {
        this.title = title;
        this.content = content;
        this.aIcon = aIcon;
    }

    public News(String title,String content)
    {
        this.title = title;
        this.content = content;
    }

    public int getaIcon() {
        return aIcon;
    }


    public void setaIcon(int aIcon) {
        this.aIcon = aIcon;
    }

    public String getContent() {
        return content;
    }

    public int getaIcon2() {
        return aIcon2;
    }

    public void setaIcon2(int aIcon2) {
        this.aIcon2 = aIcon2;
    }

    public int getaIcon3() {
        return aIcon3;
    }

    public void setaIcon3(int aIcon3) {
        this.aIcon3 = aIcon3;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
