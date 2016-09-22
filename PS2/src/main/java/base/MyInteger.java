package base;

public class MyInteger {
	public static void main(String[] args) {
	}

	public MyInteger(int iValue) {
		this.value = iValue;
	}

	int value;

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		if (value % 2 == 0)
			return true;
		return false;
	}

	public boolean isOdd() {
		if (value % 2 != 0)
			return true;
		return false;
	}

	public boolean isPrime() {
		int i = 0;
		for (i = 2; i <= value / 2; i++) {
			if (value % i != 0)
				return true;
		}
		return false;
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0)
			return true;
		return false;
	}

	public static boolean isOdd(int value) {
		if (value % 2 != 0)
			return true;
		return false;
	}

	public static boolean isPrime(int value) {
		for (int i = 2; i <= value / 2; i++) {
			if (value % i != 0)
				return true;
		}
		return false;
	}

	public static boolean isEven(MyInteger myInteger) {
		return myInteger.isEven();
	}

	public static boolean isOdd(MyInteger myInteger) {
		return myInteger.isOdd();
	}

	public static boolean isPrime(MyInteger myInteger) {
		return myInteger.isPrime();
	}

	public boolean equals(int intValue) {
		return value == intValue;
	}

	public boolean equals(MyInteger myInteger) {
		return this.equals(myInteger.getValue());
	}
}



