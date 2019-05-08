package com.augus.edu.model;

import java.util.Date;

public class SalaryDetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_salary_detail.id
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_salary_detail.total_salary
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    private Long totalSalary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_salary_detail.social_salary
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    private Long socialSalary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_salary_detail.house_salary
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    private Long houseSalary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_salary_detail.tax
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    private Long tax;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_salary_detail.basic_salary
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    private Long basicSalary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_salary_detail.reward_money
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    private Long rewardMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_salary_detail.punish_money
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    private Long punishMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_salary_detail.help_money
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    private Long helpMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_salary_detail.actual_money
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    private Long actualMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_salary_detail.emp_id
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    private Integer empId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_salary_detail.salary_date
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    private Date salaryDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_salary_detail.id
     *
     * @return the value of t_salary_detail.id
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_salary_detail.id
     *
     * @param id the value for t_salary_detail.id
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_salary_detail.total_salary
     *
     * @return the value of t_salary_detail.total_salary
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public Long getTotalSalary() {
        return totalSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_salary_detail.total_salary
     *
     * @param totalSalary the value for t_salary_detail.total_salary
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public void setTotalSalary(Long totalSalary) {
        this.totalSalary = totalSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_salary_detail.social_salary
     *
     * @return the value of t_salary_detail.social_salary
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public Long getSocialSalary() {
        return socialSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_salary_detail.social_salary
     *
     * @param socialSalary the value for t_salary_detail.social_salary
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public void setSocialSalary(Long socialSalary) {
        this.socialSalary = socialSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_salary_detail.house_salary
     *
     * @return the value of t_salary_detail.house_salary
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public Long getHouseSalary() {
        return houseSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_salary_detail.house_salary
     *
     * @param houseSalary the value for t_salary_detail.house_salary
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public void setHouseSalary(Long houseSalary) {
        this.houseSalary = houseSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_salary_detail.tax
     *
     * @return the value of t_salary_detail.tax
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public Long getTax() {
        return tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_salary_detail.tax
     *
     * @param tax the value for t_salary_detail.tax
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public void setTax(Long tax) {
        this.tax = tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_salary_detail.basic_salary
     *
     * @return the value of t_salary_detail.basic_salary
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public Long getBasicSalary() {
        return basicSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_salary_detail.basic_salary
     *
     * @param basicSalary the value for t_salary_detail.basic_salary
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public void setBasicSalary(Long basicSalary) {
        this.basicSalary = basicSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_salary_detail.reward_money
     *
     * @return the value of t_salary_detail.reward_money
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public Long getRewardMoney() {
        return rewardMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_salary_detail.reward_money
     *
     * @param rewardMoney the value for t_salary_detail.reward_money
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public void setRewardMoney(Long rewardMoney) {
        this.rewardMoney = rewardMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_salary_detail.punish_money
     *
     * @return the value of t_salary_detail.punish_money
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public Long getPunishMoney() {
        return punishMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_salary_detail.punish_money
     *
     * @param punishMoney the value for t_salary_detail.punish_money
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public void setPunishMoney(Long punishMoney) {
        this.punishMoney = punishMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_salary_detail.help_money
     *
     * @return the value of t_salary_detail.help_money
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public Long getHelpMoney() {
        return helpMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_salary_detail.help_money
     *
     * @param helpMoney the value for t_salary_detail.help_money
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public void setHelpMoney(Long helpMoney) {
        this.helpMoney = helpMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_salary_detail.actual_money
     *
     * @return the value of t_salary_detail.actual_money
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public Long getActualMoney() {
        return actualMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_salary_detail.actual_money
     *
     * @param actualMoney the value for t_salary_detail.actual_money
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public void setActualMoney(Long actualMoney) {
        this.actualMoney = actualMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_salary_detail.emp_id
     *
     * @return the value of t_salary_detail.emp_id
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_salary_detail.emp_id
     *
     * @param empId the value for t_salary_detail.emp_id
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_salary_detail.salary_date
     *
     * @return the value of t_salary_detail.salary_date
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public Date getSalaryDate() {
        return salaryDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_salary_detail.salary_date
     *
     * @param salaryDate the value for t_salary_detail.salary_date
     *
     * @mbggenerated Tue May 07 17:32:48 CST 2019
     */
    public void setSalaryDate(Date salaryDate) {
        this.salaryDate = salaryDate;
    }
}