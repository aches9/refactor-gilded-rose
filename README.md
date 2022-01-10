# 重构「镶金玫瑰商店」

## 开发环境
- JDK11+

## 业务目标
"镶金玫瑰"!这是一家魔兽世界里的小商店。出售的商品也都是高价值的。但不妙的是，随着商品 逐渐接近保质期，它们的价值也不断下滑。你需要开发一个IT系统来更新库存信息。
首先，简单介绍一下我们的系统:
- 所有商品都有一个SellIn值，这是商品距离过期的天数，最好在这么多天之内卖掉
- 所有商品都有一个Quality值，代表商品的价值
- 商品的SellIn值和Quality值，它们每天会发生变化，但是会有特例
  商品的价格规则说明如下:
- 商品的价值永远不会小于0，也永远不会超过50
- 商品每过一天价值会下滑1点 ，一旦过了保质期，价值就以双倍的速度下滑
- 陈年干酪(Aged Brie)是一种特殊的商品，放得越久，价值反而越高
- 萨弗拉斯(Sulfuras)是一种传奇商品，没有保质期的概念，价值也不会下滑
- 后台门票(Backstage pass)和陈年干酪(Aged Brie)有相似之处:
	- 越接近演出日，商品的价值反而上升
	- 在演出前10天，价值每天上升2点
	- 演出前5天，价值每天上升3点
	- 一旦过了演出日，价值就马上变成0

## 编码路线

## 参考资料
- [JUnit 5用户指南](https://gitee.com/liushide/junit5_cn_doc/blob/master/junit5UserGuide_zh_cn.md#https://gitee.com/link?target=https%3A%2F%2Fgithub.com%2Fjunit-team%2Fjunit5-samples%2Ftree%2Fr5.0.2%2Fjunit5-gradle-consumer)
- [Gradle 用户指南](https://docs.gradle.org/current/userguide/userguide.html)