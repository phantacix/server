// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MagicPaper.proto

package com.hifun.soul.proto.common;

public final class MagicPapers {
  private MagicPapers() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MagicPaperOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 paperId = 1;
    boolean hasPaperId();
    int getPaperId();
    
    // required int32 level = 2;
    boolean hasLevel();
    int getLevel();
  }
  public static final class MagicPaper extends
      com.google.protobuf.GeneratedMessage
      implements MagicPaperOrBuilder {
    // Use MagicPaper.newBuilder() to construct.
    private MagicPaper(Builder builder) {
      super(builder);
    }
    private MagicPaper(boolean noInit) {}
    
    private static final MagicPaper defaultInstance;
    public static MagicPaper getDefaultInstance() {
      return defaultInstance;
    }
    
    public MagicPaper getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hifun.soul.proto.common.MagicPapers.internal_static_com_hifun_soul_proto_common_MagicPaper_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hifun.soul.proto.common.MagicPapers.internal_static_com_hifun_soul_proto_common_MagicPaper_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 paperId = 1;
    public static final int PAPERID_FIELD_NUMBER = 1;
    private int paperId_;
    public boolean hasPaperId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getPaperId() {
      return paperId_;
    }
    
    // required int32 level = 2;
    public static final int LEVEL_FIELD_NUMBER = 2;
    private int level_;
    public boolean hasLevel() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getLevel() {
      return level_;
    }
    
    private void initFields() {
      paperId_ = 0;
      level_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasPaperId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLevel()) {
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
        output.writeInt32(1, paperId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, level_);
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
          .computeInt32Size(1, paperId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, level_);
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
    
    public static com.hifun.soul.proto.common.MagicPapers.MagicPaper parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hifun.soul.proto.common.MagicPapers.MagicPaper parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.MagicPapers.MagicPaper parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hifun.soul.proto.common.MagicPapers.MagicPaper parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.MagicPapers.MagicPaper parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hifun.soul.proto.common.MagicPapers.MagicPaper parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.MagicPapers.MagicPaper parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.hifun.soul.proto.common.MagicPapers.MagicPaper parseDelimitedFrom(
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
    public static com.hifun.soul.proto.common.MagicPapers.MagicPaper parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hifun.soul.proto.common.MagicPapers.MagicPaper parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.hifun.soul.proto.common.MagicPapers.MagicPaper prototype) {
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
       implements com.hifun.soul.proto.common.MagicPapers.MagicPaperOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.hifun.soul.proto.common.MagicPapers.internal_static_com_hifun_soul_proto_common_MagicPaper_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.hifun.soul.proto.common.MagicPapers.internal_static_com_hifun_soul_proto_common_MagicPaper_fieldAccessorTable;
      }
      
      // Construct using com.hifun.soul.proto.common.MagicPapers.MagicPaper.newBuilder()
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
        paperId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        level_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.hifun.soul.proto.common.MagicPapers.MagicPaper.getDescriptor();
      }
      
      public com.hifun.soul.proto.common.MagicPapers.MagicPaper getDefaultInstanceForType() {
        return com.hifun.soul.proto.common.MagicPapers.MagicPaper.getDefaultInstance();
      }
      
      public com.hifun.soul.proto.common.MagicPapers.MagicPaper build() {
        com.hifun.soul.proto.common.MagicPapers.MagicPaper result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.hifun.soul.proto.common.MagicPapers.MagicPaper buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.hifun.soul.proto.common.MagicPapers.MagicPaper result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.hifun.soul.proto.common.MagicPapers.MagicPaper buildPartial() {
        com.hifun.soul.proto.common.MagicPapers.MagicPaper result = new com.hifun.soul.proto.common.MagicPapers.MagicPaper(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.paperId_ = paperId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.level_ = level_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.hifun.soul.proto.common.MagicPapers.MagicPaper) {
          return mergeFrom((com.hifun.soul.proto.common.MagicPapers.MagicPaper)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.hifun.soul.proto.common.MagicPapers.MagicPaper other) {
        if (other == com.hifun.soul.proto.common.MagicPapers.MagicPaper.getDefaultInstance()) return this;
        if (other.hasPaperId()) {
          setPaperId(other.getPaperId());
        }
        if (other.hasLevel()) {
          setLevel(other.getLevel());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasPaperId()) {
          
          return false;
        }
        if (!hasLevel()) {
          
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
              paperId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              level_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 paperId = 1;
      private int paperId_ ;
      public boolean hasPaperId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getPaperId() {
        return paperId_;
      }
      public Builder setPaperId(int value) {
        bitField0_ |= 0x00000001;
        paperId_ = value;
        onChanged();
        return this;
      }
      public Builder clearPaperId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        paperId_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 level = 2;
      private int level_ ;
      public boolean hasLevel() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getLevel() {
        return level_;
      }
      public Builder setLevel(int value) {
        bitField0_ |= 0x00000002;
        level_ = value;
        onChanged();
        return this;
      }
      public Builder clearLevel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        level_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.hifun.soul.proto.common.MagicPaper)
    }
    
    static {
      defaultInstance = new MagicPaper(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.hifun.soul.proto.common.MagicPaper)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hifun_soul_proto_common_MagicPaper_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hifun_soul_proto_common_MagicPaper_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020MagicPaper.proto\022\033com.hifun.soul.proto" +
      ".common\",\n\nMagicPaper\022\017\n\007paperId\030\001 \002(\005\022\r" +
      "\n\005level\030\002 \002(\005B*\n\033com.hifun.soul.proto.co" +
      "mmonB\013MagicPapers"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_hifun_soul_proto_common_MagicPaper_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_hifun_soul_proto_common_MagicPaper_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_hifun_soul_proto_common_MagicPaper_descriptor,
              new java.lang.String[] { "PaperId", "Level", },
              com.hifun.soul.proto.common.MagicPapers.MagicPaper.class,
              com.hifun.soul.proto.common.MagicPapers.MagicPaper.Builder.class);
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
