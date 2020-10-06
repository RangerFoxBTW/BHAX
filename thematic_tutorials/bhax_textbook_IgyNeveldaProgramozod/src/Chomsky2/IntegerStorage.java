import java.util.Arrays;

public class IntegerStorage {
	
	private int[] s;
	private int index = 0;
	private int size;
	private boolean sorted = true;
	
	public IntegerStorage(int size) {
		this.size = size;
		this.s = new int[size];
	}
	
	public IntegerStorage(int[] s) {
		this.size = s.length;
		this.index = this.size;
		this.s = s;
		this.sorted = false;
	}
	
	public boolean binary(int number) {
		
		if (!sorted)
			bubble();
		
		int l = 0;
		int r = size - 1;
		
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (s[mid] == number)
				return true;
			if (s[mid] > number)
				r = mid -1;
			else
				l = mid + 1;
		}
		
		return false;
	}
	
	public int[] bubble() {
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < (size - i); j++) {
				if (s[j-1] > s[j]) {
					int t = s[j-1];
					s[j-1] = s[j];
					s[j] = t;
				}
			}
		}
		sorted = true;
		
		return s;
	}

public void add(int number) {
s[index++] = number;
sorted = false;
	}


	@Override
	public String toString() {
		return "IntegerStorage [s=" + Arrays.toString(s) + ", index=" + index + ", size=" + size + ", sorted=" + sorted
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + index;
		result = prime * result + Arrays.hashCode(s);
		result = prime * result + size;
		result = prime * result + (sorted ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IntegerStorage other = (IntegerStorage) obj;
		if (index != other.index)
			return false;
		if (!Arrays.equals(s, other.s))
			return false;
		if (size != other.size)
			return false;
		if (sorted != other.sorted)
			return false;
		return true;
	}
}