package cc.dc.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationUtil2 {

    public static String getMethodRequestURL(Method method) {
        String shortURL = "";
        Annotation[] annotations = method.getDeclaredAnnotations();
        for (Annotation annotation: annotations) {
            if (annotation instanceof GET) {
                GET requestUrlAnnotation = (GET) annotation;
                shortURL = requestUrlAnnotation.value();
            } else if (annotation instanceof POST) {
                POST requestUrlAnnotation = (POST) annotation;
                shortURL = requestUrlAnnotation.value();
            }
        }
        return shortURL;
    }

    public static int getMethodType(Method method) {
        int methodType = 0;
        Annotation[] annotations = method.getDeclaredAnnotations();
        for (Annotation annotation: annotations) {
            if (annotation instanceof GET) {
                methodType = 0;
            } else if (annotation instanceof POST) {
                methodType = 1;
            }
        }
        return methodType;
    }
}
