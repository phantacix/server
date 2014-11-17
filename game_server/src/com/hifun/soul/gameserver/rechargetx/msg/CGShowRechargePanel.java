package com.hifun.soul.gameserver.rechargetx.msg;

import org.springframework.stereotype.Component;

import com.hifun.soul.core.msg.MessageType;
import com.hifun.soul.gameserver.common.msg.CGMessage;

/**
 * 打开充值面板
 * 
 * @author SevenSoul
 */
@Component
public class CGShowRechargePanel extends CGMessage{
	
	
	public CGShowRechargePanel (){
	}
	
	
	@Override
	protected boolean readImpl() {
		return true;
	}
	
	@Override
	protected boolean writeImpl() {
		return true;
	}
	
	@Override
	public short getType() {
		return MessageType.CG_SHOW_RECHARGE_PANEL;
	}
	
	@Override
	public String getTypeName() {
		return "CG_SHOW_RECHARGE_PANEL";
	}

	@Override
	public void execute() {
	}
}