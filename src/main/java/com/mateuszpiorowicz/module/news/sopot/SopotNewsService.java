package com.mateuszpiorowicz.module.news.sopot;


import com.mateuszpiorowicz.module.news.NewsService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SopotNewsService implements NewsService {


    @Override
    public List<String> getLastNews() {
        return List.of(
                "1 - News from Sopot..."

        );
    }
}
