// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/StockFinanceService.proto

package com.itcast.bulls.stock.struct.grpc.trade;

public interface UpdateBalanceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UpdateBalanceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string status = 1;</code>
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 1;</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>int64 accountId = 3;</code>
   */
  long getAccountId();

  /**
   * <pre>
   * 更新的可用资金
   * </pre>
   *
   * <code>int64 balance = 4;</code>
   */
  long getBalance();
}
