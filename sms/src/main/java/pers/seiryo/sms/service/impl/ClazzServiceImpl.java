package pers.seiryo.sms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.seiryo.sms.bean.Clazz;
import pers.seiryo.sms.dao.ClazzMapper;
import pers.seiryo.sms.service.ClazzService;

import java.util.List;
@Service
@Transactional
public class ClazzServiceImpl implements ClazzService {
    @Autowired
    private ClazzMapper clazzMapper;

    public List<Clazz> selectAll(){return clazzMapper.selectAll();}
}
