class Example {
  void foo(String s) {
    // ruleid:string-replaceFirst
    "Hello".replaceFirst("Hello", s);
    // ruleid:string-replaceFirst
    s.replaceFirst("Hello", "World");
  }
}
