package pers.seiryo.sms.dao;

import pers.seiryo.sms.bean.LoginForm;
import pers.seiryo.sms.bean.Teacher;

public interface TeacherMapper {
    Teacher login(LoginForm loginForm);
}
