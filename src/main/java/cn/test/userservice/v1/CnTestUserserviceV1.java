// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn.test.userservice.v1.proto

package cn.test.userservice.v1;

public final class CnTestUserserviceV1 {
  private CnTestUserserviceV1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cn_test_userservice_v1_RequestData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cn_test_userservice_v1_RequestData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cn_test_userservice_v1_ResponseData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cn_test_userservice_v1_ResponseData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034cn.test.userservice.v1.proto\022\026cn.test." +
      "userservice.v1\032\034google/api/annotations.p" +
      "roto\"\033\n\013RequestData\022\014\n\004name\030\001 \001(\t\"\034\n\014Res" +
      "ponseData\022\014\n\004text\030\001 \001(\t2~\n\013UserService\022o" +
      "\n\tSimpleFun\022#.cn.test.userservice.v1.Req" +
      "uestData\032$.cn.test.userservice.v1.Respon" +
      "seData\"\027\202\323\344\223\002\021\022\017/v1/test/{name}B\002P\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_cn_test_userservice_v1_RequestData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cn_test_userservice_v1_RequestData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cn_test_userservice_v1_RequestData_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_cn_test_userservice_v1_ResponseData_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cn_test_userservice_v1_ResponseData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cn_test_userservice_v1_ResponseData_descriptor,
        new java.lang.String[] { "Text", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
