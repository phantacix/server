package com.hifun.soul.gameserver.boss.msg;

import org.springframework.stereotype.Component;

import com.hifun.soul.core.msg.MessageType;
import com.hifun.soul.gameserver.common.msg.GCMessage;

/**
 * 鼓舞
 *
 * @author SevenSoul
 */
@Component
public class GCEncourageBossWar extends GCMessage{
	
	/** 鼓舞百分比 */
	private int encourageRate;
	/** 是否已经鼓舞满 */
	private boolean ifFull;

	public GCEncourageBossWar (){
	}
	
	public GCEncourageBossWar (
			int encourageRate,
			boolean ifFull ){
			this.encourageRate = encourageRate;
			this.ifFull = ifFull;
	}

	@Override
	protected boolean readImpl() {
		encourageRate = readInteger();
		ifFull = readBoolean();
		return true;
	}
	
	@Override
	protected boolean writeImpl() {
		writeInteger(encourageRate);
		writeBoolean(ifFull);
		return true;
	}
	
	@Override
	public short getType() {
		return MessageType.GC_ENCOURAGE_BOSS_WAR;
	}
	
	@Override
	public String getTypeName() {
		return "GC_ENCOURAGE_BOSS_WAR";
	}

	public int getEncourageRate(){
		return encourageRate;
	}
		
	public void setEncourageRate(int encourageRate){
		this.encourageRate = encourageRate;
	}

	public boolean getIfFull(){
		return ifFull;
	}
		
	public void setIfFull(boolean ifFull){
		this.ifFull = ifFull;
	}
}