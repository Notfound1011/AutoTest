package framework;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

@Data
public class LogBuild {

    private Map<String, String> logMap = new HashMap<>();

    public static LogBuild instance() {
        return new LogBuild();
    }

    /**
     * traceId
     *
     * @param traceId
     * @return
     */
    public LogBuild traceId(String traceId) {
        if (StringUtils.isNotBlank(traceId)) {
            logMap.put(LogBuildEnum.TRACE_ID.key, traceId);
        }
        return this;
    }

    /**
     * globalId
     *
     * @param globalId
     * @return
     */
    public LogBuild globalId(String globalId) {
        if (StringUtils.isNotBlank(globalId)) {
            logMap.put(LogBuildEnum.GLOBAL_ID.key, globalId);
        }
        return this;
    }

    /**
     * uuid
     *
     * @param uuid
     * @return
     */
    public LogBuild uuid(String uuid) {
        if (StringUtils.isNotBlank(uuid)) {
            logMap.put(LogBuildEnum.UUID.key, uuid);
        }
        return this;
    }

    /**
     * 用户Id
     *
     * @param userId
     * @return
     */
    public LogBuild userId(String userId) {
        if (StringUtils.isNotBlank(userId)) {
            logMap.put(LogBuildEnum.USER_ID.key, userId);
        }
        return this;
    }

    /**
     * 用户名
     *
     * @param userName
     * @return
     */
    public LogBuild userName(String userName) {
        if (StringUtils.isNotBlank(userName)) {
            logMap.put(LogBuildEnum.USER_NAME.key, userName);
        }
        return this;
    }

    /**
     * 用户chatId
     *
     * @param userChatId
     * @return
     */
    public LogBuild userChatId(String userChatId) {
        if (StringUtils.isNotBlank(userChatId)) {
            logMap.put(LogBuildEnum.USER_CHAT_ID.key, userChatId);
        }
        return this;
    }

    /**
     * 日志记录时间
     *
     * @param time
     * @return
     */
    public LogBuild time(String time) {
        if (StringUtils.isNotBlank(time)) {
            logMap.put(LogBuildEnum.TIME.key, time);
        }
        return this;
    }

    /**
     * 日志类型（debug,info,warn,error）
     *
     * @param logType
     * @return
     */
    public LogBuild logType(String logType) {
        if (StringUtils.isNotBlank(logType)) {
            logMap.put(LogBuildEnum.LOG_TYPE.key, logType);
        }
        return this;
    }

    /**
     * 消息
     *
     * @param msg
     * @return
     */
    public LogBuild msg(String msg) {
        if (StringUtils.isNotBlank(msg)) {
            logMap.put(LogBuildEnum.MSG.key, msg);
        }
        return this;
    }

    /**
     * 日志文件路径
     *
     * @param logFile
     * @return
     */
    public LogBuild logFile(String logFile) {
        if (StringUtils.isNotBlank(logFile)) {
            logMap.put(LogBuildEnum.LOG_FILE.key, logFile);
        }
        return this;
    }

    /**
     * request
     *
     * @param request
     * @return
     */
    public LogBuild request(String request) {
        if (StringUtils.isNotBlank(request)) {
            logMap.put(LogBuildEnum.REQUEST.key, request);
        }
        return this;
    }

    /**
     * response
     *
     * @param response
     * @return
     */
    public LogBuild response(String response) {
        if (StringUtils.isNotBlank(response)) {
            logMap.put(LogBuildEnum.RESPONSE.key, response);
        }
        return this;
    }

    /**
     * 推送类型
     *
     * @param pushType
     * @return
     */
    public LogBuild pushType(String pushType) {
        if (StringUtils.isNotBlank(pushType)) {
            logMap.put(LogBuildEnum.PUSH_TYPE.key, pushType);
        }
        return this;
    }

    /**
     * 耗时
     *
     * @param duration
     * @return
     */
    public LogBuild duration(String duration) {
        if (StringUtils.isNotBlank(duration)) {
            logMap.put(LogBuildEnum.DURATION.key, duration);
        }
        return this;
    }

    /**
     * 渠道id
     *
     * @param channel
     * @return
     */
    public LogBuild channel(String channel) {
        if (StringUtils.isNotBlank(channel)) {
            logMap.put(LogBuildEnum.CHANNEL.key, channel);
        }
        return this;
    }

    /**
     * url
     *
     * @param url
     * @return
     */
    public LogBuild url(String url) {
        if (StringUtils.isNotBlank(url)) {
            logMap.put(LogBuildEnum.URL.key, url);
        }
        return this;
    }

