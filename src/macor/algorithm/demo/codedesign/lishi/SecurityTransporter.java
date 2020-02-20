package macor.algorithm.demo.codedesign.lishi;

import com.sun.deploy.nativesandbox.comm.Request;
import com.sun.deploy.nativesandbox.comm.Response;
import sun.net.www.http.HttpClient;

/**
 * 里式替换原则代码
 */
public class SecurityTransporter extends Transporter {
    private String appId;
    private String appToken;

    public SecurityTransporter(HttpClient httpClient, String appId, String appToken) {
        super(httpClient);
        this.appId = appId;
        this.appToken = appToken;
    }

    @Override
    public Response sendRequest(Request request) {

        if(appId != null && appToken != null){
            //request.addPayload("app-id", appId);
            //request.addPayload("app-token", appToken);
        }
        return super.sendRequest(request);
    }
}
