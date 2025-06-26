# AI 超级智能体项目

## 项目简介

本项目是一个基于 Java Spring Boot 和 Vue3 的全栈 AI 智能体应用平台，集成了大模型对话、RAG 知识库、智能体自主规划、工具链调用、MCP 服务等多项前沿 AI 技术。平台支持多轮对话、知识检索、自动化任务执行等功能，适用于 AI 应用开发、智能助手、知识问答等场景。

---

## 项目背景与应用场景

随着大模型和智能体技术的快速发展，AI 应用正逐步从简单问答向复杂推理、自动化任务和多工具协作演进。本项目旨在帮助开发者快速掌握 AI 智能体开发的核心技术，适用于：
- 智能问答/情感陪伴类应用
- 智能办公/自动化助手
- AI 任务规划与执行平台
- AI+RAG 知识检索系统

---

## 主要功能

- **AI 恋爱大师**：多轮情感对话，支持知识库检索与工具调用
- **AI 超级智能体**：自主规划、自动调用多种工具完成复杂任务
- **RAG 知识库**：文档切割、向量化、语义检索
- **工具链调用**：联网搜索、文件操作、网页抓取、PDF 生成等
- **MCP 服务**：图片搜索等模型上下文协议服务
- **实时推送**：SSE 实现前后端实时消息通信

---

## 技术栈

- **后端**：Java 21、Spring Boot 3、Spring AI、LangChain4j、PGvector、Knife4j、Kryo
- **前端**：Vue3、Vite、Axios、SSE
- **数据库**：PostgreSQL + PGvector
- **容器化**：Docker

---

## 主要模块介绍

- **后端主服务**：负责 AI 智能体核心逻辑、RAG 知识库、工具链调用、API 提供等。
- **前端项目**：基于 Vue3，提供智能体交互界面，支持实时对话和任务展示。
- **MCP 服务**：独立的图片搜索服务，支持智能体自动调用。

---

## 目录结构

```
.
├── src/                        # 后端主服务源码
├── yu-ai-agent-frontend/       # 前端项目
├── yu-image-search-mcp-server/ # 图片搜索MCP服务
├── pom.xml                     # Maven 配置
├── Dockerfile                  # 后端 Docker 配置
└── README.md
```

---

## 快速开始

### 1. 启动后端服务

#### Linux/MacOS
```bash
# 方式一：使用 Maven Wrapper
./mvnw spring-boot:run
# 方式二：已安装 Maven
mvn spring-boot:run
```
#### Windows
```powershell
# 方式一：使用 Maven Wrapper
mvnw spring-boot:run
# 方式二：已安装 Maven
mvn spring-boot:run
```
默认端口：`8123`

### 2. 启动图片搜索 MCP 服务

#### Linux/MacOS
```bash
cd yu-image-search-mcp-server
./mvnw spring-boot:run
```
#### Windows
```powershell
cd yu-image-search-mcp-server
mvnw spring-boot:run
```

### 3. 启动前端项目

```bash
cd yu-ai-agent-frontend
npm install
npm run dev
```
默认端口：`5173`

### 4. 访问平台

- 前端开发环境：http://localhost:5173
- 后端接口：http://localhost:8123

---

## 主要接口

- `/api/ai/love_app/chat/sse` —— AI 恋爱大师聊天接口
- `/api/ai/manus/chat` —— AI 超级智能体接口

---

## 亮点与优势

- 支持多种大模型接入与本地/云端部署
- RAG 知识库检索，提升问答准确性
- 智能体自主规划与多工具协作
- MCP 协议服务，易于扩展
- 前后端分离，支持容器化部署

---

## 常见问题 FAQ

**Q1：启动报错"语言级别 '8' 不支持文本块文字"？**
A：请使用 Java 17 或 Java 21 及以上版本，或将所有 `""" ... """` 多行文本块改为普通字符串拼接。

**Q2：前端无法访问后端接口？**
A：请确保后端服务已启动且端口为 8123，或根据实际端口修改前端配置。

**Q3：数据库如何配置？**
A：默认使用 PostgreSQL + PGvector，具体连接信息请参考 `application.yml` 配置文件。

**Q4：如何自定义工具或知识库？**
A：可在后端 `tools` 或 `rag` 目录下扩展实现，参考已有代码结构。

---

## 贡献与社区支持

欢迎提交 Issue 和 PR，或加入交流群共同学习进步！
- 代码仓库：https://github.com/liyupi/yu-ai-agent
- 交流群/技术支持：可在仓库 Issue 区留言，或关注作者公众号/社区

---

## License

MIT

---

如需更详细的开发文档、接口说明或部署细节，可根据实际需求补充。

