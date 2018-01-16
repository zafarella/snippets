def retry[T](n: Short)(retryFunc: => T): T = {
  try {
    retryFunc
  } catch {
    case e if n > 1 =>
      retry(n - 1)(retryFunc)
  }
}

// -----------------
// Usage

retry(3) {
}
