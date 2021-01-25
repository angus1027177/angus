package pers.seiryo.sms.dao;

import pers.seiryo.sms.bean.Admin;
import pers.seiryo.sms.bean.LoginForm;

public interface AdminMapper {
    Admin login(LoginForm loginForm);
}
