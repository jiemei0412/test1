package com.jiemei.dao;

import com.jiemei.bean.Student;

public interface StudentDao {
    //根据id查单条记录
    public Student queryStudentById(int id);

}
