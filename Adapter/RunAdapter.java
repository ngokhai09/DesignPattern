package DesignPattern.Adapter;

class RunAdapter{
    public static void main(String[] args) {
        User user = new UserImpl("John Smith");
        Customer customer = new UserToCustomer(user);
        testAdapter(customer);
    }
    public static void testAdapter(Customer customer){
        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
    }
}