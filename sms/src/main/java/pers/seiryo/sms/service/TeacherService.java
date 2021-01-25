package pers.seiryo.sms.service;

import pers.seiryo.sms.bean.LoginForm;
import pers.seiryo.sms.bean.Teacher;

public interface TeacherService {
    Teacher login(LoginForm loginForm);
}
