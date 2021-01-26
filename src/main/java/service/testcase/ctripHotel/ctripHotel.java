package service.testcase.ctripHotel;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.apache.log4j.Logger;
import service.Work;
import service.api.user.BaseApi;

import java.util.ArrayList;
import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ctripHotel extends BaseApi {
    private static final Logger logger= Logger.getLogger(ctripHotel.class);

    public Response hotelRoomStaticInfo(String HotelID) {
        //使用HashMap组装请求body体
        HashMap<String, Object> data = new HashMap<>();

        HashMap<String, Object> SearchCandidate = new HashMap<>();
        HashMap<String, Object> Settings = new HashMap<>();
        HashMap<String, Object> PagingSettings = new HashMap<>();
        SearchCandidate.put("HotelID", HotelID);
        String[] RoomIDs= {};
        SearchCandidate.put("RoomIDs",RoomIDs);
        Settings.put("PrimaryLangID","");
        String[] ExtendedNodes = {"RoomTypeInfo.Facilities", "RoomTypeInfo.Pictures", "RoomTypeInfo.Descriptions", "RoomTypeInfo.ChildLimit", "RoomTypeInfo.BroadNet", "RoomTypeInfo.RoomBedInfos", "RoomTypeInfo.BnBHotel", "RoomTypeInfo.RoomTypeTags.ReservedData", "RoomInfo.ApplicabilityInfo", "RoomInfo.Smoking", "RoomInfo.RoomBedInfos", "RoomInfo.RoomFGToPPInfo", "RoomInfo.ChannelLimit", "RoomInfo.ExpressCheckout", "RoomInfo.RoomTags", "RoomInfo.RoomGiftInfos", "RoomInfo.AreaApplicabilityInfo", "RoomInfo.RoomPromotions", "RoomInfo.HotelPromotions", "RoomInfo.MaskCampaignInfos", "RoomInfo.BookingRules", "RoomInfo.RoomTags.HotelDiscount", "RoomInfo.IsNeedCustomerTelephone", "RoomInfo.PropertyList", "RoomInfo.RoomTaxRuleInfos"};
        Settings.put("ExtendedNodes",ExtendedNodes);
        PagingSettings.put("PageSize",1000);
        PagingSettings.put("LastRecordID","");

        data.put("SearchCandidate",SearchCandidate);
        data.put("Settings",Settings);

        ArrayList<HashMap<String, Object>> SearchTags= new ArrayList<>();
        HashMap<String, Object> hm1 = new HashMap<>();
        hm1.put("Code","IsOutputHiddenMaskRoom");
        HashMap<String, Object> hm2 = new HashMap<>();
        hm2.put("Code","IsOutputLimitDestinationRoom");
        SearchTags.add(hm1);
        SearchTags.add(hm2);

        data.put("SearchTags",SearchTags);
        data.put("PagingSettings",PagingSettings);

        logger.info("### 初始化：组装请求body体 ###");

        return given()
                .queryParam("Token", Work.getInstance().getAccessToken())
                .queryParam("AID", "592427")
                .queryParam("SID", "1117839")
                .queryParam("ICODE", "39122604bf0e4b33a9569658cf273161")
                .queryParam("UUID", "f2a623b6-df0a-458e-a550-334e625cae37")
                .queryParam("mode", "1")
                .queryParam("format", "JSON")
                .contentType(ContentType.JSON)
                .body(data)
                .when().log().all()
                .post("http://openservice.ctrip.com/openservice/serviceproxy.ashx")
                .then().log().all()
                .body("ResponseStatus.Ack", equalTo("Success"))
                .extract().response();
    }
}
