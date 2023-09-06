class MyDictionary {
  // Main Driver Method (optional in our modular design)
  public static void main(String args[]) {
    System.out.println("The best way to use this type is to run another app main and instantiate a dictionary in it.");
  }

  public Record Records[];
  private int size = 0;
  private int count = 0;

  public int Size() {
    return size;
  }

  public int Count() {
    return count;
  }

  MyDictionary(int initialSize) {
    Records = new Record[initialSize];
    size = initialSize;
    count = 0;
  }

  public void Insert(double value) {
    if (size > count) {
      Records[count++] = new Record(value);
    } else
      System.out.println("Size" + size + " not enough for holding an extra element after Length: " + count);
  }

  public void Show() {
    System.out.println("Printing Record of Size: " + size + " and Length: " + count);
    for (int i = 0; i < count; i++) {
      System.out.println("Key: " + Records[i].key + ", Value: " + Records[i].value);
    }
  }

  // public void sort() {
  // Scanner sc = new Scanner(System.in);
  // int a = sc.nextInt();
  // int b = sc.nextInt();
  // int c = sc.nextInt();
  // sc.close();
  // int i = 0;
  // while (i < arr.length - 1) {
  // if (general_sol(arr[i]) > general_sol(arr[i + 1])) {
  // int temp = arr[i];
  // arr[i] = arr[i + 1];
  // arr[i + 1] = temp;

  // i = 0;
  // } else
  // i++;
  // }
  // }

  // public int general_sol(int array[]) {

  // return array[0] * x * x + array[1]* x + a;
  // }

  public double get(int k) {
    for (int i = 0; i < count; i++) {
      if (Records[i].key == k) {
        return Records[i].value;
      }
    }
    return 0;
  }

  public Record put(Record record) {
    for (int i = 0; i < count; i++) {
      if (Records[i].key == record.key) {
        return record;
      }
    }
    Records[count] = record;
    return null;
  }

  public Record remove(int k) {
    if(count > 0)
    for (int i = 0; i < count; i++) {
      if (Records[i].key == k) {
        Record temp = Records[i];
        for (int j = i; j < count - 1; j++) {
          Records[i] = Records[i + 1];
        }
        return temp;
      }
    }
    count--;
    return null;
  }

  public int size() {
    return count;
  }

  public boolean isEmpty() {
    if (count == 0)
      return true;
    else
      return false;
  }

  public boolean isFull() {
    if (count == size)
      return true;
    else
      return false;
  }

  public void keys() {
    for (int i = 0; i < count; i++) {
      System.out.print(Records[i].key + " ");
    }
  }

}
