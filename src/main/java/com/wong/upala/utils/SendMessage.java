package com.wong.upala.utils;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import org.json.JSONException;
import java.io.IOException;

/********************************
 *  @program document
 *  @author upala
 *  @version 0.0.1
 *  @since 2019-11-19 14:27
 *  @description
 ********************************/
public class SendMessage {

    public static void main(String[] args) {
        int appId = 1400210309;
        String appKey = "7c5a6c3e03f0c51155aa08d7f693ee71";
        String phoneNumbers[] = {"15193665306"};
        int templateId = 329251;
        String smsSign = "小王学JAVA";
        try {
            String[] params = {"张欢", "！@#￥%&*()"};
            SmsSingleSender smsSingleSender = new SmsSingleSender(appId, appKey);
            SmsSingleSenderResult result = smsSingleSender.sendWithParam("86", phoneNumbers[0],
                    templateId, params, smsSign, "", "");
            System.out.println(result);
        } catch (HTTPException | JSONException | IOException e) {
            // HTTP 响应码错误 | JSON解析错误 | 网络IO错误
            e.printStackTrace();
        }
    }
}
