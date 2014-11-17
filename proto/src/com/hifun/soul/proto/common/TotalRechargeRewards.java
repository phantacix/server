// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TotalRechargeReward.proto

package com.hifun.soul.proto.common;

public final class TotalRechargeRewards {
  private TotalRechargeRewards() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TotalRechargeRewardOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 gradeId = 1;
    boolean hasGradeId();
    int getGradeId();
    
    // required int32 remainRewardNum = 2;
    boolean hasRemainRewardNum();
    int getRemainRewardNum();
    
    // required int32 rewardState = 3;
    boolean hasRewardState();
    int getRewardState();
  }
  public static final class TotalRechargeReward extends
      com.google.protobuf.GeneratedMessage
      implements TotalRechargeRewardOrBuilder {
    // Use TotalRechargeReward.newBuilder() to construct.
    private TotalRechargeReward(Builder builder) {
      super(builder);
    }
    private TotalRechargeReward(boolean noInit) {}
    
    private static final TotalRechargeReward defaultInstance;
    public static TotalRechargeReward getDefaultInstance() {
      return defaultInstance;
    }
    
    public TotalRechargeReward getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hifun.soul.proto.common.TotalRechargeRewards.internal_static_com_hifun_soul_proto_common_TotalRechargeReward_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hifun.soul.proto.common.TotalRechargeRewards.internal_static_com_hifun_soul_proto_common_TotalRechargeReward_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 gradeId = 1;
    public static final int GRADEID_FIELD_NUMBER = 1;
    private int gradeId_;
    public boolean hasGradeId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getGradeId() {
      return gradeId_;
    }
    
    // required int32 remainRewardNum = 2;
    public static final int REMAINREWARDNUM_FIELD_NUMBER = 2;
    private int remainRewardNum_;
    public boolean hasRemainRewardNum() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getRemainRewardNum() {
      return remainRewardNum_;
    }
    
    // required int32 rewardState = 3;
    public static final int REWARDSTATE_FIELD_NUMBER = 3;
    private int rewardState_;
    public boolean hasRewardState() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getRewardState() {
      return rewardState_;
    }
    
    private void initFields() {
      gradeId_ = 0;
      remainRewardNum_ = 0;
      rewardState_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasGradeId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRemainRewardNum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRewardState()) {
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
        output.writeInt32(1, gradeId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, remainRewardNum_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, rewardState_);
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
          .computeInt32Size(1, gradeId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, remainRewardNum_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, rewardState_);
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
    
    public static com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward parseDelimitedFrom(
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
    public static com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward prototype) {
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
       implements com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeRewardOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.hifun.soul.proto.common.TotalRechargeRewards.internal_static_com_hifun_soul_proto_common_TotalRechargeReward_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.hifun.soul.proto.common.TotalRechargeRewards.internal_static_com_hifun_soul_proto_common_TotalRechargeReward_fieldAccessorTable;
      }
      
      // Construct using com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward.newBuilder()
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
        gradeId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        remainRewardNum_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        rewardState_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward.getDescriptor();
      }
      
      public com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward getDefaultInstanceForType() {
        return com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward.getDefaultInstance();
      }
      
      public com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward build() {
        com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward buildPartial() {
        com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward result = new com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.gradeId_ = gradeId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.remainRewardNum_ = remainRewardNum_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.rewardState_ = rewardState_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward) {
          return mergeFrom((com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward other) {
        if (other == com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward.getDefaultInstance()) return this;
        if (other.hasGradeId()) {
          setGradeId(other.getGradeId());
        }
        if (other.hasRemainRewardNum()) {
          setRemainRewardNum(other.getRemainRewardNum());
        }
        if (other.hasRewardState()) {
          setRewardState(other.getRewardState());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasGradeId()) {
          
          return false;
        }
        if (!hasRemainRewardNum()) {
          
          return false;
        }
        if (!hasRewardState()) {
          
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
              gradeId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              remainRewardNum_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              rewardState_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 gradeId = 1;
      private int gradeId_ ;
      public boolean hasGradeId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getGradeId() {
        return gradeId_;
      }
      public Builder setGradeId(int value) {
        bitField0_ |= 0x00000001;
        gradeId_ = value;
        onChanged();
        return this;
      }
      public Builder clearGradeId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        gradeId_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 remainRewardNum = 2;
      private int remainRewardNum_ ;
      public boolean hasRemainRewardNum() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getRemainRewardNum() {
        return remainRewardNum_;
      }
      public Builder setRemainRewardNum(int value) {
        bitField0_ |= 0x00000002;
        remainRewardNum_ = value;
        onChanged();
        return this;
      }
      public Builder clearRemainRewardNum() {
        bitField0_ = (bitField0_ & ~0x00000002);
        remainRewardNum_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 rewardState = 3;
      private int rewardState_ ;
      public boolean hasRewardState() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getRewardState() {
        return rewardState_;
      }
      public Builder setRewardState(int value) {
        bitField0_ |= 0x00000004;
        rewardState_ = value;
        onChanged();
        return this;
      }
      public Builder clearRewardState() {
        bitField0_ = (bitField0_ & ~0x00000004);
        rewardState_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.hifun.soul.proto.common.TotalRechargeReward)
    }
    
    static {
      defaultInstance = new TotalRechargeReward(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.hifun.soul.proto.common.TotalRechargeReward)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hifun_soul_proto_common_TotalRechargeReward_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hifun_soul_proto_common_TotalRechargeReward_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031TotalRechargeReward.proto\022\033com.hifun.s" +
      "oul.proto.common\"T\n\023TotalRechargeReward\022" +
      "\017\n\007gradeId\030\001 \002(\005\022\027\n\017remainRewardNum\030\002 \002(" +
      "\005\022\023\n\013rewardState\030\003 \002(\005B3\n\033com.hifun.soul" +
      ".proto.commonB\024TotalRechargeRewards"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_hifun_soul_proto_common_TotalRechargeReward_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_hifun_soul_proto_common_TotalRechargeReward_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_hifun_soul_proto_common_TotalRechargeReward_descriptor,
              new java.lang.String[] { "GradeId", "RemainRewardNum", "RewardState", },
              com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward.class,
              com.hifun.soul.proto.common.TotalRechargeRewards.TotalRechargeReward.Builder.class);
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
