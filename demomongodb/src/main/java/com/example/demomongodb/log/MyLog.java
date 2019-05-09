package com.example.demomongodb.log;

import java.lang.annotation.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈log〉
 *
 * @author zyz
 * @date 2019/5/9
 * @since 1.0.0
 */


@Target(ElementType.METHOD) //注解放置的目标位置,METHOD是可注解在方法级别上
@Retention(RetentionPolicy.RUNTIME) //注解在哪个阶段执行
@Documented //生成文档

public @interface MyLog {
    String value() default "";

}
