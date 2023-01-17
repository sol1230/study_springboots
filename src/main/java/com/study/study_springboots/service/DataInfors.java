package com.study.study_springboots.service;

import com.study.study_springboots.beans.BoardBean;
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.stereotype.Service;

@Service
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

    bundlesData.put("dataWithMamberBean", DataInfors.getDataWithMemberBean());
    bundlesData.put(
      "dataListWithBoardBean",
      DataInfors.getDataWithMemberBean()
    );

    return bundlesData;
  }

  public BoardBean getDataWithMemberBean() {
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
    boardBean.setDate("2022.12.30");
    membersList.add(boardBean);

    BoardBean boardBean02 = new BoardBean();
    boardBean02.setTitle("Jacob");
    boardBean02.setContent("Thornton");
    boardBean02.setUserName("@fat");
    boardBean02.setDate("2022.12.19");
    membersList.add(boardBean02);

    BoardBean boardBean03 = new BoardBean();
    boardBean03.setTitle("Larry");
    boardBean03.setContent("Bird");
    boardBean03.setUserName("@twitter");
    boardBean03.setDate("2022.12.22");
    membersList.add(boardBean03);
    return membersList;
  }

  public BoardBean getDataList(String title) {
    BoardBean boardBean = new BoardBean();
    for (BoardBean data : getDataListWithBoardBean()) {
      if (title.equals(data.getTitle())) {
        boardBean.setTitle(data.getTitle());
        boardBean.setContent(data.getContent());
        boardBean.setUserName(data.getUserName());
        boardBean.setDate(data.getDate());
      } else {
        boardBean.setTitle("error");
        boardBean.setContent("error");
        boardBean.setUserName("error");
        boardBean.setDate("error");
      }
    }
    return boardBean;
  }

  public BoardBean getDataByUid(HashMap<String, String> hashMap) {
    String title = hashMap.get("title");
    String content = hashMap.get("content");
    String userName = hashMap.get("userName");
    String date = hashMap.get("date");

    BoardBean boardBean = new BoardBean();
    boardBean.setTitle(title);
    boardBean.setContent(content);
    boardBean.setUserName(userName);
    boardBean.setDate(date);

    return boardBean;
  }
}
