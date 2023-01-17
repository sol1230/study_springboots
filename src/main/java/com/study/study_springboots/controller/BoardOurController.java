package com.study.study_springboots.controller;

import com.study.study_springboots.beans.BoardBean;
import com.study.study_springboots.service.DataInfors;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
  @Autowired
  DataInfors dataInfors;

  @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET) // "/board_our"
  public ModelAndView list() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("firstString", "firstValue");
    // DataInfors dataInfors = new DataInfors();
    ArrayList<BoardBean> boardList = dataInfors.getDataListWithBoardBean();
    modelAndView.addObject("boardList", boardList);

    modelAndView.setViewName("/board_our/list");
    return modelAndView; // -> Dispatcher Servlet
  }

  // localhost:8080/view/U02, localhost:8080/view/U04
  // @RequestMapping(value = "/view", method = RequestMethod.GET) // "/board_our/view"
  @RequestMapping(value = "/view/{action_uid}", method = RequestMethod.GET) // "/board_our/view"
  public ModelAndView view(
    @PathVariable String action_uid,
    ModelAndView modelAndView
  ) {
    // DataInfors dataInfors = new DataInfors();
    BoardBean boardBean = dataInfors.getDataWithMemberBean();
    // modelAndView.addObject("boardBean", boardBean);
    modelAndView.setViewName("/board_our/view");
    return modelAndView;
  }

  @RequestMapping(value = "/form", method = RequestMethod.GET) // "/board_our/form"
  public ModelAndView form(ModelAndView modelAndView) {
    // DataInfors dataInfors = new DataInfors();
    BoardBean boardBean = dataInfors.getDataWithMemberBean();
    modelAndView.addObject("boardBean", boardBean);
    modelAndView.setViewName("/board_our/form");
    return modelAndView;
  }

  @RequestMapping(value = "/save", method = RequestMethod.POST) // "/board_our/save"
  // public ModelAndView save( @RequestParam HashMap<String, String> params, ModelAndView modelAndView)
  public ModelAndView save(BoardBean boardBean, ModelAndView modelAndView) {
    // insert business
    modelAndView.setViewName("/board_our/list");
    return modelAndView;
  }

  @RequestMapping(value = "/edit", method = RequestMethod.POST) // "/board_our/edit"
  public ModelAndView edit(ModelAndView modelAndView) {
    // DataInfors dataInfors = new DataInfors();
    BoardBean boardBean = dataInfors.getDataWithMemberBean();
    modelAndView.addObject("boardBean", boardBean);
    modelAndView.setViewName("/board_our/edit");
    return modelAndView;
  }
}
