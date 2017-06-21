package cn.wan.util.EditThisCookieUtil;

import cn.wan.util.EditThisCookieUtil.po.EditThisCookie;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 万洪基 on 2017/6/21.
 */
public class Cookies2Json {

    public static String getCookiesOfJson(String domain,String cookies){
        List<EditThisCookie> editThisCookieList = new ArrayList<EditThisCookie>();
        cookies = cookies.replaceAll("Cookie: ","").replace(" ", "");
        String cookiePair[] = cookies.split(";");
        long id = 1;
        for (String string:
                cookiePair){
            String cookie[] = string.split("=");
            EditThisCookie editThisCookie = new EditThisCookie();
            editThisCookie.setName(cookie[0]);
            editThisCookie.setValue(cookie[1]);
            editThisCookie.setId(id);
            id ++;
            editThisCookie.setDomain(domain);
            editThisCookieList.add(editThisCookie);
        }
        return JSON.toJSONString(editThisCookieList);
    }

}
