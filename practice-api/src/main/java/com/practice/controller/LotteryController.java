package com.practice.controller;

import com.cc.leetcode.Lottery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cui.longcan@chinaott.net 2022/8/17
 */
@RestController
@RequestMapping("/api")
public class LotteryController {

    @GetMapping("/lottery")
    public Object lottery(){
        return Lottery.calculate();
    }
}
