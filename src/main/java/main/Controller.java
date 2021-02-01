package main;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value ("${spring.application.name}") private String appName;


    @GetMapping("/")
    public String index() {
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "this is " + appName;
    }

//    @RequestMapping("/deploy/success")
//    public String deploySuccess() {
//        monitor.getSuccessDeployCount().increment();
//        Random random = new Random();
//        int amount = random.nextInt(100);
//        monitor.getDeployTimeSum().record(amount);
//        return "部署成功";
//
//    }

//    @RequestMapping("/deploy/failed")
//    public String deployFailed() {
//        monitor.getFailedDeployCount().increment();
//        return "部署失败";
//
//    }

//    @RequestMapping("/deploy/success/app-a")
//    public String deploySuccess() {
//        Long time = System.currentTimeMillis();
//        monitor.getSuccessDeployCount("op", "app-a", time,"deploy", "alpha").increment();
//        Random random = new Random();
//        int amount = random.nextInt(100);
//        monitor.getDeployTimeSum("op", "app-a", time,"deploy", "alpha").record(amount);
//        return "部署成功";
//
//    }
//
//    @RequestMapping("/deploy/success/app-b")
//    public String deploySuccess1() {
//        Long time = System.currentTimeMillis();
//        monitor.getSuccessDeployCount("op", "app-b", time,"deploy", "beta").increment();
//        Random random = new Random();
//        int amount = random.nextInt(100);
//        monitor.getDeployTimeSum("op", "app-b", time,"deploy", "beta").record(amount);
//        return "部署成功";
//
//    }
//
//    @RequestMapping("/deploy/success/app-c")
//    public String deploySuccess2() {
//        Long time = System.currentTimeMillis();
//        monitor.getSuccessDeployCount("enos", "app-c", time,"build", "alpha").increment();
//        Random random = new Random();
//        int amount = random.nextInt(100);
//        monitor.getDeployTimeSum("enos", "app-c", time,"build", "alpha").record(amount);
//        return "部署成功";
//
//    }
//
//    @RequestMapping("/deploy/failed/app-c")
//    public String deployfailed() {
//        Long time = System.currentTimeMillis();
//        monitor.getFailedDeployCount("enos", "app-c", time,"build", "alpha").increment();
//        return "部署失败";
//
//    }
//
//    @RequestMapping("/deploy/failed/app-a")
//    public String deployfailed1() {
//        Long time = System.currentTimeMillis();
//        monitor.getFailedDeployCount("op", "app-a", time,"deploy", "alpha").increment();
//        return "部署失败";
//
//    }
//    @RequestMapping("/deploy/failed/app-b")
//    public String deployfailed2() {
//        Long time = System.currentTimeMillis();
//        monitor.getFailedDeployCount("op", "app-b", time,"deploy", "beta").increment();
//        return "部署失败";
//
//    }
//
//    @RequestMapping("/deploy/success/app-a/beta")
//    public String deploySuccess4() {
//        Long time = System.currentTimeMillis();
//        monitor.getSuccessDeployCount("op", "app-a", time,"deploy", "beta").increment();
//        Random random = new Random();
//        int amount = random.nextInt(100);
//        monitor.getDeployTimeSum("op", "app-a", time,"deploy", "beta").record(amount);
//        return "部署成功";
//
//    }

    @RequestMapping("/hello")
    public String clear() {
        return "hello world !!";
    }





}
