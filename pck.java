package Balance;



 class Account{
    int a;
    Account(int amount){
        this.a=amount;
    }

    public void display_balance(){
        System.out.print("BAlance is ="+this.a);
    }


}