package cn.ztuo.activiti.listener;

import cn.ztuo.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.Expression;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 任务指派监听器
 * <p>任务到下一节点前调用，根据流程模型上自定义参数获取对应的部门信息，根据部门信息获取待分配任务的员工集合</p>
 * @author steven
 * @date 2022-03-23 21:31
 */
@Slf4j
@Component
public class AssignmentHandler implements TaskListener {

    // 测试数据，正式环境通过后台管理配置
    Map<String,String> nodeInfo = new HashMap<>();
    {
        nodeInfo.put("node1","685c80489a9e36f6f4be6ae7203dee86");
        nodeInfo.put("node2","7a5b3a18b891f06906e20eb3ff7a3b3a");
        nodeInfo.put("node3","8e5d25888f5946b086249c276c75636f");
    }

    /**
     * 获取流程中自定义参数
     */
    private Expression deptKey;

    @Resource
    private SysUserService sysUserService;

    @Override
    public void notify(DelegateTask delegateTask) {
        // 获取模型节点上的自定义参数值
        String expressionText = deptKey.getExpressionText();
        log.info("任务{}的自定义参数值={}",delegateTask.getName(),expressionText);
        // TODO 根据自定义参数获取可领取任务的部门
        List<String> depts = Arrays.asList(nodeInfo.get(expressionText));
        // TODO 根据部门获取可领取任务的人员
        List<String> users = sysUserService.getUsernamesByDeptIds(depts);
        delegateTask.addCandidateUsers(users);
        log.info("任务{}的接受人是{}",delegateTask.getName(),users);
    }
}
