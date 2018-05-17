package com.thangcao.demo.common.models;


public class Recipe {
    private Long Id;
    private String Name;
    private String TotalTime;
    private String Level;
    private int TotalView;
    private int TotalReviews;
    private Double AvgRating;
    private String Img;
    private String Category;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTotalTime() {
        return TotalTime;
    }

    public void setTotalTime(String totalTime) {
        TotalTime = totalTime;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public int getTotalView() {
        return TotalView;
    }

    public void setTotalView(int totalView) {
        TotalView = totalView;
    }

    public int getTotalReviews() {
        return TotalReviews;
    }

    public void setTotalReviews(int totalReviews) {
        TotalReviews = totalReviews;
    }

    public Double getAvgRating() {
        return AvgRating;
    }

    public void setAvgRating(Double avgRating) {
        AvgRating = avgRating;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    //       "Id": 27698,
//               "Name": "Chè con ong dẻo cay",
//               "TotalTime": 45,
//               "Level": "Dễ",
//               "TotalView": 244,
//               "TotalReviews": 0,
//               "AvgRating": 0,
//               "Img": "https://media.cooky.vn/recipe/g3/27698/s320x320/recipe-cover-r27698.jpg",
//               "Category": "Chay"
}
