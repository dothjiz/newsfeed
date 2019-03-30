package com.doth.newsfeed.resources;

import com.doth.newsfeed.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class NewsfeedController {

    @Autowired
    NewsfeedService newsfeed;

    @RequestMapping(value = "/newsfeed")
    public List<News> getAllNewsfeedList(){
        return newsfeed.getAllNews();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/newsfeed/{id}")
    public Optional<News> getNewsfeed(@PathVariable(value="id") Long id){
        return newsfeed.getNewsfeed(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/newsfeed")
    public void saveNewsfeed(@Valid @RequestBody News news){
        newsfeed.saveNewsfeed(news);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/newsfeed/{id}")
    public void updateNewsfeed(@RequestBody News news, @PathVariable Long id){
        newsfeed.updateNewsfeed(news, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/newsfeed/{id}")
    public void deleteNewsfeed(@PathVariable Long id){
        newsfeed.deleteNewsfeed(id);
    }


}
