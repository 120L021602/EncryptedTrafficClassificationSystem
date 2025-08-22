# 加密流量分类识别系统 (Encrypted Traffic Classification System)

一个基于深度神经网络的加密流量分类识别系统，能够实时捕获网络数据包并识别QQ、微信和HTTPS流量。该系统包含完整的机器学习模型训练、实时流量捕获、Web展示界面和后端API服务。

## 🚀 项目特性

- **实时流量捕获**: 使用Scapy库实时捕获网络数据包
- **深度学习分类**: 基于DNN模型，准确率达到92.1%
- **多协议支持**: 支持TCP/UDP协议分析
- **Web可视化**: 提供实时数据展示和统计分析
- **RESTful API**: 完整的后端服务接口
- **数据持久化**: MySQL数据库存储分析结果

## 📁 项目结构

```
EncryptedTrafficClassificationSystem/
├── capture.py              # 实时流量捕获和分类
├── model.py                # 深度学习模型定义
├── train.py                # 模型训练脚本
├── utils.py                # 工具函数
├── visualization.py        # 数据可视化脚本
├── model/                  # 训练好的模型文件
│   └── tcdnn.pth
├── dataset/                # 训练和测试数据集
│   ├── qq_train.pcap      # QQ训练数据
│   ├── qq_test.pcap       # QQ测试数据
│   ├── wx_train.pcap      # 微信训练数据
│   ├── wx_test.pcap       # 微信测试数据
│   ├── https_train.pcap   # HTTPS训练数据
│   └── https_test.pcap    # HTTPS测试数据
└── display/                # Web展示系统
    ├── EncryptedTrafficRecognition/  # Spring Boot后端
    │   ├── src/main/java/            # Java源代码
    │   ├── pom.xml                   # Maven配置
    │   └── target/                   # 编译输出
    └── front-end/                    # Vue.js前端
        └── vue-project/              # Vue项目
            ├── src/                  # 源代码
            ├── package.json          # 依赖配置
            └── vite.config.js        # Vite配置
```

## 🛠️ 技术栈

### 机器学习
- **PyTorch**: 深度学习框架
- **Scapy**: 网络数据包处理
- **NumPy**: 数值计算
- **Matplotlib**: 数据可视化

### 后端服务
- **Spring Boot 3.1.0**: Java Web框架
- **Spring Data JPA**: 数据持久化
- **MySQL**: 数据库
- **Maven**: 项目管理

### 前端界面
- **Vue 3**: 前端框架
- **Element Plus**: UI组件库
- **ECharts**: 数据图表
- **Vite**: 构建工具

## 📦 安装要求

### 系统要求
- Python 3.7+
- Java 17+
- MySQL 8.0+
- Node.js 16+

### Python依赖
```bash
pip install torch scapy numpy matplotlib scikit-learn requests
```

### Java环境
- JDK 17+
- Maven 3.6+

### Node.js依赖
```bash
cd display/front-end/vue-project
npm install
```

## 🚀 快速开始

### 1. 环境准备
```bash
# 克隆项目
git clone <repository-url>
cd EncryptedTrafficClassificationSystem

# 安装Python依赖
pip install -r requirements.txt
```

### 2. 数据库配置
在 `display/EncryptedTrafficRecognition/EncryptedTrafficRecognition/src/main/resources/application.properties` 中配置MySQL连接信息：

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/encrypted_traffic
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 3. 启动后端服务
```bash
cd display/EncryptedTrafficRecognition/EncryptedTrafficRecognition
mvn spring-boot:run
```

### 4. 启动前端服务
```bash
cd display/front-end/vue-project
npm run dev
```

### 5. 运行流量捕获
```bash
python capture.py
```

## 📊 模型训练

### 训练数据
系统使用PCAP格式的数据包文件进行训练，包含：
- QQ流量数据
- 微信流量数据  
- HTTPS流量数据

### 训练过程
```bash
python train.py
```

训练参数：
- 批次大小: 64
- 学习率: 0.001
- 训练轮数: 300
- 优化器: SGD

### 模型架构
- 输入层: 100个神经元（数据包前100字节）
- 隐藏层: 90 → 70 → 50 → 30个神经元
- 输出层: 3个神经元（QQ/微信/HTTPS分类）
- 激活函数: ReLU + Softmax

## 🔍 实时流量分析

### 数据包处理流程
1. **捕获**: 使用Scapy实时捕获网络数据包
2. **预处理**: 提取TCP/UDP头部和前100字节
3. **分类**: 使用训练好的DNN模型进行分类
4. **统计**: 统计各类应用的流量数量
5. **存储**: 将结果发送到后端API并存储到数据库

### 支持的协议
- TCP协议
- UDP协议
- 过滤端口: 53(DNS), 1900(SSDP), 12345(API)

## 🌐 Web界面功能

### 实时监控
- 流量统计图表
- 应用分类统计
- 端口使用情况
- 协议分布分析

### 数据展示
- 综合信息展示
- 端口统计信息
- 协议统计信息
- 应用统计信息

### 管理功能
- 数据库清理
- 历史数据查询
- 实时数据更新

## 📡 API接口

### 数据接收
- `POST /api/receive_data`: 接收流量分析数据

### 数据查询
- `GET /api/port_information`: 获取端口信息
- `GET /api/protocol_information`: 获取协议信息
- `GET /api/app_statistics`: 获取应用统计
- `GET /api/port_statistics`: 获取端口统计
- `GET /api/protocol_statistics`: 获取协议统计
- `GET /api/comprehensive_display`: 获取综合信息

### 数据管理
- `GET /api/clear_database`: 清空数据库

## 📈 性能指标

- **分类准确率**: 92.1%
- **实时处理**: 支持毫秒级数据包分析
- **并发处理**: 多线程数据包处理
- **数据吞吐**: 500ms批量发送间隔

## 🔧 配置说明

### 网络接口配置
在 `capture.py` 中修改网络接口名称：
```python
# 使用以太网时移除 iface="WLAN"
sniff(iface="WLAN", ...)
```

### API服务配置
在 `capture.py` 中配置后端服务地址：
```python
API_HOST = "172.20.29.80"
API_PORT = 12345
```

### 数据发送间隔
```python
SEND_INTERVAL_MS = 500  # 500毫秒发送一次数据
```

## 🐛 故障排除

### 常见问题
1. **权限不足**: 确保以管理员权限运行流量捕获
2. **网络接口错误**: 检查网络接口名称是否正确
3. **数据库连接失败**: 验证MySQL服务状态和连接配置
4. **模型加载失败**: 确认模型文件路径和PyTorch版本兼容性

### 日志查看
- 后端日志: 查看Spring Boot控制台输出
- 前端日志: 浏览器开发者工具控制台
- 捕获日志: Python脚本控制台输出

## 🤝 贡献指南

1. Fork 项目
2. 创建特性分支 (`git checkout -b feature/AmazingFeature`)
3. 提交更改 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 开启 Pull Request

## 📄 许可证

本项目采用 MIT 许可证 - 查看 [LICENSE](LICENSE) 文件了解详情

## 📞 联系方式

如有问题或建议，请通过以下方式联系：
- 提交 Issue
- 发送邮件
- 项目讨论区

## 🙏 致谢

感谢所有为项目做出贡献的开发者和研究人员。

---

**注意**: 本项目仅用于教育和研究目的，请遵守相关法律法规和网络使用规范。