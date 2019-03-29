package com.doth.newsfeed.model;

import com.doth.newsfeed.model.News;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class NewsfeedService {

    private List<News> getNews = new ArrayList<News>(Arrays.asList(
            new News(1, "Headline 1", "Content 1", "Author 1"),
            new News(2, "Headline 2", "Content 2", "Author 2"),
            new News(3, "Headline 3", "Content 3", "Author 3")

    ));

    public List<News> getAllNews(){
        return this.getNews;
    }
}
