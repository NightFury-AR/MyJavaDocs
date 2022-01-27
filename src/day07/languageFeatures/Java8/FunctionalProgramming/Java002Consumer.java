package day07.languageFeatures.Java8.FunctionalProgramming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Java002Consumer {
    public static void main(String[] args) {
        Customer cust = new Customer("Tony","98765433210");

        //normal approach
        greetCustomer(cust);

        //consumer approach
        consumerGreet.accept(cust);

        //Bi consumer
        biConsumerGreet.accept(cust,true);
        biConsumerGreet.accept(cust,false);
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello , "+customer.customerName+" we have successfully registered your contact "+customer.customerContactNumber);
    }

    static Consumer<Customer> consumerGreet = customer
            -> System.out.println("Hello , "+customer.customerName+" we have successfully registered your contact "+customer.customerContactNumber);

    static BiConsumer<Customer,Boolean> biConsumerGreet = (customer,showContact)
            -> System.out.println("Hello , "+customer.customerName+" we have successfully registered your contact "+(showContact ? customer.customerContactNumber : "*************"));


    static class Customer {
        private String customerName;
        private String customerContactNumber;
        public Customer(String name,String number) {
            this.customerName=name;
            this.customerContactNumber=number;
        }
    }
}
