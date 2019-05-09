package com.example.demomongodb.log;

import com.example.demomongodb.domain.SysLog;
import com.example.demomongodb.server.LogService;
import com.mongodb.util.JSON;
import net.minidev.json.JSONArray;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈SysLogAspect 〉
 *
 * @author zyz
 * @date 2019/5/9
 * @since 1.0.0
 */
@Aspect
@Component
public class SysLogAspect {

    @Resource
    private LogService logService;

    //定义切点 @Pointcut
    //在注解的位置切入代码

    @Pointcut("@annotation( com.example.demomongodb.log.MyLog)")
    public void logPointCut() {
    }

    //切面 配置通知
    @AfterReturning(value = "logPointCut()",returning = "rvt")
    public void saveSysLog(JoinPoint joinPoint,Object rvt) {
//        System.out.println("切面。。。。。");
        //保存日志
        SysLog sysLog = new SysLog();

        //从切面织入点处通过反射机制获取织入点处的方法
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        //获取切入点所在的方法
        Method method = signature.getMethod();

        //获取操作
        MyLog myLog = method.getAnnotation(MyLog.class);
        if (myLog != null) {
            String value = myLog.value();
            sysLog.setOperation(value);
            //保存获取的操作
        }

        //获取请求的类名
        String className = joinPoint.getTarget().getClass().getName();
        //获取请求的方法名
        String methodName = method.getName();
        sysLog.setMethod(className + "." + methodName);

        //请求的参数
        Object[] args = joinPoint.getArgs();
        //将参数所在的数组转换成json
        String params = JSONArray.toJSONString(Arrays.asList(args));
        sysLog.setParams(params);

        sysLog.setCreateDate(new Date());

        sysLog.setResult((List) rvt);


//        //获取用户名
//        sysLog.setUsername(ShiroUtils.getUserEntity().getUsername());
//        //获取用户ip地址
//        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
//        sysLog.setIp(IPUtils.getIpAddr(request));

        //调用service保存SysLog实体类到数据库
        logService.save(sysLog);
    }


}
