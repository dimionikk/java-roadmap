public interface Retryable {
    abstract int maxAttempts();

    default String retryInfo() {
        return "Retries: " + maxAttempts();
    }


}