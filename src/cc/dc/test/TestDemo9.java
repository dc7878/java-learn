package cc.dc.test;

import cc.dc.test.bean.TestBean;
import cc.dc.test.bean.TestInnerBean;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class TestDemo9 {

    public static void main(String[] args) {

        TestBean testBean = new TestBean();
        List<TestInnerBean> list = new ArrayList();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", "200");
        jsonObject.put("list", "");

//        System.out.println(jsonObject.toJSONString());

        TestBean testBean1 = JSONObject.parseObject("{\"code\":\"200\",\"list\":{}}", TestBean.class);
        System.out.println(testBean1.list.size());
        TestBean testBean2 = JSONObject.parseObject("{\"code\":\"200\",\"list\":[]}", TestBean.class);
        System.out.println(testBean2.list.size());
    }
}
