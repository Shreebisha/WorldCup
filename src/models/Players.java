package models;

public class Players {
    String Name;
    int Id;
    int Age;
    int Rating;

    public Players(String name, int id, int age, int rating) {
        Name = name;
        Id = id;
        Age = age;
        Rating = rating;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return Id;
    }

    public int getAge() {
        return Age;
    }

    public int getRating() {
        return Rating;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setRating(int rating) {
        Rating = rating;
    }
}