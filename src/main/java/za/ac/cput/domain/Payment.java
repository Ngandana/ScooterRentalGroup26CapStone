package za.ac.cput.domain;
import java.util.Date;
import java.util.Objects;
public class Payment {
    private long customerId;
    private Date date;
    private int amountPaid;

    private Payment(){}

    private Payment(Builder builder){
        this.customerId = builder.customerId;
        this.date = builder.date;
        this.amountPaid = builder.amountPaid;
    }
    public long getCustomerId() {return customerId;}
    public Date getDate() {return date;}
    public int getAmountPaid() {return amountPaid;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(customerId, payment.customerId) && Objects.equals(date, payment.date) && Objects.equals(amountPaid, payment.amountPaid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, date, amountPaid);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "customerId=" + customerId +
                ", date=" + date +
                ", amountPaid=" + amountPaid +
                '}';
    }
    public static class Builder {
        private long customerId;
        private Date date;
        private int amountPaid;

        public Builder setCustomerId(long customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setDate(Date date) {
            this.date = date;
            return this;
        }

        public Builder setAmountPaid(int amountPaid) {
            this.amountPaid = amountPaid;
            return this;
        }

        public Builder copy(Payment obj){
            this.customerId = obj.customerId;
            this.date = obj.date;
            this.amountPaid = obj.amountPaid;
            return this;
        }
        public Payment build(){return new Payment(this);}

    }

}