    /**
     * 订单号
     *
     * @param orderNo
     * @return
     */
    public LogBuild orderNo(String orderNo) {
        if (StringUtils.isNotBlank(orderNo)) {
            logMap.put(LogBuildEnum.ORDER_NO.key, orderNo);
        }
        return this;
    }

    /**
     * 第三方Oid
     *
     * @param partnerOId
     * @return
     */
    public LogBuild partnerOId(String partnerOId) {
        if (StringUtils.isNotBlank(partnerOId)) {
            logMap.put(LogBuildEnum.PARTNER_OID.key, partnerOId);
        }
        return this;
    }

    /**
     * 酒店guid
     *
     * @param hotelGuid
     * @return
     */
    public LogBuild hotelGuid(String hotelGuid) {
        if (StringUtils.isNotBlank(hotelGuid)) {
            logMap.put(LogBuildEnum.HOTEL_GUID.key, hotelGuid);
        }
        return this;
    }

    /**
     * 房屋guid
     *
     * @param houseGuid
     * @return
     */
    public LogBuild houseGuid(String houseGuid) {
        if (StringUtils.isNotBlank(houseGuid)) {
            logMap.put(LogBuildEnum.HOUSE_GUID.key, houseGuid);
        }
        return this;
    }

    /**
     * 供应商key
     *
     * @param supplierKey
     * @return
     */
    public LogBuild supplierKey(String supplierKey) {
        if (StringUtils.isNotBlank(supplierKey)) {
            logMap.put(LogBuildEnum.SUPPLIER_KEY.key, supplierKey);
        }
        return this;
    }

    /**
     * 消息id
     *
     * @param msgId
     * @return
     */
    public LogBuild msgId(String msgId) {
        if (StringUtils.isNotBlank(msgId)) {
            logMap.put(LogBuildEnum.MSG_ID.key, msgId);
        }
        return this;
    }

    /**
     * 消息内容
     *
     * @param msgContext
     * @return
     */
    public LogBuild msgContext(String msgContext) {
        if (StringUtils.isNotBlank(msgContext)) {
            logMap.put(LogBuildEnum.MSG_CONTEXT.key, msgContext);
        }
        return this;
    }

    /**
     * 状态
     *
     * @param status
     * @return
     */
    public LogBuild status(String status) {
        if (StringUtils.isNotBlank(status)) {
            logMap.put(LogBuildEnum.STATUS.key, status);
        }
        return this;
    }

    /**
     * 订单状态
     *
     * @param orderStatus
     * @return
     */
    public LogBuild orderStatus(String orderStatus) {
        if (StringUtils.isNotBlank(orderStatus)) {
            logMap.put(LogBuildEnum.ORDER_STATUS.key, orderStatus);
        }
        return this;
    }

    /**
     * 作用域，可用于指定类名或job名
     *
     * @param domain
     * @return
     */
    public LogBuild domain(String domain) {
        if (StringUtils.isNotBlank(domain)) {
            logMap.put(LogBuildEnum.DOMAIN.key, domain);
        }
        return this;
    }

    /**
     * @param method
     * @return
     */
    public LogBuild method(String method) {
        if (StringUtils.isNotBlank(method)) {
            logMap.put(LogBuildEnum.METHOD.key, method);
        }
        return this;
    }

    /**
     * 返回结果
     *
     * @param result
     * @return
     */
    public LogBuild result(String result) {
        if (StringUtils.isNotBlank(result)) {
            logMap.put(LogBuildEnum.RESULT.key, result);
        }
        return this;
    }

    /**
     * guid
     *
     * @param guid
     * @return
     */
    public LogBuild guid(String guid) {
        if (StringUtils.isNotBlank(guid)) {
            logMap.put(LogBuildEnum.GUID.key, guid);
        }
        return this;
    }

    /**
     * 供应商guid
     *
     * @param supplierGuid
     * @return
     */
    public LogBuild supplierGuid(String supplierGuid) {
        if (StringUtils.isNotBlank(supplierGuid)) {
            logMap.put(LogBuildEnum.SUPPLIER_GUID.key, supplierGuid);
        }
        return this;
    }

    /**
     * 基本信息
     *
     * @param info
     * @return
     */
    public LogBuild info(String info) {
        if (StringUtils.isNotBlank(info)) {
            logMap.put(LogBuildEnum.INFO.key, info);
        }
        return this;
    }

