package cc.dc.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class AnnotationUtil {

    public static String getMethodRequestURL(Method method) {
        String shortURL = "";
        Annotation[] annotations = method.getDeclaredAnnotations();
        for (Annotation annotation: annotations) {
            if (annotation instanceof RequestUrlAnnotation) {
                RequestUrlAnnotation requestUrlAnnotation = (RequestUrlAnnotation) annotation;
                shortURL = requestUrlAnnotation.value();
            }
        }
        return shortURL;
    }

    public static int getMethodType(Method method) {
        int methodType = 0;
        Annotation[] annotations = method.getDeclaredAnnotations();
        for (Annotation annotation: annotations) {
            if (annotation instanceof MethodTypeAnnotation) {
                MethodTypeAnnotation methodTypeAnnotation = (MethodTypeAnnotation) annotation;
                methodType = methodTypeAnnotation.value();
            }
        }
        return methodType;
    }

    public static Map<String, Object> getMethodParams(Method method, Object[] args) {
        Map<String, Object> map = new HashMap<>();
        Annotation[][] annotationParameters = method.getParameterAnnotations();
        int index = 0;
        for (Annotation[] annotations: annotationParameters) {
            for (Annotation annotation: annotations) {
                if (annotation instanceof ParamsAnnotation) {
                    ParamsAnnotation paramsAnnotation = (ParamsAnnotation) annotation;
                    map.put(paramsAnnotation.value(), args[index]);
                    index++;
                }
            }
        }
        return map;
    }
}
