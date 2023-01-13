package com.study.study_springboots.controller;

import com.study.study_springboots.beans.BoardBean;
import com.study.study_springboots.service.DataInfors;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/board")
public class BoardController {

  @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
  public ModelAndView list() {
    ModelAndView modelAndView = new ModelAndView();
    DataInfors dataInfors = new DataInfors();
    ArrayList<BoardBean> boardList = dataInfors.getDataListWithBoardBean();
    modelAndView.addObject("boardList", boardList);
    modelAndView.setViewName("/board/list");
    return modelAndView;
  }

  @RequestMapping(value = "/form", method = RequestMethod.GET)
  public ModelAndView form(ModelAndView modelAndView) {
    modelAndView.setViewName("/board/form");
    return modelAndView;
  }

  @RequestMapping(value = "/view", method = RequestMethod.GET)
  public ModelAndView view(
    @RequestParam String title,
    ModelAndView modelAndView
  ) {
    // insert business
    DataInfors dataInfors = new DataInfors();
    BoardBean boardBean = dataInfors.getDataList(title);
    modelAndView.addObject("boardBean", boardBean);
    modelAndView.setViewName("/board/view");
    return modelAndView;
  }

  @RequestMapping(value = "/edit", method = RequestMethod.POST)
  public ModelAndView edit(ModelAndView modelAndView) {
    // insert business
    modelAndView.setViewName("/board/edit");
    return modelAndView;
  }

  @RequestMapping(value = "/save", method = RequestMethod.POST)
  public ModelAndView save(ModelAndView modelAndView) {
    modelAndView.setViewName("/board/list");
    return modelAndView;
  }
}
