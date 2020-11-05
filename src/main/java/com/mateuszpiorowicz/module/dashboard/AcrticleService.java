package com.mateuszpiorowicz.module.dashboard;

import com.mateuszpiorowicz.module.dashboard.dto.ArticleDto;
import com.mateuszpiorowicz.module.dashboard.dto.CommentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcrticleService {
    public ArticleDto getArticle() {
        return new ArticleDto()
                .setTitle("AWS Certified Cloud Practitioner (CLF-C01)")
                .setText("lorem ipsum ...")
                .setComments(
                        List.of(
                                new CommentDto("admin", "text 1"),
                                new CommentDto("admin", "text 2"),
                                new CommentDto("admin", "text 3")
                        )
                );
    }
}
