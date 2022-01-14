package site.daishuyang.nacos.controller;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author steven
 * @date 2021-06-01 16:59
 */
@RestController
@RequestMapping("/config")
public class NacosController {
    
    @NacosValue(value = "${name:ztuo}",autoRefreshed = true)
    private String name;
    
    public NacosController() {
    }
    
    @GetMapping("")
    public String getName() {
        return name;
    }
    
    @NacosInjected
    private NamingService namingService;
    
    @GetMapping(value = "/service")
    public List<Instance> get(@RequestParam String serviceName) throws NacosException {
        return namingService.getAllInstances(serviceName);
    }
}
