class Example {
  void foo(String s) {
    // ruleid:string-substring
    "Hello World".substring(0);
    // ruleid:string-substring
    "Hello World".substring(0, 5);
    // ruleid:string-substring
    s.substring(0);
    // ruleid:string-substring
    s.substring(0, 5);
  }
}
