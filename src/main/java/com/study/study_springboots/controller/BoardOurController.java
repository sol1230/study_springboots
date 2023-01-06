package com.study.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// use Bootstrap
// title, content, userName, date
// CRUD
// + list.jsp(/board) -> view.jsp(/board/view) -> list.jsp(/board/list)
// + list.jsp(/board) -> form.jsp(/board/form) -> form.jsp(/board/form)
// + view.jsp(/board/view) -> edit.jsp(/board/eidt) -> list.jsp(/board/list)

@Controller
@RequestMapping(value = "/board_our")
public class BoardOurController {

  @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET) // "/board_our"
  public String list() {
    return "/board_our/list";
  }

  @RequestMapping(value = "/view", method = RequestMethod.GET) // "/board/view"
  public String view() {
    return "/board_our/view";
  }

  @RequestMapping(value = "/form", method = RequestMethod.GET) // "/board/form"
  public String form() {
    return "/board_our/form";
  }

  @RequestMapping(value = "/form", method = RequestMethod.POST)
  public String save() {
    // insert business
    return "/board_our/list";
  }
}
