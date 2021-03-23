import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class MMT_Activity {
    @Test
    void getFlightDetails(){
        RestAssured.baseURI = "https://flights-cb.makemytrip.com/api/search-stream-dt?apiCallTimestamp=1616382675781&cc=E&crId=d251de3c-a95d-472a-97c5-9f9cec48302e&creditShellInfo=&cur=INR&currency=inr&forwardFlowRequired=true&it=DEL-BLR-20210322&language=eng&pax=A-1_C-0_I-0&pfm=DESKTOP&region=in&shd=true&sortBy=rhino&src=";
        RequestSpecification httpRequest =  RestAssured.given();

        httpRequest.header("Connection", "keep-alive");
        httpRequest.header("sec-ch-ua", "\"Google Chrome\";v=\"89\", \"Chromium\";v=\"89\", \";Not A Brand\";v=\"99\"");
        httpRequest.header("src", "mmt");
        httpRequest.header("mcid", "38c7757f-87aa-46de-b858-7ddaf13f5055");
        httpRequest.header("app-ver", "1.0.0");
        httpRequest.header("pfm", "DESKTOP");
        httpRequest.header("device-id", "38c7757f-87aa-46de-b858-7ddaf13f5055");
        httpRequest.header("os", "Windows");
        httpRequest.header("cmp-id", "");
        httpRequest.header("ab", "{\"WCM\":1,\"PCRDF\":0,\"PFA\":1,\"OTP\":0,\"mnthn\":false,\"CLS\":0,\"PFI\":1,\"ZC_Server_Side_experiment1\":1,\"CHMRK\":0,\"BFFL\":0,\"FSA\":1,\"PFL\":0,\"BSG\":0,\"LFT\":2,\"PWA\":0,\"PFP\":1,\"DDDF\":1,\"MFEP\":0,\"LISTN\":1,\"DGF\":0,\"flightInfoOptionSequenceKey\":\"FNO\",\"CABS\":1,\"FCN\":false,\"DGT\":3,\"SED\":0,\"ZCA\":0,\"SEM\":0,\"ZCE\":1,\"CABF\":0,\"travellerScan\":0,\"NTD\":1,\"NLA\":0,\"FLK\":0,\"dgi\":0,\"IRR\":0,\"RTM\":0,\"ZCS\":1,\"SNH\":0,\"FLS\":0,\"LPS\":0,\"mal\":0,\"SFN\":0,\"mgsf\":0,\"ZC_Client_Side_exp\":false,\"NUG\":0,\"ALTFLT\":0,\"FUS\":1,\"COU\":0,\"USF\":0,\"MCC\":1,\"MCD\":1,\"ALTFLTCORP\":0,\"BAGR\":1,\"SOR\":0,\"msa\":1,\"ALF\":0,\"MCS\":0,\"PRB\":0,\"msf\":1,\"PRE\":2,\"pwa_login_type\":0,\"NDAST\":0,\"cnpn\":1,\"ITT\":1,\"PBC\":0,\"AMD\":0,\"AME\":0,\"SHR\":0,\"IMB\":0,\"CID\":1,\"bottomsheet_onetap_pwa\":\"1\",\"BNTD\":0,\"mbrt\":0,\"TSC\":0,\"trvlr\":true,\"CAD\":1,\"IMS\":0,\"UMF\":0,\"mbit\":0,\"mdl\":0,\"DTD\":1,\"ANC\":1,\"SIM\":0,\"PTA\":0,\"HLD\":0,\"ANP\":1,\"PTF\":0,\"ALTF\":0,\"cheaperFlightsDesktopDom\":1,\"ANU\":1,\"MFA\":0,\"MFD\":0,\"MFC\":1,\"INT\":1,\"MFEA\":0,\"MFI\":0,\"LLS\":1,\"AOA\":0,\"SRT\":0,\"MFMD\":1,\"BIRT\":0,\"PLS\":1,\"AOD\":0,\"MFP\":1,\"flightPageLoadTracking\":0,\"NHP\":0,\"MFEI\":0,\"GSF\":0,\"AOI\":0,\"MFED\":1,\"msfn\":0,\"QFT\":1,\"MOB\":0,\"AOP\":0,\"BAA\":0,\"AGGRNEW\":0,\"BII\":0,\"ADDONM\":0,\"FAA\":0,\"MFTD\":0,\"BAN\":0,\"CANCT\":0,\"GYOLO\":0,\"APD\":0,\"FAO\":0,\"marc\":0,\"FAT\":0,\"PET\":1,\"EMI\":0,\"BRB\":1,\"RNP\":4}");
        httpRequest.header("currency", "inr");
        httpRequest.header("language", "eng");
        httpRequest.header("x-user-rc", "BANGALORE");
        httpRequest.header("x-user-ip", "171.76.89.144");
        httpRequest.header("profile-type", "PERSONAL");
        httpRequest.header("sec-ch-ua-mobile", "?0");
        httpRequest.header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36");
        httpRequest.header("region", "in");
        httpRequest.header("Accept", "text/event-stream");
        httpRequest.header("mmt-auth", "MAT1771893c0b659ede8fb63a927f637c7f2133a4445af5d2dfc9b8fdd3167949b32019db8c57dc187dce2d0c7f02bbf2722P");
        httpRequest.header("Cache-Control", "no-cache");
        httpRequest.header("Access-Control-Allow-Credentials", "true");
        httpRequest.header("x-user-cc", "IN");
        httpRequest.header("domain", "in");
        httpRequest.header("Origin", "https://www.makemytrip.com");
        httpRequest.header("Sec-Fetch-Site", "same-site");
        httpRequest.header("Sec-Fetch-Mode", "cors");
        httpRequest.header("Sec-Fetch-Dest", "empty");
        httpRequest.header("Referer", "https://www.makemytrip.com/");
        httpRequest.header("Accept-Language", "en-US,en;q=0.9");
        httpRequest.header("Cookie", "_abck=0C4B96A34A642400C64530021A707EB0~-1~YAAQTa1NaPVJ3EZ4AQAAYHsxWAUZ7k3MtcFII1zwqJkKxC9OmJ1GVqrOziUNJU+GsEYxKMIbODSUhJ6o8/wRok2bJTpm3GbtVR8Jzy708AMdNjLolLby8QASXz9azterwyIKU6qDE1jb5n7pLZH5VLfdvegKmVGUS/e/ybKeYXv9KpGEwa6PES5qCyGBrgsEMLalhPT9KabJsBV/N35kriMce3O5Ru16ZLhxJfxcvc2hPQiOm3EHRCAEcit7wU7rvnj+T1m3RZ/NOxgYcX9uKnK5axqniDZdaWhSrF8E/Q3OteDE+9WnTbQS/BUDXvDVCxcSpEzWs00Xo/J4fftaRAp7viOJQo8yTPIgFG07d2mwF/NtcCQM9ddrtYC9Kx+Bqd1l83JOuwhERiOf8paPFZZqsL8fxkRUfz+MKw==~0~-1~-1; ak_bmsc=CE276A5A1D651F59ED25886C49BFDE2E684DAD4D497E00006C1B5860AF76A52C~plkXFvVJzDZKUvJtt/pNh9Y6UWqDIY5K3TTRYnIMbcYBMXkDJv8x5RFKfof1LY0Y1yymS/rWACVNGiKMTGBgVOTVskB4sJsUut5DwL5a1Rh3fy2jUT1E5DRACIDZ2oQwlCdTrAb99uIbYP4COpWqtM62kcz8IA6wu8jArVnWZ8zNuP2Zlk+B3WWYcoD/2ar6u1dvZ1CW5mdv3nv6N10HKjdIyGZceJsNn2BX1vsnjz0pU=; bm_sz=B9A29C181E92BF001F20F8B1B5D4187C~YAAQTa1NaPT+20Z4AQAA3x4rWAu1NDYnderN/PyIC3LFmE/P+Jh1/R1tfJtBoYWEqRvdG7QGRiPnT1XakwVOwGjLcTmgpSqQFyrL5Ttpdo/cp20E1fX6U9QuJNOP9++NTFR6cllJxgdUyxikjRBpb15YtCwtm8o17moSG9UJEfLmpEK5fu+rSa1uAIm5yzTPTfuUwg==; ccde=IN; lang=eng");


        Response response = httpRequest.request(Method.GET);
        System.out.println(response);
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
    }
}
