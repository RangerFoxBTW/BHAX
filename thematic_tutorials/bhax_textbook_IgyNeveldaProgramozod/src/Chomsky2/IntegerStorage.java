import java.util.Arrays;

public class IntegerStorage {
	
	private int[] storage;
	private int index = 0;
	private int size;
	private boolean sorted = true;
	
	public IntegerStorage(int size) {
		this.size = size;
		this.storage = new int[size];
	}
	
	public IntegerStorage(int[] s) {
		this.size = s.length;
		this.index = this.size;
		this.storage = s;
		this.sorted = false;
	}
	
	public boolean search(int number) {
		
		if (!sorted)
			sort();
		
		int left = 0;
		int right = size - 1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (storage[mid] == number)
				return true;
			if (storage[mid] > number)
				right = mid -1;
			else
				left = mid + 1;
		}
		
		return false;
	}
	
	public int[] sort() {
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < (size - i); j++) {
				if (storage[j-1] > storage[j]) {
					int t = storage[j-1];
					storage[j-1] = storage[j];
					storage[j] = t;
				}
			}
		}
		sorted = true;
		
		return storage;
	}

public void add(int number) {
storage[index++] = number;
sorted = false;
	}


	@Override
	public String toString() {
		return "IntegerStorage [s=" + Arrays.toString(storage) + ", index=" + index + ", size=" + size + ", sorted=" + sorted
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + index;
		result = prime * result + Arrays.hashCode(storage);
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
		if (!Arrays.equals(storage, other.storage))
			return false;
		if (size != other.size)
			return false;
		if (sorted != other.sorted)
			return false;
		return true;
	}
}