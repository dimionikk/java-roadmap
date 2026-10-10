public class PaymentRequest implements Retryable {
    private long amountInCents;
    public PaymentRequest(long amountInCents) {
        this.amountInCents = amountInCents;
    }
    public long getAmountInCents() {
        return amountInCents;
    }
    @Override
    public int maxAttempts() {
        return 5;
    }
}