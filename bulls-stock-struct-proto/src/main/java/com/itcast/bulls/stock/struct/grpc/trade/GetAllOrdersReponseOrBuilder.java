// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/StockTradeDealService.proto

package com.itcast.bulls.stock.struct.grpc.trade;

public interface GetAllOrdersReponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetAllOrdersReponse)
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
   * <code>repeated .GetOrderReponse getOrderReponse = 3;</code>
   */
  java.util.List<com.itcast.bulls.stock.struct.grpc.trade.GetOrderReponse> 
      getGetOrderReponseList();
  /**
   * <code>repeated .GetOrderReponse getOrderReponse = 3;</code>
   */
  com.itcast.bulls.stock.struct.grpc.trade.GetOrderReponse getGetOrderReponse(int index);
  /**
   * <code>repeated .GetOrderReponse getOrderReponse = 3;</code>
   */
  int getGetOrderReponseCount();
  /**
   * <code>repeated .GetOrderReponse getOrderReponse = 3;</code>
   */
  java.util.List<? extends com.itcast.bulls.stock.struct.grpc.trade.GetOrderReponseOrBuilder> 
      getGetOrderReponseOrBuilderList();
  /**
   * <code>repeated .GetOrderReponse getOrderReponse = 3;</code>
   */
  com.itcast.bulls.stock.struct.grpc.trade.GetOrderReponseOrBuilder getGetOrderReponseOrBuilder(
      int index);
}
