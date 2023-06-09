// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/StockFinanceService.proto

package com.itcast.bulls.stock.struct.grpc.trade;

/**
 * <pre>
 * 获取账户交易单请求数据结构
 * </pre>
 *
 * Protobuf type {@code GetAccountSettlementRequest}
 */
public  final class GetAccountSettlementRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetAccountSettlementRequest)
    GetAccountSettlementRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAccountSettlementRequest.newBuilder() to construct.
  private GetAccountSettlementRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAccountSettlementRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAccountSettlementRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAccountSettlementRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            accountId_ = input.readInt64();
            break;
          }
          case 16: {

            timeStart_ = input.readInt64();
            break;
          }
          case 24: {

            timeEnd_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.itcast.bulls.stock.struct.grpc.trade.StockFinanceServiceProto.internal_static_GetAccountSettlementRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.itcast.bulls.stock.struct.grpc.trade.StockFinanceServiceProto.internal_static_GetAccountSettlementRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest.class, com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest.Builder.class);
  }

  public static final int ACCOUNTID_FIELD_NUMBER = 1;
  private long accountId_;
  /**
   * <code>int64 accountId = 1;</code>
   */
  public long getAccountId() {
    return accountId_;
  }

  public static final int TIMESTART_FIELD_NUMBER = 2;
  private long timeStart_;
  /**
   * <code>int64 timeStart = 2;</code>
   */
  public long getTimeStart() {
    return timeStart_;
  }

  public static final int TIMEEND_FIELD_NUMBER = 3;
  private long timeEnd_;
  /**
   * <code>int64 timeEnd = 3;</code>
   */
  public long getTimeEnd() {
    return timeEnd_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (accountId_ != 0L) {
      output.writeInt64(1, accountId_);
    }
    if (timeStart_ != 0L) {
      output.writeInt64(2, timeStart_);
    }
    if (timeEnd_ != 0L) {
      output.writeInt64(3, timeEnd_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accountId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, accountId_);
    }
    if (timeStart_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, timeStart_);
    }
    if (timeEnd_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, timeEnd_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest)) {
      return super.equals(obj);
    }
    com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest other = (com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest) obj;

    if (getAccountId()
        != other.getAccountId()) return false;
    if (getTimeStart()
        != other.getTimeStart()) return false;
    if (getTimeEnd()
        != other.getTimeEnd()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ACCOUNTID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAccountId());
    hash = (37 * hash) + TIMESTART_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimeStart());
    hash = (37 * hash) + TIMEEND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimeEnd());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 获取账户交易单请求数据结构
   * </pre>
   *
   * Protobuf type {@code GetAccountSettlementRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetAccountSettlementRequest)
      com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.itcast.bulls.stock.struct.grpc.trade.StockFinanceServiceProto.internal_static_GetAccountSettlementRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.itcast.bulls.stock.struct.grpc.trade.StockFinanceServiceProto.internal_static_GetAccountSettlementRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest.class, com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest.Builder.class);
    }

    // Construct using com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      accountId_ = 0L;

      timeStart_ = 0L;

      timeEnd_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.itcast.bulls.stock.struct.grpc.trade.StockFinanceServiceProto.internal_static_GetAccountSettlementRequest_descriptor;
    }

    @java.lang.Override
    public com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest getDefaultInstanceForType() {
      return com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest build() {
      com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest buildPartial() {
      com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest result = new com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest(this);
      result.accountId_ = accountId_;
      result.timeStart_ = timeStart_;
      result.timeEnd_ = timeEnd_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest) {
        return mergeFrom((com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest other) {
      if (other == com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest.getDefaultInstance()) return this;
      if (other.getAccountId() != 0L) {
        setAccountId(other.getAccountId());
      }
      if (other.getTimeStart() != 0L) {
        setTimeStart(other.getTimeStart());
      }
      if (other.getTimeEnd() != 0L) {
        setTimeEnd(other.getTimeEnd());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long accountId_ ;
    /**
     * <code>int64 accountId = 1;</code>
     */
    public long getAccountId() {
      return accountId_;
    }
    /**
     * <code>int64 accountId = 1;</code>
     */
    public Builder setAccountId(long value) {
      
      accountId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 accountId = 1;</code>
     */
    public Builder clearAccountId() {
      
      accountId_ = 0L;
      onChanged();
      return this;
    }

    private long timeStart_ ;
    /**
     * <code>int64 timeStart = 2;</code>
     */
    public long getTimeStart() {
      return timeStart_;
    }
    /**
     * <code>int64 timeStart = 2;</code>
     */
    public Builder setTimeStart(long value) {
      
      timeStart_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timeStart = 2;</code>
     */
    public Builder clearTimeStart() {
      
      timeStart_ = 0L;
      onChanged();
      return this;
    }

    private long timeEnd_ ;
    /**
     * <code>int64 timeEnd = 3;</code>
     */
    public long getTimeEnd() {
      return timeEnd_;
    }
    /**
     * <code>int64 timeEnd = 3;</code>
     */
    public Builder setTimeEnd(long value) {
      
      timeEnd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timeEnd = 3;</code>
     */
    public Builder clearTimeEnd() {
      
      timeEnd_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GetAccountSettlementRequest)
  }

  // @@protoc_insertion_point(class_scope:GetAccountSettlementRequest)
  private static final com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest();
  }

  public static com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAccountSettlementRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetAccountSettlementRequest>() {
    @java.lang.Override
    public GetAccountSettlementRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAccountSettlementRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAccountSettlementRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAccountSettlementRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.itcast.bulls.stock.struct.grpc.trade.GetAccountSettlementRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

