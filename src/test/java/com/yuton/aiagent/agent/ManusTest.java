package com.yuton.aiagent.agent;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManusTest {

    @Resource
    private Manus manus;

    @Test
    public void run() {
        String userPrompt = "你是恋爱大师，请帮我为以下用户生成一份恋爱建议：" +
                "\n" +
                "用户：小明，25岁，性格内向，最近和女朋友吵架了。" +
                "\n" +
                "请给出详细的建议，并以 PDF 格式输出";
        String answer = manus.run(userPrompt);
        Assertions.assertNotNull(answer);
    }
}
