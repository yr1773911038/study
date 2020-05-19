import com.alibaba.fastjson.JSONObject;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpURL;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;

import java.io.File;
import java.io.IOException;

public class HttpClientDemo {
    public static void main(String[] args) throws Exception {
        //test1();
        //test2();
        // test3();
        //test4();
        //test11();
        test12();
    }

    public static void test4() throws Exception{
        HttpClient client = new HttpClient();
        String url ="http://localhost:8080/helloDemo";
        PostMethod postMethod = new PostMethod(url);
        //postMethod.setQ
        JSONObject object = new JSONObject();
        object.put("hh","hello");
        object.put("ww","world");
        StringRequestEntity entity = new StringRequestEntity(object.toJSONString(), "application/json", "UTF-8");
        postMethod.setRequestEntity(entity);
        postMethod.addRequestHeader("Content-Type","application/json;charset=UTF-8");
        int i = client.executeMethod(postMethod);
        String responseBodyAsString = postMethod.getResponseBodyAsString();
        System.out.printf("test:"+responseBodyAsString);
    }

    public static void test3() throws Exception{
        HttpClient httpClient = new HttpClient();
        String url = "http://localhost:8080/test3";
        PostMethod postMethod = new PostMethod(url);
        JSONObject data = new JSONObject();
        data.put("data1","data1");
        data.put("fullName","账单");

        //postMethod.addRequestHeader("Content-Type","multipart/form-data;charset=UTF-8");
        postMethod.addRequestHeader("guid","guid");

        //StringRequestEntity entity = new StringRequestEntity(data.toJSONString(), "application/json", "UTF-8");
        StringPart p1 = new StringPart("name1","val1","UTF-8");
        FilePart fp = new FilePart("formFile",new File("C:\\Users\\yanran\\Desktop\\hello.txt"));
        Part[] parts = {p1,fp};

        MultipartRequestEntity entity = new MultipartRequestEntity(parts,postMethod.getParams());
        postMethod.setRequestEntity(entity);
        int i = httpClient.executeMethod(postMethod);
        String responseBodyAsString = postMethod.getResponseBodyAsString();
        System.out.printf("test:"+responseBodyAsString);
    }


    public static void test2() throws Exception{
        HttpClient httpClient = new HttpClient();
        String url = "http://localhost:8080/test2";
        PostMethod postMethod = new PostMethod(url);
        JSONObject data = new JSONObject();
        data.put("data1","data1");
        data.put("fullName","账单");

        postMethod.addRequestHeader("Content-Type","application/json;charset=UTF-8");
        postMethod.addRequestHeader("guid","guid");

        StringRequestEntity entity = new StringRequestEntity(data.toJSONString(), "application/json", "UTF-8");
        postMethod.setRequestEntity(entity);
        int i = httpClient.executeMethod(postMethod);
        String responseBodyAsString = postMethod.getResponseBodyAsString();
        System.out.printf("test:"+responseBodyAsString);
    }

    public static void test1() throws IOException {
        HttpClient httpClient = new HttpClient();
        String url = "http://localhost:8080/test?guid=guid&fullName=账单";
        //PostMethod postMethod = new PostMethod(url);
        PostMethod postMethod = new PostMethod();
        //URI uri = new URI(url,"UTF-8");
        URI uri = new HttpURL(url,"UTF-8");
        //httpClient.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET,"UTF-8");
        //postMethod.getParams().setContentCharset("UTF-8");
        //postMethod.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET,"UTF-8");
        postMethod.setURI(uri);
        postMethod.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=UTF-8");
        postMethod.addRequestHeader("guid","guid");
       // postMethod.setRequestBody(new NameValuePair[]{new NameValuePair("fullName","账单")});
        int i = httpClient.executeMethod(postMethod);
        String responseBodyAsString = postMethod.getResponseBodyAsString();
        System.out.printf("re:"+responseBodyAsString);
    }

    public static void test11() throws IOException {
        HttpClient httpClient = new HttpClient();
        String url = "http://localhost:8080/test11";
        //PostMethod postMethod = new PostMethod(url);
        NameValuePair[] nameValuePairs = new  NameValuePair[1];
        NameValuePair nameValuePair = new NameValuePair();
        nameValuePair.setName("gg");
        nameValuePair.setValue("hh");
        nameValuePairs[0]=nameValuePair;
        PostMethod postMethod = new PostMethod();
        //URI uri = new URI(url,"UTF-8");
        URI uri = new HttpURL(url,"UTF-8");
        //httpClient.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET,"UTF-8");
        //postMethod.getParams().setContentCharset("UTF-8");
        //postMethod.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET,"UTF-8");
        postMethod.setURI(uri);
        postMethod.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=UTF-8");
        postMethod.addRequestHeader("guid","guid");
        postMethod.setRequestBody(nameValuePairs);
        // postMethod.setRequestBody(new NameValuePair[]{new NameValuePair("fullName","账单")});
        int i = httpClient.executeMethod(postMethod);
        String responseBodyAsString = postMethod.getResponseBodyAsString();
        System.out.printf("re:"+responseBodyAsString);
    }

    public static void test12() throws IOException {
        HttpClient httpClient = new HttpClient();
        String url = "http://localhost:8080/test12";
        //PostMethod postMethod = new PostMethod(url);
        NameValuePair[] nameValuePairs = new  NameValuePair[1];
        NameValuePair nameValuePair = new NameValuePair();
        nameValuePair.setName("gg");
        nameValuePair.setValue("hh");
        nameValuePairs[0]=nameValuePair;
        PostMethod postMethod = new PostMethod();
        //URI uri = new URI(url,"UTF-8");
        URI uri = new HttpURL(url,"UTF-8");
        //httpClient.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET,"UTF-8");
        //postMethod.getParams().setContentCharset("UTF-8");
        //postMethod.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET,"UTF-8");
        postMethod.setURI(uri);
        postMethod.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=UTF-8");
        postMethod.addRequestHeader("guid","guid");
        postMethod.addParameters(nameValuePairs);
        // postMethod.setRequestBody(new NameValuePair[]{new NameValuePair("fullName","账单")});
        int i = httpClient.executeMethod(postMethod);
        String responseBodyAsString = postMethod.getResponseBodyAsString();
        System.out.printf("re:"+responseBodyAsString);
    }
}
