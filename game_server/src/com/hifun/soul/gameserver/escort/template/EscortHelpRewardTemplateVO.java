package com.hifun.soul.gameserver.escort.template;

import com.hifun.soul.core.annotation.ExcelRowBinding;
import com.hifun.soul.common.exception.TemplateConfigException;
import com.hifun.soul.core.annotation.ExcelCellBinding;
import com.hifun.soul.core.template.TemplateObject;

/**
 * 护送奖励模板
 * 
 * @author SevenSoul
 */

@ExcelRowBinding
public abstract class EscortHelpRewardTemplateVO extends TemplateObject {

	/** 等级差下限 */
	@ExcelCellBinding(offset = 1)
	protected int levelDiffLowest;

	/** 等级差上限 */
	@ExcelCellBinding(offset = 2)
	protected int levelDiffHighest;

	/** 奖励金币系数 */
	@ExcelCellBinding(offset = 3)
	protected float rewardCoinRate;


	public int getLevelDiffLowest() {
		return this.levelDiffLowest;
	}

	public void setLevelDiffLowest(int levelDiffLowest) {
		if (levelDiffLowest < 0) {
			throw new TemplateConfigException(this.getSheetName(), this.getId(),
					2, "[等级差下限]levelDiffLowest的值不得小于0");
		}
		this.levelDiffLowest = levelDiffLowest;
	}
	
	public int getLevelDiffHighest() {
		return this.levelDiffHighest;
	}

	public void setLevelDiffHighest(int levelDiffHighest) {
		if (levelDiffHighest < 0) {
			throw new TemplateConfigException(this.getSheetName(), this.getId(),
					3, "[等级差上限]levelDiffHighest的值不得小于0");
		}
		this.levelDiffHighest = levelDiffHighest;
	}
	
	public float getRewardCoinRate() {
		return this.rewardCoinRate;
	}

	public void setRewardCoinRate(float rewardCoinRate) {
		if (rewardCoinRate == 0) {
			throw new TemplateConfigException(this.getSheetName(), this.getId(),
					4, "[奖励金币系数]rewardCoinRate不可以为0");
		}
		this.rewardCoinRate = rewardCoinRate;
	}
	

	@Override
	public String toString() {
		return "EscortHelpRewardTemplateVO[levelDiffLowest=" + levelDiffLowest + ",levelDiffHighest=" + levelDiffHighest + ",rewardCoinRate=" + rewardCoinRate + ",]";

	}
}