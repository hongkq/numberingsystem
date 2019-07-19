package com.kaiqing.numberingsystem.controller;


import com.kaiqing.numberingsystem.common.ResultModel;
import com.kaiqing.numberingsystem.model.FeedbackInfo;

import com.kaiqing.numberingsystem.serveice.feedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class FeedbackDataController {
    @Autowired
    private feedbackService feedService;
    /***
     * 提交反馈信息
     * 小程序-问题反馈-反馈信息
     */
    @RequestMapping(value = "/feedbackData",method = RequestMethod.POST)
    public ResultModel addfeedback(FeedbackInfo feedInfo){
        return feedService.addfeedback(feedInfo);

    }
    /**
     * 测试
     * @return
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello World";
    }
}
