package com.test.orderserviceImpl;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class AppServer {
	private static int port = 8883;

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("---- Server for Learning gRPC ----");

		// create server instance
		Server server = ServerBuilder.forPort(port)
				// add the implementation to the server
				//.addService(new CalculateServiceImpl())
				.addService(new StreamServiceImpl())
				.build();

		// starting the server
		server.start();
		System.out.println("Server start success on port:" + port);
		// stopping the server
		Runtime.getRuntime().addShutdownHook(new Thread( () -> {
			System.out.println("Received Shutdown Request");
			server.shutdown();
			System.out.println("Successfully Stopped the Server");
		} ));

		// in gRPC this server needs to be blocking to the main thread
		server.awaitTermination();
	}
}
