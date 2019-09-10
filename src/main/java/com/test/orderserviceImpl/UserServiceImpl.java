package com.test.orderserviceImpl;


import cn.test.grpc.UserServiceGrpc;
import cn.test.grpc.UserServiceOuterClass;
import io.grpc.stub.StreamObserver;

public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {
    @Override
    public void simpleFun(UserServiceOuterClass.RequestData request, StreamObserver<UserServiceOuterClass.ResponseData> responseObserver) {
       // super.simpleFun(request, responseObserver);
        System.out.println("请求参数：" + request.getName());
        responseObserver.onNext(UserServiceOuterClass.ResponseData.newBuilder().setText("hello gRPC->"+request.getName()).build());
        responseObserver.onCompleted();
    }
}
