public class Book {

    private String title;
    private int page;
    private int year;


    public Book(String titles, int pages, int years){

        this.title = titles;
        this.page = pages;
        this.year = years;

    }
/*
    public String toString(){

    }


 */

    public String getTitle(){
        return title;
    }
    public int getPage(){
        return page;
    }
    public int getYear(){
        return year;
    }



}
