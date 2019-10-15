package org.spring.learning.controller;

import org.spring.learning.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class HomeController {

    @Autowired
    HomeService homeService;

    @RequestMapping("/home")
    public ResponseEntity<Object> home() {

        return new ResponseEntity(homeService.homeServiceMethod()
                , HttpStatus.OK);

    }
}
