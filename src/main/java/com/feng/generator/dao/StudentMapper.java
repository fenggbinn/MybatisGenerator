package com.feng.generator.dao;

import com.feng.generator.bean.Student;
import java.util.List;

public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Tue May 18 18:42:35 CST 2021
     */
    int deleteByPrimaryKey(String sno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Tue May 18 18:42:35 CST 2021
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Tue May 18 18:42:35 CST 2021
     */
    Student selectByPrimaryKey(String sno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Tue May 18 18:42:35 CST 2021
     */
    List<Student> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Tue May 18 18:42:35 CST 2021
     */
    int updateByPrimaryKey(Student record);
}