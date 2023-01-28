[![semgrep-rules-test](https://github.com/noncat-lang/semgrep-rules/actions/workflows/semgrep-rules-test.yml/badge.svg)](https://github.com/noncat-lang/semgrep-rules/actions/workflows/semgrep-rules-test.yml)

# Noncat Semgrep rules

This repository contains semgrep rules that identify string concatination.

We see string concatation as the root cause of input based vulnerabilities, for which we are looking for a solution with [Noncat](https://github.com/noncat-lang/noncat).
## Usage

Clone this repository, navigate to the root folder of your project, and run the rules with the command:

```shell
semgrep --config /path/to/semgrep-rules/ .
```
