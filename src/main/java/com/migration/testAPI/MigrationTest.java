package com.migration.testAPI;

import com.migration.dao.Job;
import com.migration.dao.Node;
import com.migration.dao.ScheduledJob;
import com.migration.response.CommonReturnType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;

@RestController
@RequestMapping("/testAPI/migration")
public class MigrationTest {

    @RequestMapping("startMigration")
    @ResponseBody
    public CommonReturnType startMigration(@RequestParam(name = "userId") String uid,
                                           @RequestParam(name = "taskID")String sid) {

        String get_id = uid;
        String get_task = sid;

        Job job = new Job(
                "2A8C52FEF16ACEDA", "成功迁移", "5AED05F1B78DC040CD00D82143CEF425", 1, null,
                new Date().getTime()+21l, new Date().getTime()+100l, 32l, 47l,
                79l
        );
        return CommonReturnType.create(job);
    }

    @RequestMapping("startScheduledMigration")
    @ResponseBody
    public CommonReturnType startScheduledMigration(@RequestParam(name = "userId") String uid,
                                           @RequestParam(name = "taskID")String sid) {

        String get_id = uid;
        String get_task = sid;

        HashMap<String, Node> map = new HashMap<>();
        map.put("Node-1", new Node("A16FB5563F3E8D34", "Running", 2));
        map.put("Node-2", new Node("7F811FB01BA69362", "Running", 2));
        map.put("Node-3", new Node("2D0A6BD9B2D3A71F", "Running", 1));
        map.put("Node-4", new Node("A64D466202CF96C8", "Running", 1));


        ScheduledJob job = new ScheduledJob(
                "1DA1A4D4E6C17CB4", "成功迁移", "5AED05F1B78DC040CD00D82143CEF425", 1, map,
                new Date().getTime()+2323l, new Date().getTime()+1003131l, 5234524l, 4,0,
                "链路正常，已转移至下一节点"
        );
        return CommonReturnType.create(job);
    }
}