    /**
     * apiKey
     *
     * @param apiKey
     * @return
     */
    public LogBuild apiKey(String apiKey) {
        if (StringUtils.isNotBlank(apiKey)) {
            logMap.put(LogBuildEnum.API_KEY.key, apiKey);
        }
        return this;
    }

    /**
     * 数量
     *
     * @param count
     * @return
     */
    public LogBuild count(String count) {
        if (StringUtils.isNotBlank(count)) {
            logMap.put(LogBuildEnum.COUNT.key, count);
        }
        return this;
    }

    /**
     * 第三方母酒店id
     *
     * @param partnerMasterHotelId
     * @return
     */
    public LogBuild partnerMasterHotelId(String partnerMasterHotelId) {
        if (StringUtils.isNotBlank(partnerMasterHotelId)) {
            logMap.put(LogBuildEnum.PARTNER_MASTER_HOTEL_ID.key, partnerMasterHotelId);
        }
        return this;
    }

    /**
     * 第三方酒店id
     *
     * @param partnerHotelId
     * @return
     */
    public LogBuild partnerHotelId(String partnerHotelId) {
        if (StringUtils.isNotBlank(partnerHotelId)) {
            logMap.put(LogBuildEnum.PARTNER_HOTEL_ID.key, partnerHotelId);
        }
        return this;
    }

    /**
     * 第三方房屋id
     *
     * @param partnerHouseId
     * @return
     */
    public LogBuild partnerHouseId(String partnerHouseId) {
        if (StringUtils.isNotBlank(partnerHouseId)) {
            logMap.put(LogBuildEnum.PARTNER_HOUSE_ID.key, partnerHouseId);
        }
        return this;
    }

    /**
     * 第三方产品id
     *
     * @param partnerProductId
     * @return
     */
    public LogBuild partnerProductId(String partnerProductId) {
        if (StringUtils.isNotBlank(partnerProductId)) {
            logMap.put(LogBuildEnum.PARTNER_PRODUCT_ID.key, partnerProductId);
        }
        return this;
    }

    /**
     * 第三方礼物id
     *
     * @param partnerGiftId
     * @return
     */
    public LogBuild partnerGiftId(String partnerGiftId) {
        if (StringUtils.isNotBlank(partnerGiftId)) {
            logMap.put(LogBuildEnum.PARTNER_GIFT_ID.key, partnerGiftId);
        }
        return this;
    }

    /**
     * 途家酒店id
     *
     * @param tujiaHotelId
     * @return
     */
    public LogBuild tujiaHotelId(String tujiaHotelId) {
        if (StringUtils.isNotBlank(tujiaHotelId)) {
            logMap.put(LogBuildEnum.TUJIA_HOTEL_ID.key, tujiaHotelId);
        }
        return this;
    }

    /**
     * 途家房屋id
     *
     * @param tujiaHouseId
     * @return
     */
    public LogBuild tujiaHouseId(String tujiaHouseId) {
        if (StringUtils.isNotBlank(tujiaHouseId)) {
            logMap.put(LogBuildEnum.TUJIA_HOUSE_ID.key, tujiaHouseId);
        }
        return this;
    }

    /**
     * 途家产品id
     *
     * @param tujiaProductId
     * @return
     */
    public LogBuild tujiaProductId(String tujiaProductId) {
        if (StringUtils.isNotBlank(tujiaProductId)) {
            logMap.put(LogBuildEnum.TUJIA_PRODUCT_ID.key, tujiaProductId);
        }
        return this;
    }

    /**
     * 敏感词
     *
     * @param sensitiveWord
     * @return
     */
    public LogBuild sensitiveWord(String sensitiveWord) {
        if (StringUtils.isNotBlank(sensitiveWord)) {
            logMap.put(LogBuildEnum.SENSITIVE_WORD.key, sensitiveWord);
        }
        return this;
    }

    /**
     * 原值
     *
     * @param originValue
     * @return
     */
    public LogBuild originValue(String originValue) {
        if (StringUtils.isNotBlank(originValue)) {
            logMap.put(LogBuildEnum.ORIGIN_VALUE.key, originValue);
        }
        return this;
    }

    /**
     * 当前值
     *
     * @param currentValue
     * @return
     */
    public LogBuild currentValue(String currentValue) {
        if (StringUtils.isNotBlank(currentValue)) {
            logMap.put(LogBuildEnum.CURRENT_VALUE.key, currentValue);
        }
        return this;
    }

