docker build -t ali-config .

docker stop ali-config

docker rm -f ali-config

docker run -p 8888:8888 --name ali-config \
-e LC_ALL=C.UTF-8 \
-e TZ=Asia/Shanghai \
-v /etc/localtime:/etc/localtime:ro \
-d ali-config