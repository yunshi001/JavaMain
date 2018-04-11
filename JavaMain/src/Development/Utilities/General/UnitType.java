package Development.Utilities.General;

import Development.OperatingSystemGenerics.Languages.MSGID;

public enum UnitType {

	UNIT_INCH_MM(MSGID.MSG_EMPTY_STRING), UNIT_INCH(MSGID.MSG_NONMETRIC), UNIT_NONE(
			MSGID.MSG_EMPTY_STRING), UNIT_DEGREE(MSGID.MSG_UNIT_DEGREES), UNIT_MINUTE(MSGID.MSG_MIN), UNIT_SECONDS(
					MSGID.MSG_SEC), UNIT_PERCENT(MSGID.MSG_UNIT_PERCENT), UNIT_ENCODER(MSGID.MSG_ENC), UNIT_RPM(
							MSGID.MSG_RPM), UNIT_AXIS(MSGID.MSG_AXIS), UNIT_PSI(
									MSGID.MSG_UNIT_PSI), UNIT_HERTZ(MSGID.MSG_HZ), UNIT_AMPS(
											MSGID.MSG_UNIT_AMPS), UNIT_NM_PER_AMP(MSGID.MSG_UNIT_NM_PER_AMP), UNIT_MM(
													MSGID.MSG_METRIC), UNIT_DEG_C(MSGID.MSG_UNIT_DEG_C), UNIT_DAYS(
															MSGID.MSG_DAYS), UNIT_VOLTS(MSGID.MSG_V), UNIT_GB(
																	MSGID.MSG_GB), UNIT_DEGREE_PER_SECOND_SQUARED(
																			MSGID.MSG_DEG_SEC_SQ), UNIT_DEGREE_PER_SECOND(
																					MSGID.MSG_DEG_SEC), UNIT_DEGREE_PER_REV(
																							MSGID.MSG_DEG_REV), UNIT_MM_PER_SECOND(
																									MSGID.MSG_MM_SEC), UNIT_MM_PER_SECOND_SQUARED(
																											MSGID.MSG_MM_SEC_SQ), UNIT_MM_PER_MINUTE(
																													MSGID.MSG_MM_PER_MIN), UNIT_MM_PER_REV(
																															MSGID.CALCS_MM_PER_REV), UNIT_MS(
																																	MSGID.MSG_MILLISECONDS), UNIT_HOURS(
																																			MSGID.MSG_HOURS), UNIT_REV(
																																					MSGID.MSG_UNIT_REV), UNIT_ENCODER_STEPS(
																																							MSGID.MSG_ENC), UNIT_ENCODER_STEPS_PER_REV(
																																									MSGID.MSG_ENC_PER_REV), UNIT_ENCODER_STEPS_PER_MM(
																																											MSGID.MSG_ENC_PER_MM), UNIT_ENCODER_STEPS_PER_DEGREE(
																																													MSGID.MSG_ENC_PER_DEG), UNIT_KILOWATT(
																																															MSGID.MSG_KW), UNIT_TYPE(
																																																	MSGID.MSG_UNIT_TYPE);

	private final MSGID msgid;

	private UnitType(MSGID str) {
		this.msgid = str;
	}

}
