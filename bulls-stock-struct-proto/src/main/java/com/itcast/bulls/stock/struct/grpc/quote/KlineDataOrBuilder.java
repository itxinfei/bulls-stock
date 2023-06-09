// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/StockKlineService.proto

package com.itcast.bulls.stock.struct.grpc.quote;

public interface KlineDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:KlineData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 产品ID
   * </pre>
   *
   * <code>int64 stockId = 1;</code>
   */
  long getStockId();

  /**
   * <pre>
   * 产品编号
   * </pre>
   *
   * <code>string stockCode = 2;</code>
   */
  java.lang.String getStockCode();
  /**
   * <pre>
   * 产品编号
   * </pre>
   *
   * <code>string stockCode = 2;</code>
   */
  com.google.protobuf.ByteString
      getStockCodeBytes();

  /**
   * <pre>
   * 产品名称
   * </pre>
   *
   * <code>string stockName = 3;</code>
   */
  java.lang.String getStockName();
  /**
   * <pre>
   * 产品名称
   * </pre>
   *
   * <code>string stockName = 3;</code>
   */
  com.google.protobuf.ByteString
      getStockNameBytes();

  /**
   * <pre>
   * 开盘价
   * </pre>
   *
   * <code>int64 priceOpen = 4;</code>
   */
  long getPriceOpen();

  /**
   * <pre>
   * 最高价
   * </pre>
   *
   * <code>int64 priceHigh = 5;</code>
   */
  long getPriceHigh();

  /**
   * <pre>
   * 最低价
   * </pre>
   *
   * <code>int64 priceLow = 6;</code>
   */
  long getPriceLow();

  /**
   * <pre>
   * 收盘价
   * </pre>
   *
   * <code>int64 priceClose = 7;</code>
   */
  long getPriceClose();

  /**
   * <pre>
   * 成交量
   * </pre>
   *
   * <code>int64 volume = 8;</code>
   */
  long getVolume();

  /**
   * <pre>
   * 成交金额
   * </pre>
   *
   * <code>int64 amount = 9;</code>
   */
  long getAmount();

  /**
   * <pre>
   * 报价时间
   * </pre>
   *
   * <code>int64 time = 10;</code>
   */
  long getTime();

  /**
   * <pre>
   * 作日的收盘价
   * </pre>
   *
   * <code>int64 lastClosePrice = 11;</code>
   */
  long getLastClosePrice();
}
