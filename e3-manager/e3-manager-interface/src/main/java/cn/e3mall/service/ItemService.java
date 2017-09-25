package cn.e3mall.service;

import cn.e3mall.pojo.TbItem;

public interface ItemService {

	//根据商品id查询商品信息
	TbItem getItemById(long itemId);
}
