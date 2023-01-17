package com.study.study_springboots.controller;

import com.study.study_springboots.beans.BoardBean;
import com.study.study_springboots.service.DataInfors;
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/notice")
public class NoticeController {

  @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET) // "/board_our"
  public ModelAndView list() {
    ModelAndView modelAndView = new ModelAndView();
    DataInfors dataInfors = new DataInfors();
    ArrayList<BoardBean> boardList = dataInfors.getDataListWithBoardBean();
    modelAndView.addObject("boardList", boardList);

    modelAndView.setViewName("/notice/list");
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
    modelAndView.setViewName("/notice/view");
    return modelAndView;
  }

  @RequestMapping(value = "/edit/{title}", method = RequestMethod.POST) // "/board_our/edit"
  public ModelAndView edit(
    @PathVariable ModelAndView modelAndView,
    String title
  ) {
    DataInfors dataInfors = new DataInfors();
    BoardBean boardBean = dataInfors.getDataList(title);
    modelAndView.addObject("boardBean", boardBean);
    modelAndView.setViewName("/notice/edit");
    return modelAndView;
  }

  @RequestMapping(value = "/save", method = RequestMethod.POST) // "/board_our/save"
  public ModelAndView save(
    @RequestParam HashMap<String, String> params,
    ModelAndView modelAndView
  ) {
    // insert business
    modelAndView.addObject("params", params);
    modelAndView.setViewName("/notice/list");
    return modelAndView;
  }
}
