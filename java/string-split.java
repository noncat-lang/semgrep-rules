class Example {
  void foo(String s) {
    // ruleid:string-split
    "Hello,World".split(",");
    // ruleid:string-split
    s.split(",");
  }
}
