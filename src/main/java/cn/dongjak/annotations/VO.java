package cn.dongjak.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface VO {
    String packageName() default "";

    String[] excludes() default {};

    Field[] fields() default {};

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Exclude {
    }


    @Target({ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Field {

        String name();

        String expression() default "";
    }

}
