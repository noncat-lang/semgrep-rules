class Example {
  void foo(String s) {
    // ruleid:string-replace
    "Hello".replace("Hello", s);
    // ruleid:string-replace
    s.replace("Hello", "World");
  }
}
