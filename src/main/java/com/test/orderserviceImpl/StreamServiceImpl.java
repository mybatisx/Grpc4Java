package com.test.orderserviceImpl;

import cn.test.grpc.Stream;
import cn.test.grpc.StreamServiceGrpc;
import cn.test.grpc.StreamServiceGrpc.StreamServiceImplBase;
import io.grpc.stub.StreamObserver;

public class StreamServiceImpl extends StreamServiceImplBase {
    @Override
    public void simpleFun(Stream.RequestData request, StreamObserver<Stream.ResponseData> responseObserver) {
       // super.simpleFun(request, responseObserver);
        System.out.println("请求参数：" + request.getText());
        responseObserver.onNext(Stream.ResponseData.newBuilder().setText("hello gRPC->"+request.getText()).build());
        responseObserver.onCompleted();
    }
}
