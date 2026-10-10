

public record Money(long cents, String currency) {
    public Money plus(Money other) {
        return new Money(this.cents + other.cents, this.currency);
    }

}