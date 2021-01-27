package pers.seiryo.sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.seiryo.sms.bean.Clazz;
import pers.seiryo.sms.bean.Teacher;
import pers.seiryo.sms.dao.ClazzMapper;
import pers.seiryo.sms.service.ClazzService;

import java.util.List;
@Service
@Transactional
public class ClazzServiceImpl implements ClazzService {
    @Autowired
    private ClazzMapper clazzMapper;

    public List<Clazz> selectAll(){return clazzMapper.selectAll();}

    @Override
    public Clazz fingByNum(Clazz clazz) {
        return clazzMapper.findByNum(clazz);
    }

    @Override
    public List<Clazz> selectList(Clazz clazz) {
        return clazzMapper.selectList(clazz);
    }

    @Override
    public int insert(Clazz clazz) {
        return clazzMapper.insert(clazz);
    }

    @Override
    public int update(Clazz clazz) {
        return clazzMapper.update(clazz);
    }


    @Override
    public int deleteById(Integer[] ids) {
        return clazzMapper.deleteById(ids);
    }
}
