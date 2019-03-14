package com.sdata.ecommerce.domain;

import com.sdata.ecommerce.domain.extended.CategoryExtended;

public class Category extends CategoryExtended {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sdata_category.id
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sdata_category.name
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sdata_category.parent_category
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    private String parentCategory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sdata_category.url
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sdata_category.template
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    private String template;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sdata_category.begin_date
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    private String beginDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sdata_category.end_date
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    private String endDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sdata_category.active
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    private Boolean active;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdata_category
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    public Category(String id, String name, String parentCategory, String url, String template, String beginDate, String endDate, Boolean active) {
        this.id = id;
        this.name = name;
        this.parentCategory = parentCategory;
        this.url = url;
        this.template = template;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.active = active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdata_category
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    public Category() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sdata_category.id
     *
     * @return the value of sdata_category.id
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sdata_category.id
     *
     * @param id the value for sdata_category.id
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sdata_category.name
     *
     * @return the value of sdata_category.name
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sdata_category.name
     *
     * @param name the value for sdata_category.name
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sdata_category.parent_category
     *
     * @return the value of sdata_category.parent_category
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    public String getParentCategory() {
        return parentCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sdata_category.parent_category
     *
     * @param parentCategory the value for sdata_category.parent_category
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    public void setParentCategory(String parentCategory) {
        this.parentCategory = parentCategory == null ? null : parentCategory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sdata_category.url
     *
     * @return the value of sdata_category.url
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sdata_category.url
     *
     * @param url the value for sdata_category.url
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sdata_category.template
     *
     * @return the value of sdata_category.template
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    public String getTemplate() {
        return template;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sdata_category.template
     *
     * @param template the value for sdata_category.template
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    public void setTemplate(String template) {
        this.template = template == null ? null : template.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sdata_category.begin_date
     *
     * @return the value of sdata_category.begin_date
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    public String getBeginDate() {
        return beginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sdata_category.begin_date
     *
     * @param beginDate the value for sdata_category.begin_date
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate == null ? null : beginDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sdata_category.end_date
     *
     * @return the value of sdata_category.end_date
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sdata_category.end_date
     *
     * @param endDate the value for sdata_category.end_date
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sdata_category.active
     *
     * @return the value of sdata_category.active
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sdata_category.active
     *
     * @param active the value for sdata_category.active
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdata_category
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Category other = (Category) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentCategory() == null ? other.getParentCategory() == null : this.getParentCategory().equals(other.getParentCategory()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getTemplate() == null ? other.getTemplate() == null : this.getTemplate().equals(other.getTemplate()))
            && (this.getBeginDate() == null ? other.getBeginDate() == null : this.getBeginDate().equals(other.getBeginDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getActive() == null ? other.getActive() == null : this.getActive().equals(other.getActive()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdata_category
     *
     * @mbg.generated Thu Feb 14 15:10:40 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParentCategory() == null) ? 0 : getParentCategory().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        result = prime * result + ((getBeginDate() == null) ? 0 : getBeginDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getActive() == null) ? 0 : getActive().hashCode());
        return result;
    }
}