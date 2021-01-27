package pers.seiryo.sms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import pers.seiryo.sms.bean.Clazz;
import pers.seiryo.sms.bean.Teacher;
import pers.seiryo.sms.service.ClazzService;
import pers.seiryo.sms.service.TeacherService;
import pers.seiryo.sms.util.UploadFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/clazz")
public class ClazzController {
    // 注入业务对象
    @Autowired
    private ClazzService clazzService;

    //存储预返回页面的数据对象
    private Map<String, Object> result = new HashMap<>();

    //跳转到班级信息管理页面
    @GetMapping("/goClazzListView")
    public ModelAndView goClazzListView(ModelAndView modelAndView) {
        //向页面发送一个存储着Clazz的List对象
        modelAndView.addObject("clazzList", clazzService.selectAll());
        modelAndView.setViewName("clazz/clazzList");
        return modelAndView;
    }


    //分页查询班级信息列表:根据班级名查询指定/全部班级信息列表

    @PostMapping("/getClazzList")
    @ResponseBody
    public Map<String, Object> getClazzList(Integer page, Integer rows, String clazzname, String gradename) {

        //存储查询的gradename,clazzname信息
        Clazz clazz = new Clazz(clazzname,gradename);
        //设置每页的记录数
        PageHelper.startPage(page, rows);
        //根据班级与年级名获取指定或全部班级信息列表
        List<Clazz> list = clazzService.selectList(clazz);
        //封装信息列表
        PageInfo<Clazz> pageInfo = new PageInfo<>(list);
        //获取总记录数
        long total = pageInfo.getTotal();
        //获取当前页数据列表
        List<Clazz> clazzList = pageInfo.getList();
        //存储数据对象
        result.put("total", total);
        result.put("rows", clazzList);

        return result;
    }

    // @description: 添加班级信息

    @PostMapping("/addClazz")
    @ResponseBody
    public Map<String, Object> addClazz(Clazz clazz) {
        //判断班级编号是否已存在
        if (clazzService.fingByNum(clazz) != null) {
            result.put("success", false);
            result.put("msg", "该班级编号已经存在! 请修改后重试!");
            return result;
        }
        //添加班级信息
        if (clazzService.insert(clazz) > 0) {
            result.put("success", true);
        } else {
            result.put("success", false);
            result.put("msg", "添加失败! (ಥ_ಥ)服务器端发生异常!");
        }

        return result;
    }

    // @description: 根据id修改指定的班级信息

    @PostMapping("/editClazz")
    @ResponseBody
    public Map<String, Object> editClazz(Clazz clazz) {
        if (clazzService.update(clazz) > 0) {
            result.put("success", true);
        } else {
            result.put("success", false);
            result.put("msg", "添加失败! (ಥ_ಥ)服务器端发生异常!");
        }
        return result;
    }


    //@description: 根据id删除指定的班级信息

    @PostMapping("/deleteClazz")
    @ResponseBody
    public Map<String, Object> deleteClazz(@RequestParam(value = "ids[]", required = true) Integer[] ids) {

        if (clazzService.deleteById(ids) > 0) {
            result.put("success", true);
        } else {
            result.put("success", false);
        }
        return result;
    }


    //@description: 上传头像-原理:将头像上传到项目发布目录中,通过读取数据库中的头像路径来获取头像

//    @PostMapping("/uploadPhoto")
//    @ResponseBody
//    public Map<String, Object> uploadPhoto(MultipartFile photo, HttpServletRequest request) {
//        //存储头像的本地目录
//        final String dirPath = request.getServletContext().getRealPath("/upload/clazz_portrait/");
//        //存储头像的项目发布目录
//        final String portraitPath = request.getServletContext().getContextPath() + "/upload/clazz_portrait/";
//        //返回头像的上传结果
//        return UploadFile.getUploadResult(photo, dirPath, portraitPath);
//    }
}
