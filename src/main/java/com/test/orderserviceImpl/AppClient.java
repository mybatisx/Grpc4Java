package com.test.orderserviceImpl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import cn.test.grpc.Stream;
import cn.test.grpc.StreamServiceGrpc;
import com.google.common.base.Stopwatch;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class AppClient {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {

	    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8883).usePlaintext(true).build();
		StreamServiceGrpc.StreamServiceBlockingStub stub = StreamServiceGrpc.newBlockingStub(channel);
		Stopwatch watch = Stopwatch.createStarted();

		for (int i = 0; i < 10; i++) {
			var requestData = Stream.RequestData.newBuilder().setText("hello world"+i).build();
			var responseData = stub.simpleFun(requestData);
			System.out.println(responseData.getText());
		}
          watch.stop();
		long time = watch.elapsed(TimeUnit.MILLISECONDS);

		System.out.println("代码执行时长：" + time);

		channel.shutdown();
	}
}
