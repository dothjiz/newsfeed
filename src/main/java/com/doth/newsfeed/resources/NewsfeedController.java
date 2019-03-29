package com.doth.newsfeed.resources;

import com.doth.newsfeed.model.News;
import com.doth.newsfeed.model.NewsfeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsfeedController {

    @Autowired
    NewsfeedService newsfeed;

    @RequestMapping("/newsfeed")
    public List<News> getAllNewsfeed(){
        return newsfeed.getAllNews();
    }

}
