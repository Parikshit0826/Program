package class1;


class SingleDimensionArray {
	int[] arr;

// creation of SDA ------------------>O(N)
	public SingleDimensionArray(int size) {
		arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	public void insertionSDA(int index, int value) {
		try {
			if (arr[index] == Integer.MIN_VALUE) {
				arr[index] = value;
				System.out.println("The value" + value + " is inserted");
			} else {
				System.out.println("The cell is already fill");
			}
		} catch (Exception e) {
			System.out.println("Invalid Data");
		}
	}

	public void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void searchByIndex(int index) {// ---->O(1)
		try {
			if (arr[index] != Integer.MIN_VALUE) {
				System.out.println("The value is: " + arr[index]);
			} else {
				System.out.println("No value found");
			}
		} catch (Exception e) {
			System.out.println("Invalid Index");
		}
	}

	public void searchByValue(int searchValue) {// ----->O(N)
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchValue) {
				System.out.println("The value is present in the index of: " + i);
				return;
			}
		}
		System.out.println("The value is not present");
	}

	public void deleteByIndex(int index) {// ---->O(1)
		try {
			if (arr[index] != Integer.MIN_VALUE) {
				arr[index] = Integer.MIN_VALUE;
				System.out.println("The value is deleted");
			} else {
				System.out.println("No value found");
			}
		} catch (Exception e) {
			System.out.println("Invalid Index");
		}
	}

	public void deleteByValue(int searchValue) {// ----->O(N)
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchValue) {
				arr[i] = Integer.MIN_VALUE;
				System.out.println("The value is deleted");
				return;
			}
		}
		System.out.println("The value is not present");
	}
}


public class MainClass {
	public static void main(String[] args) {
		SingleDimensionArray sda = new SingleDimensionArray(5);
		sda.print();
		// R - Read (Search)
        System.out.println("\n\nInserting values:");
        sda.insertionSDA(0, 10);
        sda.insertionSDA(1, 20);
        sda.insertionSDA(2, 30);
        sda.insertionSDA(1, 25); // cell already filled
        sda.insertionSDA(5, 50); // invalid index
        sda.print();

        // U - Update (simply re-insert at index after deletion)
        System.out.println("\n\nUpdating index 1 with value 25:");
        sda.deleteByIndex(1);        // delete old value at index 1
        sda.insertionSDA(1, 25);     // insert new value
        sda.print();

        // R - Read
        System.out.println("\n\nSearching by index:");
        sda.searchByIndex(2);
        sda.searchByIndex(5); // invalid index

        System.out.println("\nSearching by value:");
        sda.searchByValue(30);
        sda.searchByValue(99); // value not present

        // D - Delete
        System.out.println("\n\nDeleting by index 2:");
        sda.deleteByIndex(2);
        sda.print();

        System.out.println("\nDeleting by value 25:");
        sda.deleteByValue(25);
        sda.print();

        System.out.println("\nTrying to delete a non-existing value:");
        sda.deleteByValue(100); // not present
	}

}
