// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/StockPositionService.proto

package com.itcast.bulls.stock.struct.grpc.trade;

public interface GetAllPositionDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetAllPositionData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 主键， 唯一标识
   * </pre>
   *
   * <code>int64 id = 1;</code>
   */
  long getId();

  /**
   * <pre>
   * 交易订单号
   * </pre>
   *
   * <code>int64 tradeOrderId = 2;</code>
   */
  long getTradeOrderId();

  /**
   * <pre>
   * 交易账号ID
   * </pre>
   *
   * <code>int64 accountId = 3;</code>
   */
  long getAccountId();

  /**
   * <pre>
   * 股票ID
   * </pre>
   *
   * <code>int64 stockId = 4;</code>
   */
  long getStockId();

  /**
   * <pre>
   * 成本价
   * </pre>
   *
   * <code>int64 costPrice = 5;</code>
   */
  long getCostPrice();

  /**
   * <pre>
   * 持仓数量
   * </pre>
   *
   * <code>int32 volume = 6;</code>
   */
  int getVolume();

  /**
   * <pre>
   * 股票市场(0: 上交所， 1：深交所，2：港股， 3：美股）
   * </pre>
   *
   * <code>int32 stockMarket = 7;</code>
   */
  int getStockMarket();

  /**
   * <pre>
   * 成交均价
   * </pre>
   *
   * <code>int32 avgPrice = 8;</code>
   */
  int getAvgPrice();

  /**
   * <pre>
   * 可卖数量(T+1制度使用)
   * </pre>
   *
   * <code>int32 validSellVolume = 9;</code>
   */
  int getValidSellVolume();

  /**
   * <pre>
   * 盈亏
   * </pre>
   *
   * <code>int64 profit = 10;</code>
   */
  long getProfit();

  /**
   * <pre>
   * 成交时间
   * </pre>
   *
   * <code>int64 execTime = 11;</code>
   */
  long getExecTime();

  /**
   * <pre>
   * 状态(0:有效，1：无效）
   * </pre>
   *
   * <code>int32 status = 12;</code>
   */
  int getStatus();

  /**
   * <pre>
   * 持仓累计利息
   * </pre>
   *
   * <code>int64 interest = 13;</code>
   */
  long getInterest();

  /**
   * <pre>
   * 最新报价
   * </pre>
   *
   * <code>int64 lastPrice = 14;</code>
   */
  long getLastPrice();

  /**
   * <pre>
   * 盈亏比例
   * </pre>
   *
   * <code>int64 profitRate = 15;</code>
   */
  long getProfitRate();

  /**
   * <pre>
   * 股票代码
   * </pre>
   *
   * <code>string stockCode = 16;</code>
   */
  java.lang.String getStockCode();
  /**
   * <pre>
   * 股票代码
   * </pre>
   *
   * <code>string stockCode = 16;</code>
   */
  com.google.protobuf.ByteString
      getStockCodeBytes();

  /**
   * <pre>
   * 股票名称
   * </pre>
   *
   * <code>string stockName = 17;</code>
   */
  java.lang.String getStockName();
  /**
   * <pre>
   * 股票名称
   * </pre>
   *
   * <code>string stockName = 17;</code>
   */
  com.google.protobuf.ByteString
      getStockNameBytes();
}
