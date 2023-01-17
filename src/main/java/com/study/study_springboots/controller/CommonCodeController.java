package com.study.study_springboots.controller;

import com.study.study_springboots.dao.CommonCodeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/commonCode")
public class CommonCodeController {
  @Autowired
  CommonCodeDao commonCodeDao;

  @RequestMapping(value = "/list") // http://localhost:8080/commonCode/list
  public ModelAndView list() {
    ModelAndView modelAndView = new ModelAndView();
    Object result = commonCodeDao.getList();
    modelAndView.addObject("result", result);
    modelAndView.setViewName("/commonCode/list");
    return modelAndView;
  }
}
