package com.wong.upala.utils;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import com.wong.upala.commons.FinalVariable;
import lombok.extern.log4j.Log4j2;
import org.json.JSONException;
import java.io.IOException;
import java.util.Map;

/********************************
 *  @program document
 *  @author upala
 *  @version 0.0.1
 *  @since 2019-11-19 14:27
 *  @description
 ********************************/

@Log4j2
public class MessageUtils {

    /**
     * 发送单条或多条短信
     * @param phoneNumbers 短信接收的电话号码
     * @param content 发送短信的内容
     */
    public static Map<String, Object> sendMessage(String[] phoneNumbers, String[] content) {
        try {
            SmsSingleSender smsSingleSender = new SmsSingleSender(FinalVariable.APP_ID, FinalVariable.APP_KEY);
            smsSingleSender.sendWithParam("86", phoneNumbers[0],FinalVariable.TEMPLATE_ID,
                    content, FinalVariable.SMS_SIGN, "", "");
        } catch (HTTPException | JSONException | IOException e) {
            // HTTP 响应码错误 | JSON解析错误 | 网络IO错误
            log.error("发送短信失败:{}", e.getMessage());
            ResultUtils.resultFailData("发送短信失败", FinalVariable.RESULT_FAIL_CODE);
        }
        return ResultUtils.resultSuccessNullData("发送短信成功", FinalVariable.RESULT_SUCCESS_CODE);
    }
}
