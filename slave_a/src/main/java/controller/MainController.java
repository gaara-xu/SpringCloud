package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/sa")
    public String maintoslave() {
        List<ServiceInstance> list = discoveryClient.getInstances("slave_a");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getHost());
        }
        return "this is slave_a";
    }
}
