package com.company;

public class Book{
    private int broiStranici;
    private String title;
    private String coverColor;
    private Author author;
    public Book(){
        broiStranici=1;
        coverColor="bqlo";
        author=new Author();
        title="bezzaaglavie";
    }
    public Book(int broiStranici, String title, String coverColor, Author author){
        this.broiStranici=broiStranici;
        this.coverColor=coverColor;
        this.author=author;
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title=title;
    }

    public String getCoverColor() {
        return coverColor;
    }
    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public int getBroiStranici() {
        return broiStranici;
    }
    public void setBroiStranici(int broiStranici) {
        this.broiStranici = broiStranici;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

}