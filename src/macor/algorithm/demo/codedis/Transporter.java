package macor.algorithm.demo.codedis;

import com.sun.deploy.nativesandbox.comm.Request;
import com.sun.deploy.nativesandbox.comm.Response;
import sun.net.www.http.HttpClient;

public class Transporter {
    private HttpClient httpClient;

    public Transporter(HttpClient httpClient){
        this.httpClient = httpClient;
    }

    public Response sendRequest(Request request){
        return new Response(1);
    }
}
