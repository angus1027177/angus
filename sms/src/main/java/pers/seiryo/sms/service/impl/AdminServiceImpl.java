package pers.seiryo.sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.seiryo.sms.bean.Admin;
import pers.seiryo.sms.bean.LoginForm;
import pers.seiryo.sms.dao.AdminMapper;
import pers.seiryo.sms.service.AdminService;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminMapper adminMapper;

    public Admin login(LoginForm loginForm){return adminMapper.login(loginForm);}

}
