package com.doth.newsfeed.model;

public class News {
    private int newsId;
    private String newsHeadline;
    private String newsContent;
    private String newsAuthor;

    public News(int newsId, String newsHeadline, String newsContent, String newsAuthor) {
        this.newsId = newsId;
        this.newsHeadline = newsHeadline;
        this.newsContent = newsContent;
        this.newsAuthor = newsAuthor;
    }

    public News() {}

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getNewsHeadline() {
        return newsHeadline;
    }

    public void setNewsHeadline(String newsHeadline) {
        this.newsHeadline = newsHeadline;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsAuthor() {
        return newsAuthor;
    }

    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor;
    }
}
