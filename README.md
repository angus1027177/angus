## :school::mortar_board::sparkles: a simple student management system , created by SSM framework ~


### 项目概述  (:speech_balloon: pause update)
:+1:*一个基于SSM的学生管理系统 : 代码注释详细,逻辑结构清晰,非常具有参考,学习价值哟 !*

:key:*数据库中默认的管理员身份信息 : 账户名 : `青凌` , 密码 `123321`*


### 开发环境
| 工具    | 版本或描述                |    
| ------- | ------------------------ |    
| `OS`    | Windows 10               | 
| `JDK`   |  1.8                     |    
| `IDE`   | IntelliJ IDEA 2019.1     |    
| `Maven` | 3.6.0                    |    
| `MySQL` | 8.0.11                   |



### 用户权限介绍
- *管理员 : 具有所有管理模块的操控权限*
- *教师 : 仅具有学生信息管理模块的所有权限,且在教师信息管理模块中只具有查询及添加信息的权限*
- *学生 : 仅具有学生信息管理模块的查询及添加信息的权限*



### 项目结构
```
│  .gitattributes
│  LICENSE
│  README.md
│
├─database file
│      ssm_sms.sql
│
├─demonstration_picture
│      SMS-ClassInfo-view.PNG
│      SMS-GradeInfo-view.PNG
│      SMS-Login-view.PNG
│      SMS-ModifyPwd-view.PNG
│      SMS-Student-permission.PNG
│      SMS-StudentInfo-view.PNG
│      SMS-Teacher-permission.PNG
│      SMS-TeacherInfo-view.PNG
│      SSM-AdminInfo-view.PNG
│      SSM-Main-view.PNG
│
└─sms
    │  pom.xml
    │
    │
    └─src
        └─main
            ├─java
            │  └─pers
            │      └─huangyuhui
            │          └─sms
            │              ├─bean
            │              │      Admin.java
            │              │      Clazz.java
            │              │      Grade.java
            │              │      LoginForm.java
            │              │      Student.java
            │              │      Teacher.java
            │              │
            │              ├─controller
            │              │      AdminController.java
            │              │      ClazzController.java
            │              │      CommonController.java
            │              │      GradeController.java
            │              │      StudentController.java
            │              │      SystemController.java
            │              │      TeacherController.java
            │              │
            │              ├─dao
            │              │      AdminMapper.java
            │              │      ClazzMapper.java
            │              │      GradeMapper.java
            │              │      StudentMapper.java
            │              │      TeacherMapper.java
            │              │
            │              ├─interceptor
            │              │      LoginInterceptor.java
            │              │
            │              ├─service
            │              │  │  AdminService.java
            │              │  │  ClazzService.java
            │              │  │  GradeService.java
            │              │  │  StudentService.java
            │              │  │  TeacherService.java
            │              │  │
            │              │  └─impl
            │              │          AdminServiceImpl.java
            │              │          ClazzServiceImpl.java
            │              │          GradeServiceImpl.java
            │              │          StudentServiceImpl.java
            │              │          TeacherServiceImpl.java
            │              │
            │              └─util
            │                      CreateVerifiCodeImage.java
            │                      UploadFile.java
            │
            ├─resource
            │  ├─database-conf
            │  │      c3p0.properties
            │  │
            │  ├─mapper
            │  │      AdminMapper.xml
            │  │      ClazzMapper.xml
            │  │      GradeMapper.xml
            │  │      StudentMapper.xml
            │  │      TeacherMapper.xml
            │  │
            │  ├─mybatis-conf
            │  │      mybatis-config.xml
            │  │
            │  └─spring-conf
            │          applicationContext.xml
            │          springmvc-config.xml
            │
            └─webapp
                │  index.jsp
                │
                ├─image
                │  └─portrait
                │          default_admin_portrait.png
                │          default_student_portrait.png
                │          default_teacher_portrait.png
                │
                ├─static
                │  ├─easyui
                │  │  │  
                │  │  ├─css     
                │  │  │
                │  │  ├─js    
                │  │  │
                │  │  └─themes
                │  │     
                │  │
                │  └─h-ui
                │      │(略..)
                │        
                │            
                │
                └─WEB-INF
                    │  web.xml
                    │
                    └─view
                        ├─admin
                        │      adminList.jsp
                        │
                        ├─clazz
                        │      clazzList.jsp
                        │
                        ├─common
                        │      settings.jsp
                        │
                        ├─error
                        │      404.jsp
                        │      500.jsp
                        │
                        ├─grade
                        │      gradeList.jsp
                        │
                        ├─student
                        │      studentList.jsp
                        │
                        ├─system
                        │      intro.jsp
                        │      login.jsp
                        │      main.jsp
                        │
                        └─teacher
                                teacherList.jsp
```

#### 项目文件说明-`数据库文件`
```
ssm_sms.sql
```

#### 项目文件说明-`数据库配置信息`
```
c3p0.properties
```

#### 项目文件说明-`H-ui 前端框架`
```
h-ui/
```

#### 项目文件说明-`EasyUI 前端框架`
```
easyui/
```

#### 项目文件说明-`Spring 核心配置文件`
```
applicationContext.xml
```

#### 项目文件说明-`Spring MVC 核心配置文件`
```
springmvc-config.xml
```

#### 项目文件说明-`MyBatis 核心配置文件`
```
mybatis-config.xml
```

#### 项目文件说明-`Mapper 接口映射文件`
```
mapper/
```

#### 项目文件说明-`用户默认头像`
```
portrait/
```

