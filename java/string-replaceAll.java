class Example {
  void foo(String s) {
    // ruleid:string-replaceAll
    "Hello".replaceAll("Hello", s);
    // ruleid:string-replaceAll
    s.replaceAll("Hello", "World");
  }
}
