package cn.ztuo.activiti.controller;

import lombok.extern.slf4j.Slf4j;
import org.activiti.api.runtime.shared.query.Page;
import org.activiti.api.runtime.shared.query.Pageable;
import org.activiti.api.task.model.Task;
import org.activiti.api.task.model.builders.TaskPayloadBuilder;
import org.activiti.api.task.runtime.TaskRuntime;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import java.util.List;

/**
 * 工作流——任务相关接口
 * <p>UserTasks需要由用户手动执行</p>
 * <p>ServiceTasks配置了一段代码，每当执行到达这段代码时，代码将被执行</p>
 * <p>SequenceFlows用来连接任务，我们还可以在SequenceFlow上定义条件，这样能在流程中创建条件路径</p>
 * @author steven
 * @date 2022/3/23 18:37
 */
@Slf4j
@RestController
@RequestMapping("/task")
public class TaskController {

    @Resource
    private TaskRuntime taskRuntime;

    /**
     * 查询我的待办任务
     * @author steven
     * @date 2022/3/24 22:37
     * @return java.util.List<org.activiti.api.task.model.Task>
     */
    @RequestMapping(value = "" ,method = RequestMethod.GET)
    @RolesAllowed({ "ROLE_ACTIVITI_USER", "ROLE_ACTIVITI_ADMIN","ROLE_ADMIN" })
    public List<Task> myTasks() {
        log.info("开始查询我的待办任务");
        Page<Task> tasksPage = taskRuntime.tasks(Pageable.of(0, 10));
        List<Task> tasks = tasksPage.getContent();
        log.info("结束查询我的待办任务：tasks={}",tasks);
        return tasks;
    }

    /**
     * 完成待办任务
     * @author steven
     * @date 2022/3/24 22:51
     * @param taskId 任务ID
     * @param agree 是否同意，true-同意，其他-拒绝
     * @param refuseReason 拒绝原因
     * @return java.lang.String
     */
    @RequestMapping(value = "", method= RequestMethod.POST)
    @RolesAllowed({ "ROLE_ACTIVITI_USER", "ROLE_ACTIVITI_ADMIN" })
    public String completeTask(String taskId,String agree,String refuseReason) {
        log.info("完成我的待办任务，参数：taskId={},agree={},refuseReason={}",taskId,agree,refuseReason);
        // 根据ID查询待办任务
        Task task = taskRuntime.task(taskId);
        // 查询任务人是否存在，如果不存在需要先领取任务再完成
        if(task.getAssignee()==null){
            taskRuntime.claim(TaskPayloadBuilder
                    .claim()
                    .withTaskId(taskId)
                    .build()
            );
            log.info("领取任务，taskId={}",taskId);
        }
        taskRuntime.complete(TaskPayloadBuilder
                .complete()
                .withTaskId(taskId)
                .withVariable("agree",agree)
                .build()
        );
        log.info("完成任务，taskId={}",taskId);
        return "SUCCESS";
    }

    /**
     * 删除任务
     * <p>只有任务的拥有者可以删除</p>
     * @author steven
     * @date 2022/3/24 22:50
     * @param taskId 任务ID
     * @return java.lang.String
     */
    @RequestMapping(value = "" ,method = RequestMethod.DELETE)
    @RolesAllowed({ "ROLE_ACTIVITI_USER", "ROLE_ACTIVITI_ADMIN" })
    public String deleteTask(String taskId) {
        log.info("删除任务，参数：taskId={}",taskId);
        taskRuntime.delete(TaskPayloadBuilder
                .delete()
                .withTaskId(taskId)
                .build()
        );
        log.info("删除任务，taskId={}",taskId);
        return "SUCCESS";
    }
}
