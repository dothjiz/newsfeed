package com.doth.newsfeed.resources;

import com.doth.newsfeed.model.News;
import com.doth.newsfeed.repository.NewsfeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class NewsfeedService {

    @Autowired
    NewsfeedRepository newsfeedRepo;

//    private List<News> newsList = new ArrayList<News>(Arrays.asList(
//            new News(1, "Headline 1", "Content 1", "Author 1"),
//            new News(2, "Headline 2", "Content 2", "Author 2"),
//            new News(3, "Headline 3", "Content 3", "Author 3")
//
//    ));

    public List<News> getAllNews(){
        return newsfeedRepo.findAll();
    }

    public Optional<News> getNewsfeed(Long id){
        return newsfeedRepo.findById(id);//.getOne(id);
        //return this.newsList.stream().filter(news ->news.getNewsId() == Integer.parseInt(id)).findFirst().get();
    }

    public void saveNewsfeed(News news){
        newsfeedRepo.save(news);
    }

    public ResponseEntity<News> updateNewsfeed(News news, Long index){

        News newsToUpdate = newsfeedRepo.getOne(index);//newsfeedRepo.c
        if(newsToUpdate == null){
            return ResponseEntity.notFound().build();
        }
        newsToUpdate.setNewsAuthor(news.getNewsAuthor());
        newsToUpdate.setNewsContent(news.getNewsContent());
        newsToUpdate.setNewsHeadline(news.getNewsHeadline());

        return ResponseEntity.ok().body(newsfeedRepo.save(newsToUpdate));
        /*for(int i=0; i < newsList.size(); i++){
            if(newsList.get(i).getNewsId() == index.intValue()){
                newsList.set(i, news);
            }
        }*/
    }

    public ResponseEntity<News> deleteNewsfeed(Long id){
        News newsToDelete = newsfeedRepo.getOne(id);
        if(newsToDelete == null){
            return ResponseEntity.notFound().build();
        }
        newsfeedRepo.deleteById(id);
        return ResponseEntity.ok().build();
        //newsList.removeIf(news -> news.getNewsId() == id);
    }

}
