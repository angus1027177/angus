package pers.seiryo.sms.service;

import pers.seiryo.sms.bean.LoginForm;
import pers.seiryo.sms.bean.Student;
import pers.seiryo.sms.bean.Teacher;

import java.util.List;

public interface TeacherService {
    // 验证登录信息是否正确
    Teacher login(LoginForm loginForm);

    //根据班级与教师名获取指定或全部教师信息列表
    List<Teacher> selectList(Teacher teacher);

    //根据学号获取指定学生信息
    Teacher fingByTno(Teacher teacher);

    //添加班级信息
    int insert(Teacher teacher);

    //根据id修改指定教师信息
    int update(Teacher teacher);

    //根据id修改指定教师密码
    int updatePassowrd(Teacher teacher);

    //根据id删除指定教师信息
    int deleteById(Integer[] ids);
}
