package Development.SystemServices.Configuration;

import java.io.Serializable;

public class NumericRange implements Serializable {
	private RangeValue min;
	private RangeValue max;

	public class RangeValue implements Serializable {
		double value;
		Boolean inclusive = Boolean.valueOf(true);

		public RangeValue(double value) {
			this.value = value;
			this.inclusive = Boolean.valueOf(true);
		}

		public String toString() {
			return "value: " + this.value + "  INCLUSIVE: " + this.inclusive;
		}
	}

	public NumericRange() {
		this.min = new RangeValue(-1.7976931348623157E308D);
		this.max = new RangeValue(Double.MAX_VALUE);
	}

	public boolean isInRange(double dval) {
		boolean retVal = true;

		int minCompare = Double.compare(dval, this.min.value);
		int maxCompare = Double.compare(dval, this.max.value);
		if ((minCompare < 0) || (maxCompare > 0)) {
			retVal = false;
		} else if (((minCompare == 0) && (!this.min.inclusive.booleanValue()))
				|| ((maxCompare == 0) && (!this.max.inclusive.booleanValue()))) {
			retVal = false;
		}
		return retVal;
	}

	public double getMinValue() {
		return this.min.value;
	}

	public void setMinValue(double value, boolean inclusive) {
		this.min.value = value;
		this.min.inclusive = Boolean.valueOf(inclusive);
	}

	public double getMaxValue() {
		return this.max.value;
	}

	public void setMaxValue(double value, boolean inclusive) {
		this.max.value = value;
		this.max.inclusive = Boolean.valueOf(inclusive);
	}
	

}
