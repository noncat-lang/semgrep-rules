class Example {
  void foo(String s) {
    // ruleid:string-concat
    "Hello".concat("World");
    // ruleid:string-concat
    s.concat("World");
  }
}
