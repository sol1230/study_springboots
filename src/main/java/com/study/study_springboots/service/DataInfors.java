package com.study.study_springboots.service;

import com.study.study_springboots.beans.BoardBean;
import java.util.ArrayList;
import java.util.HashMap;

public class DataInfors {

  public HashMap<String, String> getSearchFormData() {
    HashMap<String, String> searchForm = new HashMap<String, String>();
    searchForm.put("search_key", "Search Title");
    searchForm.put("name", "은솔!");
    searchForm.put("id", "ID0001");
    return searchForm;
  }

  public ArrayList<String> getTablesListWithString() {
    ArrayList<String> tablesListWithString = new ArrayList<String>();
    tablesListWithString.add("@mdo");
    tablesListWithString.add("@fat");
    tablesListWithString.add("@twitter");
    return tablesListWithString;
  }

  public HashMap<String, Object> getBundlesData() {
    DataInfors DataInfors = new DataInfors();
    HashMap<String, String> searchForm = DataInfors.getSearchFormData();
    ArrayList<String> tablesListWithString = DataInfors.getTablesListWithString();

    HashMap<String, Object> bundlesData = new HashMap<>();
    bundlesData.put("searchForm", searchForm);
    bundlesData.put("tablesListWithString", tablesListWithString);

    bundlesData.put("dataWithMamberBean", DataInfors.getDataWithMamberBean());
    bundlesData.put(
      "dataListWithBoardBean",
      DataInfors.getDataListWithBoardBean()
    );

    return bundlesData;
  }

  public BoardBean getDataWithMamberBean() {
    BoardBean boardBean = new BoardBean();
    boardBean.setTitle("Mark");
    boardBean.setContent("Otto");
    boardBean.setUserName("@mdo");

    return boardBean;
  }

  public ArrayList<BoardBean> getDataListWithBoardBean() {
    ArrayList<BoardBean> membersList = new ArrayList<>();
    BoardBean boardBean = new BoardBean();
    boardBean.setTitle("Mark");
    boardBean.setContent("Otto");
    boardBean.setUserName("@mdo");
    membersList.add(boardBean);

    BoardBean boardBean02 = new BoardBean();
    boardBean02.setTitle("Jacob");
    boardBean02.setContent("Thornton");
    boardBean02.setUserName("@fat");
    membersList.add(boardBean02);

    BoardBean boardBean03 = new BoardBean();
    boardBean03.setTitle("Larry");
    boardBean03.setContent("Bird");
    boardBean03.setUserName("@twitter");
    membersList.add(boardBean03);
    return membersList;
  }
}
