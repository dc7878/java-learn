package cc.dc.annotation.test;

import cc.dc.annotation.*;

public interface ApiService {

    @RequestUrlAnnotation("login")
    @MethodTypeAnnotation(1)
    String login(@ParamsAnnotation("phone") String phoneNum, @ParamsAnnotation("password") String password);

    @RequestUrlAnnotation("register")
    @MethodTypeAnnotation(1)
    String register(@ParamsAnnotation("phone") String phoneNum, @ParamsAnnotation("code") String code);

    @GET("change")
    String changePwd(@ParamsAnnotation("phone") String phoneNum, @ParamsAnnotation("password") String password);

    @POST("sendSms")
    String getCmsCode(@ParamsAnnotation("phone") String phoneNum);
}
