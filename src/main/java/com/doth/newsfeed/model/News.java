package com.doth.newsfeed.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="News")
@EntityListeners(AuditingEntityListener.class)
public class News {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long newsId;

    @NotBlank
    @Column(name = "news_headline")
    private String newsHeadline;

    @NotBlank
    @Column(name = "news_content")
    private String newsContent;

    @NotBlank
    @Column(name = "author")
    private String newsAuthor;

    public News(Long newsId, String newsHeadline, String newsContent, String newsAuthor) {
        this.newsId = newsId;
        this.newsHeadline = newsHeadline;
        this.newsContent = newsContent;
        this.newsAuthor = newsAuthor;
    }

    public News(String newsHeadline, String newsContent, String newsAuthor) {
        this.newsHeadline = newsHeadline;
        this.newsContent = newsContent;
        this.newsAuthor = newsAuthor;
    }

    public News() {}

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
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
