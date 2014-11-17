package com.hifun.soul.robot.task;

import com.hifun.soul.core.msg.IMessage;
import com.hifun.soul.robot.Robot;

public abstract class BaseRobotTask implements IRobotTask{
	
	/** 第一次执行的延迟时间 */
	public final static int DEFAULT_DELAY = 100;
	
	/** 循环执行时的时间间隔 */
	public final int DEFAULT_INTERVAL = 100;
	
	/** 发起操作的机器人对象 */
	private Robot robot;
	
	private int delay = 0;
	
	private int interval = 0;

	public BaseRobotTask(Robot robot)
	{
		this.robot = robot;
		this.delay = DEFAULT_DELAY;
		this.interval = DEFAULT_INTERVAL;
	}
	
	public BaseRobotTask(Robot robot, int delay, int interval) {
		this.robot = robot;
		this.delay = delay;
		this.interval = interval;
	}
	
	public boolean canDoAction()
	{
		return robot.isCanHandleMsg();
	}
	
	public Robot getRobot() {
		return robot;
	}


	public final int getDelay() {
		return this.delay;
	}

	public final int getPeriod() {
		return this.interval;
	}
	
	public void sendMessage(IMessage msg) {
		getRobot().sendMessage(msg);
	}

	/**
	 * 记录日志信息
	 * 
	 * @param robot
	 * @param msg
	 */
	protected void logInfo(String msg) {
		System.out.println("[Robot] " + this.robot.getPassportId() + " " + msg);
	}
}
