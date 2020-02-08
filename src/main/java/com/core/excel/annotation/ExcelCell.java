package com.core.excel.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author <a href="mailto:nguyenhiep96vn@gmail.com">Hiep Nguyen Van</a>
 * @version 1.0.0
 * @date Feb 4, 2020
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ExcelCell {
	String position() default "";
}
