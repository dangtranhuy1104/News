package com.tranhuy.news.api;

import com.tranhuy.news.dto.NewDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewAPI {
    @PostMapping("/new")
    public NewDTO createNew(@RequestBody NewDTO model){
        return model;
    }
}
