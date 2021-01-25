package pers.seiryo.sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.seiryo.sms.bean.LoginForm;
import pers.seiryo.sms.bean.Teacher;
import pers.seiryo.sms.dao.TeacherMapper;
import pers.seiryo.sms.service.TeacherService;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    public Teacher login(LoginForm loginForm){return teacherMapper.login(loginForm);}
}
