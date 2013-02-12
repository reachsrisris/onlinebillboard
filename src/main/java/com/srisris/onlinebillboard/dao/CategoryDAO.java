package com.srisris.onlinebillboard.dao;

import java.util.List;

import com.srisris.onlinebillboard.domain.Category;

public interface CategoryDAO {

  public void addCategory(Category category);
  
  public List<Category> listCategory();

  public void removeCategory(Integer id);

}
