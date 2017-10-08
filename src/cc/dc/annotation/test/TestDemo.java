package cc.dc.annotation.test;

import cc.dc.annotation.HttpHelper;


public class TestDemo {

    public static void main(String[] args) {
        System.out.println("------------");
        String login = HttpHelper
                .getInstance()
                .baseURL("http://cyol.com/")
                .createService(ApiService.class)
                .login("18515441255", "123456");
        System.out.println(login);

        System.out.println("------------");

        String register = HttpHelper
                .getInstance()
                .baseURL("http://www.learn2sleep.com/")
                .createService(ApiService.class)
                .register("18515441255", "1234");
        System.out.println(register);

        System.out.println("------------");

        String response = HttpHelper.getInstance()
                 .baseURL("https://www.baidu.com/")
                 .createService2(ApiService.class)
                 .changePwd("18234096324", "787864859");
        System.out.println(response);

        System.out.println("------------");

        String code = HttpHelper.getInstance()
                .baseURL("https://www.itouzi.com/")
                .createService2(ApiService.class)
                .getCmsCode("17288058506");
        System.out.println(code);
    }
}
