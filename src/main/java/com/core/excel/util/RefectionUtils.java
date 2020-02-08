package com.core.excel.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/**
 * @author <a href="mailto:nguyenhiep96vn@gmail.com">Hiep Nguyen Van</a>
 * @version 1.0.0
 * @date Feb 4, 2020
 */
public class RefectionUtils {
	/**
	 * This is method find all fields of class exist an annotation
	 * 
	 * @param clazz
	 * @param annotation
	 * @return HashSet<Field>
	 */
	public static Set<Field> findFields(Class<?> clazz, Class<? extends Annotation> annotation){
		Set<Field> fields = new HashSet<Field>();
		for(Field field : clazz.getDeclaredFields()) {
			if(field.isAnnotationPresent(annotation)) {
				fields.add(field);
			}
		}
		return fields;
	}
}
