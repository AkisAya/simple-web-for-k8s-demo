一个简单的 web server，用于展示 k8s 的一些核心概念，包括 pod, deployment, replicaSet, service, configMap 等

### 构建镜像
```shell script
sh build.sh
docker build . -t simple-web:1.0
```

### 将应用部署到 k8s 上
[将应用部署到 k8s 上](https://akisaya.github.io/2020/%E5%B0%86%E4%BD%A0%E7%9A%84%E5%BA%94%E7%94%A8%E9%83%A8%E7%BD%B2%E5%9C%A8-K8S-%E4%B8%8A/)
