package com.hifun.soul.gameserver.meditation;

import java.util.List;

import com.hifun.soul.core.annotation.AutoCreateClientEnumType;
import com.hifun.soul.core.annotation.ClientEnumComment;
import com.hifun.soul.core.enums.IndexedEnum;
import com.hifun.soul.core.util.EnumUtil;

/**
 * 冥想货币类型
 * 
 * @author yandajun
 * 
 */
@AutoCreateClientEnumType
public enum MeditationCurrencyType implements IndexedEnum {

	/** 金币 */
	@ClientEnumComment(comment = "金币")
	COIN((short) 1, "金币"),
	/** 魔晶 */
	@ClientEnumComment(comment = "魔晶")
	CRYSTAL((short) 2, "魔晶石"),
	/** 培养币 */
	@ClientEnumComment(comment = "培养币")
	TRAIN_COIN((short) 3, "培养币");

	private short type;
	private String desc;

	private static final List<MeditationCurrencyType> indexes = IndexedEnumUtil
			.toIndexes(MeditationCurrencyType.values());

	MeditationCurrencyType(short type, String desc) {
		this.type = type;
		this.desc = desc;
	}

	public short getType() {
		return type;
	}

	public String getDesc() {
		return desc;
	}

	public static MeditationCurrencyType indexOf(final int index) {
		return EnumUtil.valueOf(indexes, index);
	}

	@Override
	public int getIndex() {
		return type;
	}
}
