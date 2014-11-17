package com.hifun.soul.gameserver.timetask.model;

import com.hifun.soul.gameserver.timetask.AbstractDailyTask;
import com.hifun.soul.gameserver.timetask.TimeTaskType;
import com.hifun.soul.gameserver.turntable.manager.HumanTurntableManager;

public class ResetTurntableNumTask extends AbstractDailyTask {

	private HumanTurntableManager manager;
	
	public ResetTurntableNumTask(HumanTurntableManager manager){
		this.manager = manager;
	}
	
	@Override
	public int getTimeTaskType() {
		return TimeTaskType.RESET_TURNTABLE_NUM.getIndex();
	}

	@Override
	public long getLastRunTime() {
		return manager.getLastResetTime();
	}

	@Override
	public void setLastRunTime(long time) {
		manager.setLastResetTime(time);
	}

	@Override
	public boolean needRunMissing() {
		return true;
	}
	
	@Override
	public void run() {
		if(isStop()){
			return;
		}
		
		manager.resetTurntableTime();
	}

}
