/**
 * 
 */
package com.srisris.onlinebillboard.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.srisris.onlinebillboard.domain.Category;

/**
 * @author Srinivas
 * 
 */
@Repository
public class CategoryDAOImpl implements CategoryDAO {

  @Autowired
  private SessionFactory sessionFactory;

  @Override
  public void addCategory(Category category) {
    sessionFactory.getCurrentSession().save(category);

  }

  @SuppressWarnings("unchecked")
  @Override
  public List<Category> listCategory() {
    return sessionFactory.getCurrentSession().createQuery("from Category").list();
  }

  @Override
  public void removeCategory(Integer id) {
    Category category = (Category) sessionFactory.getCurrentSession().load(Category.class, id);
    if (null != category) {
      sessionFactory.getCurrentSession().delete(category);
    }
  }

}
