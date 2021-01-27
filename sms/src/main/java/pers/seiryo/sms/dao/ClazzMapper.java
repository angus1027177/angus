package pers.seiryo.sms.dao;

import pers.seiryo.sms.bean.Clazz;
import pers.seiryo.sms.bean.Teacher;

import java.util.List;

public interface ClazzMapper {
    //查找所有班级
    List<Clazz> selectAll();

    //根据班级名获取指定或全部班级信息列表
    List<Clazz> selectList(Clazz clazz);

    //根据班级编号号查询指定班级信息
    Clazz findByNum(Clazz clazz);

    //添加班级信息
    int insert(Clazz clazz);

    //根据id修改指定班级信息
    int update(Clazz clazz);

    //根据id删除指定班级信息
    int deleteById(Integer[] ids);
}
