package main;

import com.envisioniot.enos.ecp.harbor.client.HarborClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.xml.bind.SchemaOutputResolver;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class Controller {

    @Autowired
    RetryService retryService;



    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


    @RequestMapping("/test1")
        public void index() {
            try {
                Object o = retryService.testdeploy();
                if(false){

                }else {
                    System.out.println("test if");
                }
            }catch (ResourceAccessException e){
                if (e.getCause() instanceof SocketTimeoutException) {
                    System.out.println("Request timed out");
                }
                System.out.println("socket timasdase out");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.getMessage().contains("Read timasdasded out"));
                System.out.println(e.getClass());
            }

        }

        @RequestMapping("/")
        public String index1() {
            return "hello"
            System.out.println("end");
        }
}
