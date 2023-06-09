// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StockMessage.proto

package com.itcast.bulls.stock.struct.netty.trade;

public interface KlineDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:KlineData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 股票ID
   * </pre>
   *
   * <code>int64 stockId = 1;</code>
   */
  long getStockId();

  /**
   * <pre>
   * 股票编号
   * </pre>
   *
   * <code>string stockCode = 2;</code>
   */
  java.lang.String getStockCode();
  /**
   * <pre>
   * 股票编号
   * </pre>
   *
   * <code>string stockCode = 2;</code>
   */
  com.google.protobuf.ByteString
      getStockCodeBytes();

  /**
   * <pre>
   * K线行情的时间范围（开始时间）
   * </pre>
   *
   * <code>int64 timeStart = 3;</code>
   */
  long getTimeStart();

  /**
   * <pre>
   * K线行情的时间范围（结束时间）
   * </pre>
   *
   * <code>int64 timeEnd = 4;</code>
   */
  long getTimeEnd();
}
