package com.yuton.aiagent.tools;

import org.springframework.ai.tool.annotation.Tool;

/**
 * 终止工具（作用是让自主规划智能体能够合理地中断）
 */
public class TerminateTool {

    @Tool(description = "终止当前智能体的执行，返回最终结果")
    public String doTerminate() {
        return "任务结束";
    }
}
