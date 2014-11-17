// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CostNotify.proto

package com.hifun.soul.proto.common;

public final class CostNotifyDatas {
  private CostNotifyDatas() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CostNotifyDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 costNotifyType = 1;
    boolean hasCostNotifyType();
    int getCostNotifyType();
    
    // required bool open = 2;
    boolean hasOpen();
    boolean getOpen();
  }
  public static final class CostNotifyData extends
      com.google.protobuf.GeneratedMessage
      implements CostNotifyDataOrBuilder {
    // Use CostNotifyData.newBuilder() to construct.
    private CostNotifyData(Builder builder) {
      super(builder);
    }
    private CostNotifyData(boolean noInit) {}
    
    private static final CostNotifyData defaultInstance;
    public static CostNotifyData getDefaultInstance() {
      return defaultInstance;
    }
    
    public CostNotifyData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hifun.soul.proto.common.CostNotifyDatas.internal_static_com_hifun_soul_proto_common_CostNotifyData_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hifun.soul.proto.common.CostNotifyDatas.internal_static_com_hifun_soul_proto_common_CostNotifyData_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 costNotifyType = 1;
    public static final int COSTNOTIFYTYPE_FIELD_NUMBER = 1;
    private int costNotifyType_;
    public boolean hasCostNotifyType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getCostNotifyType() {
      return costNotifyType_;
    }
    
    // required bool open = 2;
    public static final int OPEN_FIELD_NUMBER = 2;
    private boolean open_;
    public boolean hasOpen() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public boolean getOpen() {
      return open_;
    }
    
    private void initFields() {
      costNotifyType_ = 0;
      open_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasCostNotifyType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOpen()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, costNotifyType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, open_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, costNotifyType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, open_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.hifun.soul.proto.common.CostNotifyDatas.internal_static_com_hifun_soul_proto_common_CostNotifyData_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.hifun.soul.proto.common.CostNotifyDatas.internal_static_com_hifun_soul_proto_common_CostNotifyData_fieldAccessorTable;
      }
      
      // Construct using com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        costNotifyType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        open_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData.getDescriptor();
      }
      
      public com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData getDefaultInstanceForType() {
        return com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData.getDefaultInstance();
      }
      
      public com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData build() {
        com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData buildPartial() {
        com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData result = new com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.costNotifyType_ = costNotifyType_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.open_ = open_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData) {
          return mergeFrom((com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData other) {
        if (other == com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData.getDefaultInstance()) return this;
        if (other.hasCostNotifyType()) {
          setCostNotifyType(other.getCostNotifyType());
        }
        if (other.hasOpen()) {
          setOpen(other.getOpen());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasCostNotifyType()) {
          
          return false;
        }
        if (!hasOpen()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              costNotifyType_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              open_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 costNotifyType = 1;
      private int costNotifyType_ ;
      public boolean hasCostNotifyType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getCostNotifyType() {
        return costNotifyType_;
      }
      public Builder setCostNotifyType(int value) {
        bitField0_ |= 0x00000001;
        costNotifyType_ = value;
        onChanged();
        return this;
      }
      public Builder clearCostNotifyType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        costNotifyType_ = 0;
        onChanged();
        return this;
      }
      
      // required bool open = 2;
      private boolean open_ ;
      public boolean hasOpen() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public boolean getOpen() {
        return open_;
      }
      public Builder setOpen(boolean value) {
        bitField0_ |= 0x00000002;
        open_ = value;
        onChanged();
        return this;
      }
      public Builder clearOpen() {
        bitField0_ = (bitField0_ & ~0x00000002);
        open_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.hifun.soul.proto.common.CostNotifyData)
    }
    
    static {
      defaultInstance = new CostNotifyData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.hifun.soul.proto.common.CostNotifyData)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hifun_soul_proto_common_CostNotifyData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hifun_soul_proto_common_CostNotifyData_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020CostNotify.proto\022\033com.hifun.soul.proto" +
      ".common\"6\n\016CostNotifyData\022\026\n\016costNotifyT" +
      "ype\030\001 \002(\005\022\014\n\004open\030\002 \002(\010B.\n\033com.hifun.sou" +
      "l.proto.commonB\017CostNotifyDatas"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_hifun_soul_proto_common_CostNotifyData_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_hifun_soul_proto_common_CostNotifyData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_hifun_soul_proto_common_CostNotifyData_descriptor,
              new java.lang.String[] { "CostNotifyType", "Open", },
              com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData.class,
              com.hifun.soul.proto.common.CostNotifyDatas.CostNotifyData.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
