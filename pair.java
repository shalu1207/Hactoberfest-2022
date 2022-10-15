public class pair {
    public static void printpair(int n[]){
        int st=0;
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                System.out.println(n[i]+","+n[j]);
                st++;
            }
            System.out.println();

        }
        System.out.println(st);

    }
    public static void main(String[] args) {
        int n[]={5,4,1,2,3,7};
        printpair(n);

    }
}
