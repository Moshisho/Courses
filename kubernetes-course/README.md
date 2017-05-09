# kubernetes-course

### Pre-requisite
1. Install docker
2. 

Before the commands we need to 

Commands to run on host for k8s to work:
~~~~
docker run -d \
    --net=host \
    gcr.io/google_containers/etcd:2.0.9 \
    /usr/local/bin/etcd \
        --addr=127.0.0.1:4001 \
        --bind-addr=0.0.0.0:4001 \
        --data-dir=/var/etcd/data

docker run -d \
    --net=host \
    -v /var/run/docker.sock:/var/run/docker.sock \
    jetstack/hyperkube:v0.20.1 \
    /hyperkube kubelet \
        --api_servers=http://localhost:8080 \
        --v=2 \
        --address=0.0.0.0 \
        --enable_server \
        --hostname_override=127.0.0.1 \
        --config=/etc/kubernetes/manifests

docker run -d \
   --net=host \
   --privileged \
   jetstack/hyperkube:v0.20.1 \
   /hyperkube proxy \
        --master=http://127.0.0.1:8080 \
        --v=2


wget https://storage.googleapis.com/kubernetes-release/release/v0.20.1/bin/linux/amd64/kubectl
chmod u+x kubectl
sudo  mv kubectl /usr/local/bin/
~~~~

YAML list: 
-a
-b
YAML dictionary:
-a: 1
-b: 2
