# 

## Model
www.msaez.io/#/storming/c6079d2196f709a359b2cfb807939f32

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- Drive
- Collaboration
- Video Processing
- User Management


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- Drive
```
 http :8088/files File ID="File ID" File Name="File Name" File Type="File Type" File Size="File Size" File Path="File Path" File Owner="File Owner" File Access="File Access" 
```
- Collaboration
```
 http :8088/documents Document ID="Document ID" Document Name="Document Name" Document Type="Document Type" Document Owner="Document Owner" Document Access="Document Access" 
```
- Video Processing
```
 http :8088/videos Video ID="Video ID" Video Name="Video Name" Video Type="Video Type" Video Size="Video Size" Video Path="Video Path" Video Owner="Video Owner" Video Access="Video Access" 
```
- User Management
```
 http :8088/users User ID="User ID" User Name="User Name" User Email="User Email" User Password="User Password" User Role="User Role" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