    /**
     * 点评id
     *
     * @param commentId
     * @return
     */
    public LogBuild commentId(String commentId) {
        if (StringUtils.isNotBlank(commentId)) {
            logMap.put(LogBuildEnum.COMMENT_ID.key, commentId);
        }
        return this;
    }

    /**
     * 操作
     *
     * @param operator
     * @return
     */
    public LogBuild operator(String operator) {
        if (StringUtils.isNotBlank(operator)) {
            logMap.put(LogBuildEnum.OPERATOR.key, operator);
        }
        return this;
    }

    /**
     * 商户id
     *
     * @param merchantId
     * @return
     */
    public LogBuild merchantId(String merchantId) {
        if (StringUtils.isNotBlank(merchantId)) {
            logMap.put(LogBuildEnum.MERCHANT_ID.key, merchantId);
        }
        return this;
    }

    /**
     * 商户Guid
     *
     * @param merchantGuid
     * @return
     */
    public LogBuild merchantGuid(String merchantGuid) {
        if (StringUtils.isNotBlank(merchantGuid)) {
            logMap.put(LogBuildEnum.MERCHANT_GUID.key, merchantGuid);
        }
        return this;
    }

    /**
     * 标题
     *
     * @param title
     * @return
     */
    public LogBuild title(String title) {
        if (StringUtils.isNotBlank(title)) {
            logMap.put(LogBuildEnum.TITLE.key, title);
        }
        return this;
    }

    /**
     * 收件人
     *
     * @param mailTo
     * @return
     */
    public LogBuild mailTo(String mailTo) {
        if (StringUtils.isNotBlank(mailTo)) {
            logMap.put(LogBuildEnum.MAIL_TO.key, mailTo);
        }
        return this;
    }

    /**
     * 发件人
     *
     * @param mailFrom
     * @return
     */
    public LogBuild mailFrom(String mailFrom) {
        if (StringUtils.isNotBlank(mailFrom)) {
            logMap.put(LogBuildEnum.MAIL_FROM.key, mailFrom);
        }
        return this;
    }

    /**
     * 变化率
     *
     * @param changeRate
     * @return
     */
    public LogBuild changeRate(String changeRate) {
        if (StringUtils.isNotBlank(changeRate)) {
            logMap.put(LogBuildEnum.CHANGE_RATE.key, changeRate);
        }
        return this;
    }

    /**
     * @param landlordId
     * @return
     */
    public LogBuild landlordId(String landlordId) {
        if (StringUtils.isNotBlank(landlordId)) {
            logMap.put(LogBuildEnum.LANDLORD_ID.key, landlordId);
        }
        return this;
    }

    /**
     * 经度
     *
     * @param longitude
     * @return
     */
    public LogBuild longitude(String longitude) {
        if (StringUtils.isNotBlank(longitude)) {
            logMap.put(LogBuildEnum.LONGITUDE.key, longitude);
        }
        return this;
    }

    /**
     * 纬度
     *
     * @param latitude
     * @return
     */
    public LogBuild latitude(String latitude) {
        if (StringUtils.isNotBlank(latitude)) {
            logMap.put(LogBuildEnum.LATITUDE.key, latitude);
        }
        return this;
    }

    /**
     * 经纬度类型
     *
     * @param coordinateType
     * @return
     */
    public LogBuild coordinateType(String coordinateType) {
        if (StringUtils.isNotBlank(coordinateType)) {
            logMap.put(LogBuildEnum.COORDINATE_TYPE.key, coordinateType);
        }
        return this;
    }

    /**
     * 来源
     *
     * @param source
     * @return
     */
    public LogBuild source(String source) {
        if (StringUtils.isNotBlank(source)) {
            logMap.put(LogBuildEnum.SOURCE.key, source);
        }
        return this;
    }

    /**
     * error信息
     *
     * @param error
     * @return
     */
    public LogBuild error(String error) {
        if (StringUtils.isNotBlank(error)) {
            logMap.put(LogBuildEnum.ERROR.key, error);
        }
        return this;
    }

    /**
     * 上架时间
     *
     * @param onlineTime
     * @return
     */
    public LogBuild onlineTime(String onlineTime) {
        if (StringUtils.isNotBlank(onlineTime)) {
            logMap.put(LogBuildEnum.ONLINE_TIME.key, onlineTime);
        }
        return this;
    }

