package test;

public class Foundation {
    // Define variables with different access modifiers
    private int var1;
    int var2; // default access modifier
    protected int var3;
    public int var4;

    // Constructor to initialize the variables
    public Foundation(int var1, int var2, int var3, int var4) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
    }

    // Getters for the private variable
    public int getVar1() {
        return var1;
    }

    // Setters for the private variable
    public void setVar1(int var1) {
        this.var1 = var1;
    }
}
