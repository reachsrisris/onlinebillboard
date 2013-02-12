/**
 * 
 */
package com.srisris.onlinebillboard.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Srinivas
 * 
 */
@Entity
@Table(name = "Category")
public class Category {

  @Id
  @Column(name = "CATEGORY_ID")
  private Integer id;
  @Column(name = "CATEGORY_NAME")
  private String categoryName;
  @Column(name = "CATEGORY_DESC")
  private String categoryDescription;

  /**
   * @return the id
   */
  public final Integer getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public final void setId(Integer id) {
    this.id = id;
  }

  /**
   * @return the categoryName
   */
  public final String getCategoryName() {
    return categoryName;
  }

  /**
   * @param categoryName the categoryName to set
   */
  public final void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  /**
   * @return the categoryDescription
   */
  public final String getCategoryDescription() {
    return categoryDescription;
  }

  /**
   * @param categoryDescription the categoryDescription to set
   */
  public final void setCategoryDescription(String categoryDescription) {
    this.categoryDescription = categoryDescription;
  }



}