    /**
     * 活动id
     *
     * @param activityId
     * @return
     */
    public LogBuild activityId(String activityId) {
        if (StringUtils.isNotBlank(activityId)) {
            logMap.put(LogBuildEnum.ACTIVITY_ID.key, activityId);
        }
        return this;
    }

    /**
     * key
     *
     * @param key
     * @return
     */
    public LogBuild key(String key) {
        if (StringUtils.isNotBlank(key)) {
            logMap.put(LogBuildEnum.KEY.key, key);
        }
        return this;
    }

    /**
     * 值
     *
     * @param value
     * @return
     */
    public LogBuild value(String value) {
        if (StringUtils.isNotBlank(value)) {
            logMap.put(LogBuildEnum.VALUE.key, value);
        }
        return this;
    }

    /**
     * 参数
     *
     * @param params
     * @return
     */
    public LogBuild params(String params) {
        if (StringUtils.isNotBlank(params)) {
            logMap.put(LogBuildEnum.PARAMS.key, params);
        }
        return this;
    }

    /**
     * 头部信息
     *
     * @param headers
     * @return
     */
    public LogBuild headers(String headers) {
        if (StringUtils.isNotBlank(headers)) {
            logMap.put(LogBuildEnum.HEADERS.key, headers);
        }
        return this;
    }

    /**
     * 线程名
     *
     * @param threadName
     * @return
     */
    public LogBuild threadName(String threadName) {
        if (StringUtils.isNotBlank(threadName)) {
            logMap.put(LogBuildEnum.THREAD_NAME.key, threadName);
        }
        return this;
    }


    /**
     * 返回的消息code
     *
     * @param resultCode
     * @return
     */
    public LogBuild resultCode(String resultCode) {
        if (StringUtils.isNotBlank(resultCode)) {
            logMap.put(LogBuildEnum.RESULT_CODE.key, resultCode);
        }
        return this;
    }

    /**
     * 返回的消息
     *
     * @param resultMessage
     * @return
     */
    public LogBuild resultMessage(String resultMessage) {
        if (StringUtils.isNotBlank(resultMessage)) {
            logMap.put(LogBuildEnum.RESULT_MESSAGE.key, resultMessage);
        }
        return this;
    }

    /**
     * 开始时间
     *
     * @param beginTime
     * @return
     */
    public LogBuild beginTime(String beginTime) {
        if (StringUtils.isNotBlank(beginTime)) {
            logMap.put(LogBuildEnum.BEGIN_TIME.key, beginTime);
        }
        return this;
    }

    /**
     * 结束时间
     *
     * @param endTime
     * @return
     */
    public LogBuild endTime(String endTime) {
        if (StringUtils.isNotBlank(endTime)) {
            logMap.put(LogBuildEnum.END_TIME.key, endTime);
        }
        return this;
    }
    /**
     * 类型
     *
     * @param type
     * @return
     */
    public LogBuild type(String type) {
        if (StringUtils.isNotBlank(type)) {
            logMap.put(LogBuildEnum.TYPE.key, type);
        }
        return this;
    }

    /**
     * 类名
     *
     * @param className
     * @return
     */
    public LogBuild className(String className) {
        if (StringUtils.isNotBlank(className)) {
            logMap.put(LogBuildEnum.CLASS_NAME.key, className);
        }
        return this;
    }

    /**
     * 关键点
     *
     * @param keyPoint
     * @return
     */
    public LogBuild keyPoint(String keyPoint) {
        if (StringUtils.isNotBlank(keyPoint)) {
            logMap.put(LogBuildEnum.KEY_POINT.key, keyPoint);
        }
        return this;
    }

    /**
     * 请求时间
     *
     * @param requestTime
     * @return
     */
    public LogBuild requestTime(String requestTime) {
        if (StringUtils.isNotBlank(requestTime)) {
            logMap.put(LogBuildEnum.REQUEST_TIME.key, requestTime);
        }
        return this;
    }



    @Override
    public String toString() {
        StringBuilder logStr = new StringBuilder();
        if (logMap == null || logMap.size() <= 0) {
            return logStr.toString();
        }
        for (Map.Entry<String, String> log : logMap.entrySet()) {
            logStr.append(String.format("%s=%s;", log.getKey(), log.getValue()));
        }
        logMap.clear();
        return logStr.toString();
    }

    public static void main(String[] s) {
        String ss = LogBuild.instance().traceId("aaaaaaaaaaaaaaa").globalId("bbbbbbbbbbbbbbb").uuid("cccccccccccc").error("sssssssssssss").toString();
        System.out.println(ss);
    }
}


