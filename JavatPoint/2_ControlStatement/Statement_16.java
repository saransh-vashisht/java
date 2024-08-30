public class Statement_16 {
    public static void main(String[] args) {
        a:
        for(int i=0;i<=10;i++){
        b:
        for(int j=0;j<=15;j++){
        c:
        for(int k=0;k<=20;k++){
            System.out.println(k);
            if (k==5) {
                break a;
            }

        }
        }
        }
    }
    // a:, b:,c: are the labels in the java
    // they are used to identify the loop and makes us more able to use it to get the more control of the multiple nested loops using the break and continue statement in them
}
