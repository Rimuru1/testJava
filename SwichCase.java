public class SwichCase{
    public static void main(String[] args) {
        int num = 3;
        switch (num){
        case 1:
            System.out.println ("Case1 : Value is:" + num);
        case 2:
            System.out.println ("Case2 : Value is:" + num);
            break;
        case 3:
            System.out.println ("Case3 : Value is:" + num);
            break;
        default:
            System.out.println ("Default: Value is:"+ num);
    }
}
}