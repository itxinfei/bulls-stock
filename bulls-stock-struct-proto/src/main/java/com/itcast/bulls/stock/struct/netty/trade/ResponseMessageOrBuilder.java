// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StockMessage.proto

package com.itcast.bulls.stock.struct.netty.trade;

public interface ResponseMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ResponseMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 头部消息
   * </pre>
   *
   * <code>.StockHead stockHead = 1;</code>
   */
  boolean hasStockHead();
  /**
   * <pre>
   * 头部消息
   * </pre>
   *
   * <code>.StockHead stockHead = 1;</code>
   */
  com.itcast.bulls.stock.struct.netty.trade.StockHeadProto.StockHead getStockHead();
  /**
   * <pre>
   * 头部消息
   * </pre>
   *
   * <code>.StockHead stockHead = 1;</code>
   */
  com.itcast.bulls.stock.struct.netty.trade.StockHeadProto.StockHeadOrBuilder getStockHeadOrBuilder();

  /**
   * <pre>
   * 返回提示信息
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * 返回提示信息
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * 下单接口的返回数据包
   * </pre>
   *
   * <code>.PlaceOrderResp placeOrderResp = 3;</code>
   */
  boolean hasPlaceOrderResp();
  /**
   * <pre>
   * 下单接口的返回数据包
   * </pre>
   *
   * <code>.PlaceOrderResp placeOrderResp = 3;</code>
   */
  com.itcast.bulls.stock.struct.netty.trade.PlaceOrderResp getPlaceOrderResp();
  /**
   * <pre>
   * 下单接口的返回数据包
   * </pre>
   *
   * <code>.PlaceOrderResp placeOrderResp = 3;</code>
   */
  com.itcast.bulls.stock.struct.netty.trade.PlaceOrderRespOrBuilder getPlaceOrderRespOrBuilder();

  /**
   * <pre>
   * 实时行情的返回数据包
   * </pre>
   *
   * <code>.QuoteRealtimeResp quoteRealtimeResp = 4;</code>
   */
  boolean hasQuoteRealtimeResp();
  /**
   * <pre>
   * 实时行情的返回数据包
   * </pre>
   *
   * <code>.QuoteRealtimeResp quoteRealtimeResp = 4;</code>
   */
  com.itcast.bulls.stock.struct.netty.trade.StockQuoteProto.QuoteRealtimeResp getQuoteRealtimeResp();
  /**
   * <pre>
   * 实时行情的返回数据包
   * </pre>
   *
   * <code>.QuoteRealtimeResp quoteRealtimeResp = 4;</code>
   */
  com.itcast.bulls.stock.struct.netty.trade.StockQuoteProto.QuoteRealtimeRespOrBuilder getQuoteRealtimeRespOrBuilder();

  /**
   * <pre>
   * K线行情的返回数据包
   * </pre>
   *
   * <code>.KlineDataRespLists klineDataRespLists = 5;</code>
   */
  boolean hasKlineDataRespLists();
  /**
   * <pre>
   * K线行情的返回数据包
   * </pre>
   *
   * <code>.KlineDataRespLists klineDataRespLists = 5;</code>
   */
  com.itcast.bulls.stock.struct.netty.trade.StockQuoteProto.KlineDataRespLists getKlineDataRespLists();
  /**
   * <pre>
   * K线行情的返回数据包
   * </pre>
   *
   * <code>.KlineDataRespLists klineDataRespLists = 5;</code>
   */
  com.itcast.bulls.stock.struct.netty.trade.StockQuoteProto.KlineDataRespListsOrBuilder getKlineDataRespListsOrBuilder();

  /**
   * <pre>
   * 获取详情的返回数据包
   * </pre>
   *
   * <code>.GetOrderResp getOrderResp = 6;</code>
   */
  boolean hasGetOrderResp();
  /**
   * <pre>
   * 获取详情的返回数据包
   * </pre>
   *
   * <code>.GetOrderResp getOrderResp = 6;</code>
   */
  com.itcast.bulls.stock.struct.netty.trade.GetOrderResp getGetOrderResp();
  /**
   * <pre>
   * 获取详情的返回数据包
   * </pre>
   *
   * <code>.GetOrderResp getOrderResp = 6;</code>
   */
  com.itcast.bulls.stock.struct.netty.trade.GetOrderRespOrBuilder getGetOrderRespOrBuilder();

  /**
   * <pre>
   * 获取所有持仓的返回数据包
   * </pre>
   *
   * <code>.GetAllPositionList getAllPositionList = 7;</code>
   */
  boolean hasGetAllPositionList();
  /**
   * <pre>
   * 获取所有持仓的返回数据包
   * </pre>
   *
   * <code>.GetAllPositionList getAllPositionList = 7;</code>
   */
  com.itcast.bulls.stock.struct.netty.trade.GetAllPositionList getGetAllPositionList();
  /**
   * <pre>
   * 获取所有持仓的返回数据包
   * </pre>
   *
   * <code>.GetAllPositionList getAllPositionList = 7;</code>
   */
  com.itcast.bulls.stock.struct.netty.trade.GetAllPositionListOrBuilder getGetAllPositionListOrBuilder();

  /**
   * <pre>
   * 获取账户资金总览的数据包
   * </pre>
   *
   * <code>.GetFinanceOverviewResp getFinanceOverviewResp = 8;</code>
   */
  boolean hasGetFinanceOverviewResp();
  /**
   * <pre>
   * 获取账户资金总览的数据包
   * </pre>
   *
   * <code>.GetFinanceOverviewResp getFinanceOverviewResp = 8;</code>
   */
  com.itcast.bulls.stock.struct.netty.trade.GetFinanceOverviewResp getGetFinanceOverviewResp();
  /**
   * <pre>
   * 获取账户资金总览的数据包
   * </pre>
   *
   * <code>.GetFinanceOverviewResp getFinanceOverviewResp = 8;</code>
   */
  com.itcast.bulls.stock.struct.netty.trade.GetFinanceOverviewRespOrBuilder getGetFinanceOverviewRespOrBuilder();

  /**
   * <pre>
   * 获取账户交割单的返回数据包
   * </pre>
   *
   * <code>.GetAccountSettlementRespDataList getAccountSettlementRespDataList = 9;</code>
   */
  boolean hasGetAccountSettlementRespDataList();
  /**
   * <pre>
   * 获取账户交割单的返回数据包
   * </pre>
   *
   * <code>.GetAccountSettlementRespDataList getAccountSettlementRespDataList = 9;</code>
   */
  com.itcast.bulls.stock.struct.netty.trade.GetAccountSettlementRespDataList getGetAccountSettlementRespDataList();
  /**
   * <pre>
   * 获取账户交割单的返回数据包
   * </pre>
   *
   * <code>.GetAccountSettlementRespDataList getAccountSettlementRespDataList = 9;</code>
   */
  com.itcast.bulls.stock.struct.netty.trade.GetAccountSettlementRespDataListOrBuilder getGetAccountSettlementRespDataListOrBuilder();

  public com.itcast.bulls.stock.struct.netty.trade.ResponseMessage.ResponseDataCase getResponseDataCase();
}
