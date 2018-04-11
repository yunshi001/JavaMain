package Development.SystemServices.Configuration;

import java.io.Serializable;

public class MACHINECONFIGURATIONID implements Serializable {
	private String NAME = null;
	private String VALUE = null;
	private String NUMBER = null;
	private String HTML = null;
	private String GROUP = null;
	private String UNIT = null;
	public NumericRange RANGE = null;
	private String FS = null;
	private String PERSISTENT = null;
	private String VISIBLE = null;
	private String RT_CHANGE = null;
	private String ACTIVE = null;

	public boolean hasName() {
		return this.NAME != null;
	}

	public String getName() {
		return hasName() ? this.NAME : "";
	}

	public MACHINECONFIGURATIONID setName(String par_Name) {
		this.NAME = par_Name;
		return this;
	}

	public boolean hasValue() {
		return this.VALUE != null;
	}

	public String getValue() {
		return hasValue() ? this.VALUE : "";
	}

	public MACHINECONFIGURATIONID setValue(String par_Value) {
		this.VALUE = par_Value;
		return this;
	}

	public boolean hasNumber() {
		return this.NUMBER != null;
	}

	public String getNumber() {
		return hasNumber() ? this.NUMBER : "";
	}

	public MACHINECONFIGURATIONID setNumber(String par_Number) {
		this.NUMBER = par_Number;
		return this;
	}

	public boolean hasHtml() {
		return this.HTML != null;
	}

	public String getHtml() {
		return hasHtml() ? this.HTML : "";
	}

	public MACHINECONFIGURATIONID setHtml(String par_Html) {
		this.HTML = par_Html;
		return this;
	}

	public boolean hasGroup() {
		return this.GROUP != null;
	}

	public String getGroup() {
		return hasGroup() ? this.GROUP : "";
	}

	public MACHINECONFIGURATIONID setGroup(String par_Group) {
		this.GROUP = par_Group;
		return this;
	}

	public boolean hasUnit() {
		return this.UNIT != null;
	}

	public String getUnit() {
		return hasUnit() ? this.UNIT : "";
	}

	public MACHINECONFIGURATIONID setUnit(String par_Unit) {
		this.UNIT = par_Unit;
		return this;
	}

	public boolean hasRange() {
		return this.RANGE != null;
	}

	public NumericRange getRange() {
		return this.RANGE;
	}

	public boolean hasFactorySetting() {
		return this.FS != null;
	}

	public boolean isFactorySetting() {
		return getBoolValue(this.FS);
	}

	public MACHINECONFIGURATIONID setFactorySetting(Boolean fs) {
		this.FS = fs.toString();
		return this;
	}

	public boolean hasRuntimeChange() {
		return this.RT_CHANGE != null;
	}

	public boolean isRuntimeChange() {
		return getBoolValue(this.RT_CHANGE);
	}

	public MACHINECONFIGURATIONID setRuntimeChange(Boolean isRuntimeChange) {
		this.RT_CHANGE = isRuntimeChange.toString();
		return this;
	}

	public boolean hasVisible() {
		return this.VISIBLE != null;
	}

	public boolean isVisible() {
		return getBoolValue(this.VISIBLE);
	}

	public MACHINECONFIGURATIONID setVisible(Boolean isVisible) {
		this.VISIBLE = isVisible.toString();
		return this;
	}

	public boolean hasPersistent() {
		return this.PERSISTENT != null;
	}

	public boolean isPersistent() {
		return getBoolValue(this.PERSISTENT);
	}

	public MACHINECONFIGURATIONID setPersistent(Boolean isPersistent) {
		this.PERSISTENT = isPersistent.toString();
		return this;
	}

	public boolean hasActive() {
		return this.ACTIVE != null;
	}

	public boolean isActive() {
		return getBoolValue(this.ACTIVE);
	}

	public MACHINECONFIGURATIONID setActive(boolean isActive) {
		String val = isActive ? "1" : "0";
		this.ACTIVE = val;
		return this;
	}

	public String toString() {
		return this.NAME + " : " + this.VALUE + " : " + this.NUMBER + " : " + this.GROUP + " : " + this.UNIT;
	}

	private boolean getBoolValue(String value) {
		return (value.trim().equals("1")) || (Boolean.valueOf(value).booleanValue());
	}
}