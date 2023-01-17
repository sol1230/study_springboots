package com.study.study_springboots.dao;

import java.util.HashMap;
import java.util.Map;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public class CommonCodeDao {
  @Autowired
  private SqlSessionTemplate sqlSessionTemplate;

  public Object getList() {
    String statement = "List.selectFromCIPCCByCNO";
    // Map parameter = new HashMap();
    // parameter.put("QUESTION_UID", "Q2");
    Object resultSet = sqlSessionTemplate.selectList(statement);
    return resultSet;
  }
}
