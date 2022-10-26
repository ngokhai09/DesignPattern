package DesignPattern.Adapter;

class UserToCustomer implements Customer {
    private User user;
    private String firstName;
    private String lastName;

    
    public UserToCustomer(User user) {
        this.user = user;
        this.setProp();
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    private void setProp(){
        String []split = this.user.getName().split(" ");
        this.setFirstName(split[0]);;
        this.setLastName(split[1]);
    }
}