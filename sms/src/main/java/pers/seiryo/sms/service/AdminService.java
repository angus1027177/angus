package pers.seiryo.sms.service;

import pers.seiryo.sms.bean.Admin;
import pers.seiryo.sms.bean.LoginForm;

public interface AdminService{
    Admin login(LoginForm loginForm);
}
