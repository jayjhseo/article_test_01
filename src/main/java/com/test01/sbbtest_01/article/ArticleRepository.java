package com.test01.sbbtest_01.article;

import com.test01.sbbtest_01.article.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
