package com.doth.newsfeed.repository;

import com.doth.newsfeed.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsfeedRepository extends JpaRepository<News, Long> {
}
