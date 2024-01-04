package com.test.textBoard;

import com.test.textBoard.article.Article;
import com.test.textBoard.article.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class TextBoardApplicationTests {

	@Autowired
	ArticleRepository articleRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void create() {
		Article article = new Article();
		article.setTitle("테스트 제목1");
		article.setContent("테스트 내용1");
		article.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(article);


		Article article2 = new Article();
		article2.setTitle("테스트 제목2");
		article2.setContent("테스트 내용2");
		article2.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(article2);
	}

}
