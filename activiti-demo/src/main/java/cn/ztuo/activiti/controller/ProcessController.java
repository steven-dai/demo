package cn.ztuo.activiti.controller;

import lombok.extern.slf4j.Slf4j;
import org.activiti.api.process.model.ProcessDefinition;
import org.activiti.api.process.model.ProcessInstance;
import org.activiti.api.process.model.builders.ProcessPayloadBuilder;
import org.activiti.api.process.runtime.ProcessRuntime;
import org.activiti.api.runtime.shared.query.Page;
import org.activiti.api.runtime.shared.query.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import java.util.List;

/**
 * 工作流——流程相关接口
 * <p>ProcessDefinition代表一个业务流程</p>
 * <p>processInstance是ProcessDefinition一个执行实例</p>
 * @author steven
 * @date 2022/3/23 18:37
 */
@Slf4j
@RestController
@RequestMapping("/process")
public class ProcessController {

    @Resource
    private ProcessRuntime processRuntime;

    /**
     * 查询所有的流程
     * @author steven
     * @date 2022/3/23 13:56
     * @return java.util.List<org.activiti.api.process.model.ProcessDefinition>
     */
    @RequestMapping(value = "" ,method = RequestMethod.GET)
    @RolesAllowed({ "ROLE_ACTIVITI_USER", "ROLE_ACTIVITI_ADMIN","ROLE_ADMIN" })
    public List<ProcessDefinition> listProcessDefinitions(){
        log.info("开始查询系统中所有流程");
        Page<ProcessDefinition> processDefinitionsPage = processRuntime.processDefinitions(Pageable.of(0, 10));
        List<ProcessDefinition> processDefinitions = processDefinitionsPage.getContent();
        log.info("结束查询系统中所有流程：processDefinitions={}",processDefinitions);
        return processDefinitions;
    }

    /**
     * 开启流程
     * @author steven
     * @date 2022/3/24 22:17
     * @param processId 流程ID
     * @param processKey 流程KEY
     * @param businessKey 业务编号
     * @return java.lang.String
     */
    @RequestMapping(value = "" ,method = RequestMethod.POST)
    @RolesAllowed({ "ROLE_ACTIVITI_USER", "ROLE_ACTIVITI_ADMIN" })
    public String startProcess(String processId,String processKey,String businessKey){
        log.info("开启流程，参数：processId={},processKey={},businessKey={}",processId,processKey,businessKey);
        ProcessInstance processInstance = processRuntime.start(ProcessPayloadBuilder
                .start()
                .withProcessDefinitionId(processId)
                .withProcessDefinitionKey(processKey)
                .withName(businessKey)
                .withBusinessKey(businessKey)
                .build()
        );
        String id = processInstance.getId();
        log.info("开启流程结束，ID：{}",id);
        return "SUCCESS";
    }

    /**
     * 挂起流程
     * @author steven
     * @date 2022/3/24 22:24
     * @param processId 流程ID
     * @return java.lang.String
     */
    @RequestMapping(value = "/suspend" ,method = RequestMethod.PATCH)
    @RolesAllowed({ "ROLE_ACTIVITI_USER", "ROLE_ACTIVITI_ADMIN" })
    public String suspendProcess(String processId){
        log.info("挂起流程，参数：processId={}",processId);
        ProcessInstance processInstance = processRuntime.suspend(ProcessPayloadBuilder
                .suspend()
                .withProcessInstanceId(processId)
                .build()
        );
        String status = processInstance.getStatus().name();
        log.info("挂起流程结束，参数：processId={},status={}",processId,status);
        return "SUCCESS";
    }

    /**
     * 激活流程
     * @author steven
     * @date 2022/3/24 22:24
     * @param processId 流程ID
     * @return java.lang.String
     */
    @RequestMapping(value = "/resume" ,method = RequestMethod.PATCH)
    @RolesAllowed({ "ROLE_ACTIVITI_USER", "ROLE_ACTIVITI_ADMIN" })
    public String resumeProcess(String processId){
        log.info("激活流程，参数：processId={}",processId);
        ProcessInstance processInstance = processRuntime.resume(ProcessPayloadBuilder
                .resume()
                .withProcessInstanceId(processId)
                .build()
        );
        String status = processInstance.getStatus().name();
        log.info("激活流程结束，参数：processId={},status={}",processId,status);
        return "SUCCESS";
    }

    /**
     * 删除流程
     * @author steven
     * @date 2022/3/24 22:24
     * @param processId 流程ID
     * @return java.lang.String
     */
    @RequestMapping(value = "" ,method = RequestMethod.DELETE)
    @RolesAllowed({ "ROLE_ACTIVITI_USER", "ROLE_ACTIVITI_ADMIN" })
    public String deleteProcess(String processId){
        log.info("删除流程，参数：processId={}",processId);
        processRuntime.delete(ProcessPayloadBuilder
                .delete()
                .withProcessInstanceId(processId)
                .build()
        );
        log.info("删除流程结束，参数：processId={}",processId);
        return "SUCCESS";
    }


}
