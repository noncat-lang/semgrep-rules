class Example {
  void foo(String s) {
    // ruleid:string-formatted
    "%s".formatted(s);
    // ruleid:string-formatted
    s.formatted("Hello");
  }
}
