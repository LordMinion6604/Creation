class DictionaryApp {
  // Provides only a main method for instantiating and demonstrating a dictionary
  public static void main(String args[]) {
    int size = Integer.parseInt(args[0]);
    int length = Integer.parseInt(args[1]);
    MyDictionary d = new MyDictionary(size);
    String elems[] = java.util.Arrays.copyOfRange(args, 2, args.length);
    for(int i=0; i < length; i++) {
      d.Insert(Double.parseDouble((elems[i])));
    }
    d.Show();
  }
}
