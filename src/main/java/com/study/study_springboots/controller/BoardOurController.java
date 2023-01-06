package com.study.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// use Bootstrap
// title, content, userName, date
// CRUD
// + list.jsp(/board) -> view.jsp(/board/view) -> list.jsp(/board/list)
// + list.jsp(/board) -> form.jsp(/board/form) -> form.jsp(/board/save)
// + view.jsp(/board/view) -> edit.jsp(/board/edit) -> list.jsp(/board/save)

@Controller
@RequestMapping(value = "/board_our")
public class BoardOurController {

  @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET) // "/board_our"
  public ModelAndView list() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("firstString", "firstValue");
    modelAndView.setViewName("/board_our/list");
    return modelAndView; // -> Dispatcher Servlet
  }

  @RequestMapping(value = "/view", method = RequestMethod.GET) // "/board_our/view"
  public ModelAndView view(ModelAndView modelAndView) {
    modelAndView.setViewName("/board_our/view");
    return modelAndView;
  }

  @RequestMapping(value = "/form", method = RequestMethod.GET) // "/board_our/form"
  public ModelAndView form(ModelAndView modelAndView) {
    modelAndView.setViewName("/board_our/form");
    return modelAndView;
  }

  @RequestMapping(value = "/save", method = RequestMethod.POST) // "/board_our/save"
  public ModelAndView save(ModelAndView modelAndView) {
    // insert business
    modelAndView.setViewName("/board_our/list");
    return modelAndView;
  }

  @RequestMapping(value = "/edit", method = RequestMethod.POST) // "/board_our/edit"
  public ModelAndView edit(ModelAndView modelAndView) {
    modelAndView.setViewName("/board_our/edit");
    return modelAndView;
  }
}
