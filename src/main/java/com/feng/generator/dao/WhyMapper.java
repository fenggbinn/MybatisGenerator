package com.feng.generator.dao;

import com.feng.generator.bean.Why;
import java.util.List;

public interface WhyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table why
     *
     * @mbg.generated Tue May 18 09:22:23 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table why
     *
     * @mbg.generated Tue May 18 09:22:23 CST 2021
     */
    int insert(Why record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table why
     *
     * @mbg.generated Tue May 18 09:22:23 CST 2021
     */
    Why selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table why
     *
     * @mbg.generated Tue May 18 09:22:23 CST 2021
     */
    List<Why> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table why
     *
     * @mbg.generated Tue May 18 09:22:23 CST 2021
     */
    int updateByPrimaryKey(Why record);
}