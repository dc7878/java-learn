package cc.dc.annotation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.Set;

public class HttpHelper {

    private static HttpHelper httpHelper = new HttpHelper();

    private String baseURL;

    private HttpHelper() {
    }

    public static HttpHelper getInstance() {
        return httpHelper;
    }

    public HttpHelper baseURL(String baseURL) {
        this.baseURL = baseURL;
        return this;
    }

    public <T> T createService(Class<T> clazz) {
        if (null == baseURL || "".equals(baseURL)) {
            throw new IllegalArgumentException("baseURL 不能为空");
        }
        T instance = (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                int methodType = AnnotationUtil.getMethodType(method);
                String shortURL = baseURL + AnnotationUtil.getMethodRequestURL(method);
                Map<String, Object> map = AnnotationUtil.getMethodParams(method, args);
                // TODO: 17/9/16 默认都是GET请求
                Set<String> keys = map.keySet();
                shortURL += "?";
                for (String key: keys) {
                    shortURL += key + "=" + map.get(key) + "&";
                }
                shortURL = shortURL.substring(0, shortURL.length() - 1);
                return shortURL;
            }
        });
        return instance;
    }

    public <T> T createService2(Class<T> clazz) {
        if (null == baseURL || "".equals(baseURL)) {
            throw new IllegalArgumentException("baseURL 不能为空");
        }
        T instance = (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                int methodType = AnnotationUtil2.getMethodType(method);
                String shortURL = baseURL + AnnotationUtil2.getMethodRequestURL(method);
                String methodTypeStr = "";
                switch (methodType) {
                    case 0:
                        // TODO: 默认都是GET请求
                        Map<String, Object> map = AnnotationUtil.getMethodParams(method, args);
                        Set<String> keys = map.keySet();
                        shortURL += "?";
                        for (String key: keys) {
                            shortURL += key + "=" + map.get(key) + "&";
                        }
                        shortURL = shortURL.substring(0, shortURL.length() - 1);
                        methodTypeStr= "GET";
                        break;
                    case 1:
                        // TODO: 默认POST请求是按照GET的请求方式处理
                        Map<String, Object> mapPost = AnnotationUtil.getMethodParams(method, args);
                        Set<String> keysPost = mapPost.keySet();
                        shortURL += "?";
                        for (String key: keysPost) {
                            shortURL += key + "=" + mapPost.get(key) + "&";
                        }
                        shortURL = shortURL.substring(0, shortURL.length() - 1);
                        methodTypeStr= "POST";
                        break;
                    default:
                        break;
                }
                System.out.println("请求方法是->" + methodTypeStr);
                return shortURL;
            }
        });
        return instance;
    }
}
