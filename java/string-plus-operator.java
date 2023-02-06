class Example {
  void foo(String s) {
    // ruleid:string-plus-operator
    String a = "Hello" + "World";
    // ruleid:string-plus-operator
    String b = "Hello" + s;
    // ruleid:string-plus-operator
    String c = s + "Hello";
    // ruleid:string-plus-operator
    String d = a + b;
    // ruleid:string-plus-operator
    String e = s + 1;
    // ruleid:string-plus-operator
    String f = 1 + s;
    // ok:string-plus-operator
    int g = 1 + 1;

    String h = "Hello";
    // ruleid:string-plus-operator
    h += "World";
    // ruleid:string-plus-operator
    h += a;
    // ruleid:string-plus-operator
    h += 1;
  }
}
